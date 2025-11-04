# Problema 3.2 — Suma e impresión de la serie (Java 21, Programación Estructurada)

Serie: 2, 5, 7, 10, 12, 15, 17, ..., 1800

## Archivos
- `src/edu/primersemestre/SerieSuma.java`
- `test/edu/primersemestre/SerieSumaTest.java`
- `diagramas/Problema3_2.log`
- `diagramas/Problema3_2.png` (fondo transparente)

## Cómo ejecutar (sin Maven)
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.SerieSuma
```

> Para correr los tests, usa VS Code con Java Test Runner o configura Maven con JUnit 5.

## Notas
- Se usa `long` en `SUMSER` por seguridad ante sumas grandes.
- La bandera `BAND` alterna el incremento entre `+3` y `+2`.
