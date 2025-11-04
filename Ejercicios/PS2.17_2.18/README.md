# PS 2.17–2.18 — Conversor de Unidades (Java 21, Programación Estructurada)

## Descripción
Programa que convierte medidas según la opción elegida:
1) pulgadas a milímetros
2) yardas a metros
3) millas a kilómetros

## Factores de conversión
- 1 pulgada = 25.40 mm
- 1 yarda = 0.9144 m
- 1 milla = 1.6093 km

## Archivos incluidos
- src/edu/primersemestre/ConversorUnidades.java
- test/edu/primersemestre/ConversorUnidadesTest.java
- diagramas/PS2_17_18.log
- diagramas/PS2_17_18.png
- README.md

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.ConversorUnidades
```

## Notas
- Valida que la medida sea positiva.
- Usa `switch` con flechas (Java 21).
