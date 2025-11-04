# PS 3.32 — Ventas de N sucursales durante 14 años (Java 21)

## Descripción
Una empresa automotriz desea analizar los montos de ventas de sus N sucursales
durante 14 años. Este programa calcula:
- a) Sucursal con mayor venta en cada año.
- b) Promedio de ventas por año.
- c) Año con mayor promedio de ventas.
- d) Ventas totales de la empresa (N sucursales x 14 años).

## Archivos incluidos
- src/edu/primersemestre/VentasEmpresa.java
- test/edu/primersemestre/VentasEmpresaTest.java
- diagramas/PS3_32.log
- diagramas/PS3_32.png
- README.md

## Instrucciones de ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.VentasEmpresa
```

## Notas
- El número de sucursales N debe estar entre 1 y 50.
- Usa formato de punto decimal (Locale.US) para ingresar números reales.
