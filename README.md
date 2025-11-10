# Java Tutor TICS - Ejercicios de Programación

**Estudiante:** Diego Lozano Camargo
**Matrícula:** 230110530
**Email:** 230110530@itsoeh.edu.mx

---

## 📚 Descripción del Proyecto

Este repositorio contiene una colección de ejercicios de programación en Java 21 orientados a estudiantes de primer semestre de Ciencias Computacionales. Cada ejercicio incluye:

- ✅ Código fuente completo de la solución
- ✅ Pruebas unitarias
- ✅ Diagrama de flujo
- ✅ Esqueleto del código para que el estudiante practique
- ✅ Documentación HTML interactiva

---

## 🚀 Requisitos del Sistema

- **Java:** JDK 21 (LTS)
- **Maven:** 3.6 o superior (para gestión de dependencias y ejecución de pruebas)
- **Graphviz:** (Opcional) Para regenerar diagramas de flujo desde archivos `.dot`

---

## 📦 Estructura del Proyecto

```
java-tutor-tics/
├── src/
│   ├── main/java/com/tutortics/     # Código fuente de soluciones
│   └── test/java/com/tutortics/     # Pruebas unitarias
├── diagramas/                        # Diagramas de flujo (.dot y .png)
├── ejercicios/                       # Páginas HTML de cada ejercicio
├── images/                           # Recursos de imágenes
├── Styles/                           # Hojas de estilo CSS
├── index.html                        # Página principal con reporte
├── pom.xml                           # Configuración de Maven
└── README.md                         # Este archivo
```

---

## 🔧 Compilación y Ejecución

### Compilar todo el proyecto

```bash
mvn clean compile
```

### Ejecutar un ejercicio específico

#### Ejemplo: Ejecutar el Ejemplo 1.13 (Promedio de Calificaciones)

```bash
mvn exec:java -Dexec.mainClass="com.tutortics.ejemplo_1_13"
```

### Ejecutar todas las pruebas

```bash
mvn test
```

### Ejecutar pruebas de un ejercicio específico

```bash
mvn test -Dtest=ejemplo_1_13Test
```

---

## 📊 Generar Reporte HTML

El proyecto incluye un script de Node.js para generar automáticamente el reporte HTML de las pruebas:

```bash
node actualizar_index.js
```

Luego abre el archivo `index.html` en tu navegador para ver el reporte interactivo.

---

## 📖 Ejercicios Disponibles

### 1. Ejemplo 1.13 - Promedio de Calificaciones
**Descripción:** Calcula el promedio de 5 calificaciones de un alumno.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/ejemplo_1_13.java`
- Esqueleto: `src/main/java/com/tutortics/ejemplo_1_13_Estudiante.java`
- Test: `src/test/java/com/tutortics/ejemplo_1_13_test.java`
- Diagrama: `diagramas/ejemplo_1_13.png`
- HTML: `ejercicios/ejemplo_1_13.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.ejemplo_1_13"
```

---

### 2. Problema PS 1.6 - Plan de Financiamiento Automotriz
**Descripción:** Calcula el enganche y la mensualidad de un plan de financiamiento para la compra de un automóvil.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_1_6.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_1_6_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_1_6_test.java`
- Diagrama: `diagramas/problema_ps_1_6.png`
- HTML: `ejercicios/problema_ps_1_6.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_1_6"
```

---

### 3. Ejemplo 2.5 - Selector Múltiple
**Descripción:** Implementa una estructura de selector múltiple (switch-case) que ejecuta diferentes acciones según el valor seleccionado.

**Funcionamiento:**
- Valor 1: Ejecuta ACCION 1
- Valor 2: Ejecuta ACCION 2
- Valor 3: Ejecuta ACCION 3
- Otro valor: Ejecuta ACCION X
- Después de cualquier acción, siempre ejecuta ACCION Y

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/ejemplo_2_5.java`
- Esqueleto: `src/main/java/com/tutortics/ejemplo_2_5_Estudiante.java`
- Test: `src/test/java/com/tutortics/ejemplo_2_5_test.java`
- Diagrama: `diagramas/ejemplo_2_5.png`
- HTML: `ejercicios/ejemplo_2_5.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.ejemplo_2_5"
```

---

### 4. Problema 2.9 - Cálculo de Impuestos
**Descripción:** Calcula el impuesto de un producto según reglas específicas por rangos de precio.

**Reglas:**
- Primeros $20: No causan impuesto
- Siguientes $20 ($20-$40): 30% de impuesto
- Resto (>$40): 40% de impuesto
- Si el precio > $500: El impuesto del resto es 50% en lugar de 40%

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_2_9.java`
- Esqueleto: `src/main/java/com/tutortics/problema_2_9_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_2_9_test.java`
- Diagrama: `diagramas/problema_2_9.png`
- HTML: `ejercicios/problema_2_9.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_2_9"
```

