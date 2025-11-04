# Problema 2.5 — Determinar si un número es positivo, negativo o nulo (Java 21)

Este ejercicio determina si un número entero ingresado por el usuario es **positivo**, **negativo** o **nulo**.

## Archivos incluidos
- `src/edu/primersemestre/NumeroSigno.java`
- `test/edu/primersemestre/NumeroSignoTest.java`
- `diagramas/Problema2_5.log`
- *(La imagen del diagrama debe agregarse manualmente con el link que se exportará.)*

## Instrucciones
1. Abre la carpeta en Visual Studio Code.
2. Compila con:
   ```bash
   javac -d out $(find src -name "*.java")
   java -cp out edu.primersemestre.NumeroSigno
   ```
3. Ejecuta los tests desde VS Code o usando Maven con JUnit 5.

## Ejemplo de ejecución
```
Introduce un número entero (NUM): -7
NEGATIVO
```

## Diagrama de flujo
- **Entrada:** NUM
- **Condición 1:** NUM > 0 → POSITIVO
- **Condición 2:** NUM == 0 → NULO
- **Condición 3:** NUM < 0 → NEGATIVO
