# Problema 4.18 — Cuadrado Mágico (Java 21)

## Descripción
Genera e imprime un cuadrado mágico de orden N (impar, 1 <= N <= 50)
utilizando el método de Siam (clásico).

## Archivos incluidos
- `src/edu/primersemestre/CuadradoMagico.java`
- `test/edu/primersemestre/CuadradoMagicoTest.java`
- `diagramas/Problema4_18.log`
- `diagramas/Problema4_18.png`
- `README.md`

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.CuadradoMagico
```

## Notas
- Solo acepta valores impares entre 1 y 50.
- Constante mágica: M = N*(N*N + 1)/2.
- Se utilizan ciclos y operaciones modulares para controlar las posiciones.