---

### 5. Problema PS 3.2 - Promedio de Calificaciones
**Descripción:** Calcula el promedio de N calificaciones introducidas por el usuario.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_3_2.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_3_2_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_3_2_test.java`
- Diagrama: `diagramas/problema_ps_3_2.png`
- HTML: `ejercicios/problema_ps_3_2.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_3_2"
```

---

### 6. Problema PS 3.3 - Contar Pares e Impares
**Descripción:** Lee N números enteros y cuenta cuántos son pares y cuántos son impares.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_3_3.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_3_3_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_3_3_test.java`
- Diagrama: `diagramas/problema_ps_3_3.png`
- HTML: `ejercicios/problema_ps_3_3.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_3_3"
```

---

### 7. Problema PS 3.4 - Tabla de Multiplicar
**Descripción:** Genera y almacena en un arreglo la tabla de multiplicar de un número dado.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_3_4.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_3_4_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_3_4_test.java`
- Diagrama: `diagramas/problema_ps_3_4.png`
- HTML: `ejercicios/problema_ps_3_4.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_3_4"
```

---

### 8. Problema PS 3.5 - Suma de Serie Armónica
**Descripción:** Calcula la suma de la serie armónica 1 + 1/2 + 1/3 + ... + 1/N.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_3_5.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_3_5_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_3_5_test.java`
- Diagrama: `diagramas/problema_ps_3_5.png`
- HTML: `ejercicios/problema_ps_3_5.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_3_5"
```

---

### 9. Problema PS 3.39 - Función Matemática Compleja
**Descripción:** Calcula una función F(X,Y,Z) con 3 condiciones diferentes utilizando factoriales.

**Condiciones:**
- Si X, Y, Z > 0: F = X! + Y! + Z!
- Si solo X > 0: F = X² / (Y × Z)
- Otros casos: F = X + Y + Z

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_3_39.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_3_39_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_3_39_test.java`
- Diagrama: `diagramas/problema_ps_3_39.png`
- HTML: `ejercicios/problema_ps_3_39.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_3_39"
```

---

### 10. Problema 3.6 - Mayor y Menor de N Números
**Descripción:** Encuentra el mayor y el menor de N números introducidos por el usuario.

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_3_6.java`
- Esqueleto: `src/main/java/com/tutortics/problema_3_6_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_3_6_test.java`
- Diagrama: `diagramas/problema_3_6.png`
- HTML: `ejercicios/problema_3_6.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_3_6"
```

---

### 11. Ejemplo 4.3 - Arreglo de 70 Elementos
**Descripción:** Implementa un arreglo de 70 elementos enteros con índices del 1 al 70.

**Características:**
- Tamaño fijo de 70 elementos
- Índices desde 1 hasta 70 (NTE = 70 - 1 + 1 = 70)
- Almacena valores enteros
- Acceso directo a elementos mediante índice

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/ejemplo_4_3.java`
- Esqueleto: `src/main/java/com/tutortics/ejemplo_4_3_Estudiante.java`
- Test: `src/test/java/com/tutortics/ejemplo_4_3_test.java`
- Diagrama: `diagramas/ejemplo_4_3.png`
- HTML: `ejercicios/ejemplo_4_3.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.ejemplo_4_3"
```

---

### 12. Ejemplo 4.7 - Búsqueda Binaria
**Descripción:** Implementa el algoritmo de búsqueda binaria en un arreglo ordenado.

**Características:**
- Arreglo ordenado de menor a mayor
- Búsqueda eficiente con complejidad O(log n)
- Retorna la posición del elemento o -1 si no se encuentra

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/ejemplo_4_7.java`
- Esqueleto: `src/main/java/com/tutortics/ejemplo_4_7_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_4_7_test.java`
- Diagrama: `diagramas/ejemplo_4_7.png`
- HTML: `ejercicios/ejemplo_4_7.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.ejemplo_4_7"
```

