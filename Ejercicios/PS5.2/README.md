# PS 5.2 — Procesar registros de alumnos — Java 21

## Descripción
Este programa permite almacenar información de N alumnos (hasta 2000) y realizar operaciones:
- Listar alumnos con promedio general > 9.
- Listar alumnos de Economía con todos los semestres > 9.
- Mostrar el alumno con mayor promedio en Ingeniería en Computación.

## Estructura
- src/edu/primersemestre/ProcesaAlumnos.java
- test/edu/primersemestre/ProcesaAlumnosTest.java
- diagramas/PS5_2.log
- diagramas/PS5_2.png
- README.md

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.ProcesaAlumnos
```

## Notas
- Se permite hasta 9 semestres por alumno.
- Los promedios se calculan con base en semestres cursados.
- La entrada de texto debe seguir el formato indicado en consola.
