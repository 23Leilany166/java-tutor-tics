# PS 2.16 — Descuento por modelo de vehículo (Java 21, estructurado)

## Descripción
Este programa calcula el valor final de un vehículo aplicando un descuento
según su modelo, conforme a la tabla de referencia.

## Tabla de descuentos
| Modelo        | Descuento |
|----------------|------------|
| Blazer-Trail   | 8%         |
| Cavalier       | 5%         |
| Chevy          | 6%         |
| Opel-Astra     | 9%         |

## Archivos incluidos
- src/edu/primersemestre/PrecioVehiculo.java
- test/edu/primersemestre/PrecioVehiculoTest.java
- diagramas/PS2_16.log
- diagramas/PS2_16.png
- README.md

## Ejecución
```bash
javac -d out $(find src -name "*.java")
java -cp out edu.primersemestre.PrecioVehiculo
```

## Notas
- Los descuentos se aplican únicamente a los modelos indicados.
- Si el modelo no coincide, el descuento es 0%.
