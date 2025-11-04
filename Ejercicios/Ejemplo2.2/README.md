# Ejemplo 2.2 — Aumento de Sueldo (Java 21, Programación Estructurada)

Este ejercicio aplica un **aumento del 15%** al sueldo de un trabajador si su salario es menor a **$1000**.

## Archivos incluidos
- `src/edu/primersemestre/AumentoSueldo.java`
- `test/edu/primersemestre/AumentoSueldoTest.java`
- `diagramas/Ejemplo2_2.log`
- `diagramas/Ejemplo2_2.png`

## Instrucciones
1. Abre la carpeta en Visual Studio Code.
2. Compila con:
   ```bash
   javac -d out $(find src -name "*.java")
   java -cp out edu.primersemestre.AumentoSueldo
   ```
3. Ejecuta los tests desde VS Code o usando Maven con JUnit 5.

## Ejemplo de ejecución
```
Introduce el sueldo (SUE): 875
El nuevo sueldo (NSUE) es: 1006.25
```

## Diagrama de flujo
Incluye estructura selectiva simple:
- **Entrada:** SUE
- **Condición:** SUE < 1000
- **Proceso:** NSUE = SUE * 1.15
- **Salida:** Mostrar NSUE
