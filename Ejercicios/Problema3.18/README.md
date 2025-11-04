# Problema 3.18 — Producción Anual de Fábricas (Java 21, Programación Estructurada)

Calcula:
1. Totales anuales de producción por fábrica.
2. La fábrica que más produjo en el año.
3. Fábricas con producción en julio superior a $3,000,000.

## Archivos incluidos
- `src/edu/primersemestre/ProduccionIndustrias.java`
- `test/edu/primersemestre/ProduccionIndustriasTest.java`
- `diagramas/Problema3_18.log`
- `diagramas/Problema3_18.png`
- `README.md`

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.ProduccionIndustrias
```

## Notas
- `N` máximo = 100.
- `TOTANU` y `MAYPRO` son tipo `double`.
- Usa estructuras `for` anidadas (fábricas x meses).
