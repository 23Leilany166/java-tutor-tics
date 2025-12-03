// Archivo: Fabrica.java
import java.util.Arrays;

public class Fabrica {
    // Arreglo [12 Meses][10 Productos]
    private double[][] produccion;
    
    // Arreglo [10 Productos]
    private double[] costos;

    public Fabrica(double[][] produccion, double[] costos) {
        this.produccion = produccion;
        this.costos = costos;
    }

    /**
     * a) Calcula el costo anual de producción para cada producto.
     */
    public double[] getCostoAnualPorProducto() {
        double[] costoAnual = new double[10];
        
        // Iterar por producto (j)
        for (int j = 0; j < 10; j++) {
            double cantidadTotalProducto = 0;
            // Iterar por mes (i)
            for (int i = 0; i < 12; i++) {
                cantidadTotalProducto += this.produccion[i][j];
            }
            // Costo total = Cantidad total * Costo unitario
            costoAnual[j] = cantidadTotalProducto * this.costos[j];
        }
        return costoAnual;
    }

    /**
     * b) Calcula el costo total de producción de la fábrica.
     */
    public double getCostoTotalProduccion() {
        double[] costoAnual = getCostoAnualPorProducto();
        double costoTotal = 0;
        for (double costo : costoAnual) {
            costoTotal += costo;
        }
        return costoTotal;
    }

    /**
     * c) Obtiene el tipo de producto (índice 0-9) que más se vendió (en unidades).
     */
    public int getProductoMasVendido() {
        double maxCantidad = -1;
        int productoMax = -1;
        
        for (int j = 0; j < 10; j++) { // Iterar por producto
            double cantidadTotalProducto = 0;
            for (int i = 0; i < 12; i++) { // Iterar por mes
                cantidadTotalProducto += this.produccion[i][j];
            }
            
            if (cantidadTotalProducto > maxCantidad) {
                maxCantidad = cantidadTotalProducto;
                productoMax = j;
            }
        }
        return productoMax; // Devuelve el índice (0-9)
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Datos de prueba (simplificados: 3 meses, 2 productos)
        double[][] produccionPrueba = {
            {100, 50}, // Mes 1 (Prod 0, Prod 1)
            {110, 60}, // Mes 2
            {120, 70}  // Mes 3
        };
        // (Para el ejemplo completo, los arreglos serían de [12][10])
        
        // Costos de los 2 productos
        double[] costosPrueba = {10.0, 20.0}; // Prod 0 cuesta 10, Prod 1 cuesta 20

        // Adaptamos la prueba a las dimensiones completas [12][10]
        double[][] produccionReal = new double[12][10];
        double[] costosReal = new double[10];
        
        // Llenamos datos de prueba en el arreglo real
        produccionReal[0][0] = 100; produccionReal[0][1] = 50;
        produccionReal[1][0] = 110; produccionReal[1][1] = 60;
        produccionReal[2][0] = 120; produccionReal[2][1] = 70;
        // ... (resto en 0) ...
        costosReal[0] = 10.0; costosReal[1] = 20.0;
        // ... (resto en 0) ...
        
        Fabrica f = new Fabrica(produccionReal, costosReal);

        // a) Costo Anual
        // Prod 0: (100+110+120) * 10.0 = 330 * 10.0 = 3300.0
        // Prod 1: (50+60+70) * 20.0 = 180 * 20.0 = 3600.0
        double[] costosAnuales = f.getCostoAnualPorProducto();
        System.out.println("a) Costos Anuales: " + Arrays.toString(costosAnuales));

        // b) Costo Total
        // 3300.0 + 3600.0 = 6900.0
        System.out.printf("b) Costo Total Fábrica: %.2f\n", f.getCostoTotalProduccion());
        
        // c) Producto más vendido (unidades)
        // Prod 0: 330 unidades
        // Prod 1: 180 unidades
        // (Debe ser el producto 0)
        System.out.println("c) Producto más vendido (índice): " + f.getProductoMasVendido());
    }
}