---

### 13. Problema PS 4.11 - Búsqueda de Ciudad en Arreglo
**Descripción:** Busca una ciudad en un arreglo desordenado usando búsqueda lineal.

**Características:**
- Búsqueda lineal secuencial
- Comparación ignorando mayúsculas/minúsculas
- Retorna true si encuentra la ciudad, false en caso contrario

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_4_11.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_4_11_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_4_11_test.java`
- Diagrama: `diagramas/problema_ps_4_11.png`
- HTML: `ejercicios/problema_ps_4_11.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_4_11"
```

---

### 14. Problema 4.22 - Gestión de Inventario
**Descripción:** Gestiona un inventario de productos, encuentra el producto con mayor existencia y elimina productos con existencia cero.

**Funcionalidades:**
- Encontrar producto con mayor existencia
- Eliminar productos con existencia = 0
- Compactar el arreglo después de eliminar

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_4_22.java`
- Esqueleto: `src/main/java/com/tutortics/problema_4_22_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_4_22_test.java`
- Diagrama: `diagramas/problema_4_22.png`
- HTML: `ejercicios/problema_4_22.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_4_22"
```

---

### 15. Problema PS 4.27 - Promedio de Arreglos Paralelos
**Descripción:** Calcula el promedio de dos arreglos paralelos A y B, generando un arreglo C donde C[i] = A[i] / B[i].

**Características:**
- Manejo de división por cero
- Arreglos paralelos del mismo tamaño
- Validación de divisor cero

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_4_27.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_4_27_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_4_27_test.java`
- Diagrama: `diagramas/problema_ps_4_27.png`
- HTML: `ejercicios/problema_ps_4_27.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_4_27"
```

---

### 16. Problema PS 5.6 - Registros de Profesores
**Descripción:** Procesa un arreglo de registros de profesores y calcula diversas estadísticas.

**Estadísticas calculadas:**
- Edad promedio de todos los profesores
- Nombre del profesor más joven
- Nombre del profesor más viejo
- Cantidad de profesoras mayores al promedio
- Cantidad de profesores menores al promedio

**Archivos:**
- Solución completa: `src/main/java/com/tutortics/problema_ps_5_6.java`
- Clase auxiliar: `src/main/java/com/tutortics/Profesor.java`
- Esqueleto: `src/main/java/com/tutortics/problema_ps_5_6_Estudiante.java`
- Test: `src/test/java/com/tutortics/problema_ps_5_6_test.java`
- Diagrama: `diagramas/problema_ps_5_6.png`
- HTML: `ejercicios/problema_ps_5_6.html`

**Ejecutar:**
```bash
mvn exec:java -Dexec.mainClass="com.tutortics.problema_ps_5_6"
```

---

### 17. Test Ejemplo 1.13
**Descripción:** Archivo de prueba específico para validar funcionalidad del ejemplo 1.13.

**Archivos:**
- Test: `src/test/java/com/tutortics/Test_ejemplo_1_13.java`

---

## 🎨 Generar Diagramas de Flujo (Opcional)

Si tienes Graphviz instalado, puedes regenerar los diagramas PNG desde los archivos `.dot`:

```bash
dot -Tpng -Gbgcolor=transparent diagramas/ejemplo_1_13.dot -o diagramas/ejemplo_1_13.png
```

### Instalar Graphviz:

**Windows (con Chocolatey):**
```bash
choco install graphviz
```

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get install graphviz
```

**macOS (con Homebrew):**
```bash
brew install graphviz
```

---

## 🧪 Testing

El proyecto utiliza JUnit 5 para las pruebas unitarias. Las pruebas validan:
- Casos normales de uso
- Casos límite
- Manejo de errores

**Estado actual de las pruebas:**
- ✅ Total de tests: **63**
- ✅ Tests pasando: **63**
- ❌ Tests fallidos: **0**
- ⏭️ Tests omitidos: **0**

Todos los ejercicios incluyen pruebas unitarias completas que validan su correcto funcionamiento.

---

## 📝 Licencia

Este proyecto es material educativo para uso académico.

---

## 🤝 Contribuciones

Este es un proyecto académico personal. Si encuentras errores o tienes sugerencias, puedes abrir un issue.

---

**Última actualización:** Noviembre 2025