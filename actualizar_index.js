// actualizar_index.js

const fs = require('fs');
const path = require('path');
const xml2js = require('xml2js');
const { JSDOM } = require('jsdom');

const reportsDir = path.join(__dirname, 'target', 'surefire-reports');
const indexPath = path.join(__dirname, 'index.html');

// 1. Leer y analizar todos los reportes XML de forma detallada
async function analizarReportes() {
    if (!fs.existsSync(reportsDir)) {
        console.error('Directorio de reportes no encontrado. Ejecuta "mvn test" primero.');
        return null;
    }

    const reportFiles = fs.readdirSync(reportsDir).filter(f => f.endsWith('.xml'));
    let totalPasados = 0;
    let totalFallados = 0;
    const ejercicios = [];

    for (const file of reportFiles) {
        const xmlData = fs.readFileSync(path.join(reportsDir, file));
        const report = await xml2js.parseStringPromise(xmlData);
        
        const testsuite = report.testsuite;
        const nombreClase = testsuite.$.name.replace('_test', '.java');
        const fallosEnArchivo = parseInt(testsuite.$.failures, 10) + parseInt(testsuite.$.errors, 10);

        const testsIndividuales = [];
        if (testsuite.testcase) { // Asegurarse de que existan testcases
            for (const testcase of testsuite.testcase) {
                let status = 'Pasado';
                let mensaje = '';

                if (testcase.failure) {
                    status = 'Fallado';
                    mensaje = testcase.failure[0].$.message;
                } else if (testcase.error) {
                    status = 'Fallado';
                    mensaje = testcase.error[0].$.message;
                }

                if (status === 'Pasado') {
                    totalPasados++;
                } else {
                    totalFallados++;
                }

                testsIndividuales.push({
                    nombre: testcase.$.name,
                    status: status,
                    mensaje: mensaje
                });
            }
        }
        
        ejercicios.push({
            nombre: nombreClase,
            statusGeneral: fallosEnArchivo === 0 ? 'Pasado' : 'Fallado',
            tests: testsIndividuales
        });
    }
    
    // Ordenar ejercicios alfabéticamente
    ejercicios.sort((a, b) => a.nombre.localeCompare(b.nombre));

    const totalTests = totalPasados + totalFallados;
    return { totalPasados, totalFallados, totalTests, ejercicios };
}

// 2. Actualizar el archivo index.html con la nueva estructura
async function actualizarHTML(stats) {
    if (!stats) return;

    const html = fs.readFileSync(indexPath, 'utf8');
    const dom = new JSDOM(html);
    const document = dom.window.document;

    // Actualizar contadores
    document.getElementById('tests-pasados').textContent = stats.totalPasados;
    document.getElementById('tests-fallados').textContent = stats.totalFallados;
    document.getElementById('total-tests').textContent = stats.totalTests;

    // Actualizar la fecha
    const ahora = new Date();
    const fechaFormateada = `${ahora.toLocaleDateString()} ${ahora.toLocaleTimeString()}`;
    document.getElementById('fecha-actualizacion').textContent = fechaFormateada;
    
    // Actualizar el título de la lista
    const tituloLista = document.querySelector('.exercises-list h2');
    tituloLista.textContent = `Lista de Ejercicios (${stats.ejercicios.length}/13)`;
    if(stats.ejercicios.length === 13 && stats.totalFallados === 0){
        tituloLista.textContent += ' - ¡Completado!';
    }


    // Reconstruir la lista de ejercicios con menús desplegables
    const listaDiv = document.getElementById('lista-ejercicios');
    listaDiv.innerHTML = ''; // Limpiar la lista existente

    stats.ejercicios.forEach(ej => {
        const details = document.createElement('details');
        details.className = 'exercise-details';

        const summary = document.createElement('summary');
        summary.className = 'exercise-summary';
        
        const nombreSpan = document.createElement('span');
        nombreSpan.className = 'exercise-name';
        nombreSpan.textContent = ej.nombre;

        const statusSpan = document.createElement('span');
        statusSpan.className = `status ${ej.statusGeneral.toLowerCase()}`;
        statusSpan.textContent = ej.statusGeneral;
        
        summary.appendChild(nombreSpan);
        summary.appendChild(statusSpan);
        details.appendChild(summary);

        const testList = document.createElement('ul');
        testList.className = 'test-case-list';

        ej.tests.forEach(test => {
            const li = document.createElement('li');
            li.className = `test-case-item status-${test.status.toLowerCase()}`;
            li.textContent = `${test.nombre}`;
            if (test.status === 'Fallado') {
                const errorSpan = document.createElement('span');
                errorSpan.className = 'error-message';
                errorSpan.textContent = ` Assertion Failed: ${test.mensaje}`;
                li.appendChild(errorSpan);
            }
            testList.appendChild(li);
        });

        details.appendChild(testList);
        listaDiv.appendChild(details);
    });

    // Escribir el nuevo HTML al archivo
    fs.writeFileSync(indexPath, dom.serialize());
    console.log(`✅ index.html actualizado: ${stats.totalPasados} pasados, ${stats.totalFallados} fallados.`);
}

// Ejecutar el proceso
analizarReportes().then(actualizarHTML);