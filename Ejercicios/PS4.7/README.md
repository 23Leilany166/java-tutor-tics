# PS 4.7 — Búsqueda Secuencial (Java 21)

## Descripción
Este programa revisa un arreglo de N elementos (1 ≤ N ≤ 50) para determinar si un valor X se encuentra en él,
y en qué posición. Implementa la búsqueda secuencial o lineal, adecuada para arreglos desordenados.

## Archivos incluidos
- src/edu/primersemestre/BusquedaSecuencial.java
- test/edu/primersemestre/BusquedaSecuencialTest.java
- diagramas/PS4_7.log
- diagramas/PS4_7.png
- README.md

## Instrucciones de ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.BusquedaSecuencial
```

## Notas
- Complejidad temporal O(N)
- Si el arreglo estuviera ordenado, puede optimizarse cortando al detectar VECTOR[i] > X.
