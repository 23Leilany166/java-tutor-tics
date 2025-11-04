# Problema 4.5 — Ordenación por Inserción Directa (Java 21)

## Descripción
Implementación del método de **inserción directa**, que inserta cada elemento
del arreglo en la posición correcta dentro de la parte ya ordenada.

## Archivos incluidos
- `src/edu/primersemestre/InsercionDirecta.java`
- `test/edu/primersemestre/InsercionDirectaTest.java`
- `diagramas/Problema4_5.log`
- `diagramas/Problema4_5.png`
- `README.md`

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.InsercionDirecta
```

## Pruebas
Ejecutar con JUnit 5:
```bash
mvn test
```

## Notas
- Complejidad: O(n²) en el peor caso.
- Ideal para arreglos pequeños o casi ordenados.
