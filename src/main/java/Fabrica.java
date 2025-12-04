
// Archivo: Fabrica.java
import java.util.Arrays;

public class Fabrica {
    public static void main(String[] args) {
        // Datos de prueba (simplificados: 3 meses, 2 productos)
        // Para el ejemplo completo, los arreglos serían de [12][10]

        // Adaptamos la prueba a las dimensiones completas [12][10]
        double[][] produccion = new double[12][10];
        double[] costos = new double[10];

        // Llenamos datos de prueba en el arreglo
        produccion[0][0] = 100;
        produccion[0][1] = 50;
        produccion[1][0] = 110;
        produccion[1][1] = 60;
        produccion[2][0] = 120;
        produccion[2][1] = 70;
        // ... (resto en 0) ...
        costos[0] = 10.0;
        costos[1] = 20.0;
        // ... (resto en 0) ...

        // a) Calcular el costo anual de producción para cada producto
        double[] costoAnual = new double[10];

        // Iterar por producto (j)
        for (int j = 0; j < 10; j++) {
            double cantidadTotalProducto = 0;
            // Iterar por mes (i)
            for (int i = 0; i < 12; i++) {
                cantidadTotalProducto += produccion[i][j];
            }
            // Costo total = Cantidad total * Costo unitario
            costoAnual[j] = cantidadTotalProducto * costos[j];
        }

        // Prod 0: (100+110+120) * 10.0 = 330 * 10.0 = 3300.0
        // Prod 1: (50+60+70) * 20.0 = 180 * 20.0 = 3600.0
        System.out.println("a) Costos Anuales: " + Arrays.toString(costoAnual));

        // b) Calcular el costo total de producción de la fábrica
        double costoTotal = 0;
        for (int j = 0; j < 10; j++) {
            costoTotal += costoAnual[j];
        }

        // 3300.0 + 3600.0 = 6900.0
        System.out.printf("b) Costo Total Fábrica: %.2f\n", costoTotal);

        // c) Obtener el tipo de producto (índice 0-9) que más se vendió (en unidades)
        double maxCantidad = -1;
        int productoMax = -1;

        for (int j = 0; j < 10; j++) { // Iterar por producto
            double cantidadTotalProducto = 0;
            for (int i = 0; i < 12; i++) { // Iterar por mes
                cantidadTotalProducto += produccion[i][j];
            }

            if (cantidadTotalProducto > maxCantidad) {
                maxCantidad = cantidadTotalProducto;
                productoMax = j;
            }
        }

        // Prod 0: 330 unidades
        // Prod 1: 180 unidades
        // (Debe ser el producto 0)
        System.out.println("c) Producto más vendido (índice): " + productoMax);
    }
}