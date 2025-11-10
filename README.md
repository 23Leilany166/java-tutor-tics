# Proyecto de Ejercicios Estructurados en Java  

Este repositorio reúne todos los ejercicios desarrollados a partir del libro *Algoritmos y Programación en Java*, adaptados a un entorno visual e interactivo.  
El objetivo del proyecto es facilitar la práctica de la programación estructurada, la comprensión de algoritmos y la verificación automática del código mediante pruebas locales.  

---

## Descripción General  

El repositorio está diseñado para estudiantes que inician en el aprendizaje de programación estructurada.  
Cada ejercicio incluye su código fuente, prueba automatizada y diagrama de flujo generado con a partir de un archivo .dot con Graphviz.  
Además, cuenta con una interfaz HTML (`main_desc.html`) que permite visualizar de forma unificada todos los ejercicios, su descripción, código y resultado de las pruebas.  

---

## Estructura del Proyecto  

El proyecto está organizado de la siguiente manera:

JAVA-TUTOR-TICS/
│
├── src/ → Código fuente de los ejercicios en Java.
├── tests/ → Archivos de pruebas automáticas (JUnit).
├── assets/ → Estilos CSS e imágenes integradas en las páginas.
├── diagramas/ → Diagramas de flujo en formato .dot y .png.
├── main_desc.html → Página principal con los enlaces a cada ejercicio.
├── actualizar_resultados.sh → Script para ejecutar y actualizar los tests.
└── lib/ → Librerías de JUnit y Hamcrest necesarias para las pruebas.




## Instrucciones de Uso  

### 1. Visualización de los ejercicios  

1. Abre el archivo `main_desc.html` ubicado en la raíz del proyecto.  
2. Desde tu navegador (Google Chrome, Edge o Firefox), explora el menú superior para acceder a cada ejercicio.  
3. En cada página podrás encontrar:
   - La **descripción completa** del ejercicio.  
   - Los **datos de entrada y salida esperados**.  
   - El **código en Java** con comentarios explicativos.  
   - El **diagrama de flujo** correspondiente.  
   - Un resumen del **resultado de las pruebas automáticas**.  

---

### 2. Ejecución de pruebas automáticas  

Cada ejercicio cuenta con un archivo de prueba JUnit dentro de la carpeta `tests/`.  
Para verificar automáticamente si los programas funcionan correctamente, utiliza el siguiente comando desde Git Bash o una terminal:  

./actualizar_resultados.sh
Este script realiza los siguientes pasos:

Limpia y recompila todos los archivos .java.

Ejecuta las pruebas con JUnit.

Actualiza el archivo main_desc.html, mostrando visualmente si los ejercicios pasaron o fallaron las pruebas.

En la página principal (main_desc.html) aparecerá un aviso automático:

“✅ Todos los tests PASARON correctamente” cuando todo esté bien.

“❌ Algunos tests FALLARON” si alguno requiere corrección.

3. Requisitos previos
Para poder ejecutar el proyecto correctamente, necesitas:

Java JDK 8 o superior.

Visual Studio Code, IntelliJ IDEA o Eclipse (con soporte para Java).

Extensión Graphviz Preview en VS Code (para visualizar diagramas .dot).

Git Bash o una terminal compatible para correr el script de actualización.

4. Diagramas de flujo
Cada ejercicio cuenta con su propio diagrama de flujo creado en formato .dot (Graphviz).
Los archivos pueden abrirse en Visual Studio Code con vista previa o exportarse a imagen .png con fondo transparente usando:

dot -Tpng diagramas/nombre_diagrama.dot -o diagramas/nombre_diagrama.png -Gbgcolor=transparent
Estos diagramas reemplazan las imágenes genéricas incluidas originalmente en las páginas del libro.

5. Propósito educativo
Este proyecto fue desarrollado con fines académicos y tiene como objetivos principales:

Reforzar el pensamiento lógico y la resolución de problemas.

Fomentar buenas prácticas de documentación y estructura del código.

Facilitar la comprensión visual mediante diagramas de flujo y pruebas automatizadas.

Integrar herramientas de desarrollo profesional en un entorno accesible para principiantes.

Autor
- Xavier Amed Guerrero Hernández
- Estudiante de Ingeniería en Tecnologías de la Información y Comunicaciones
- Instituto Tecnológico Superior del Occidente del Estado de Hidalgo (ITSOEH)
- Correo: 230110579@itsoeh.edu.mx


