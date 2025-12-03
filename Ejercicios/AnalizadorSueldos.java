// Archivo: AnalizadorSueldos.java
public class AnalizadorSueldos {

    /**
     * Cuenta cuántos sueldos en un arreglo están por encima del promedio.
     */
    public int contarSueldosSobrePromedio(double[] sueldos) {
        if (sueldos == null || sueldos.length == 0) {
            return 0; // Evitar división por cero
        }
        
        // --- Pasada 1: Calcular el promedio ---
        double total = 0;
        for (double sueldo : sueldos) {
            total += sueldo;
        }
        double promedio = total / sueldos.length;
        System.out.printf("El promedio de sueldos es: %.2f\n", promedio);

        // --- Pasada 2: Contar sueldos > promedio ---
        int contador = 0;
        for (double sueldo : sueldos) {
            if (sueldo > promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Usamos 5 sueldos como en el ejemplo (Tabla 4.1)
        double[] sueldos = {1200.00, 3950.00, 7575.00, 980.00, 1050.70};
        
        AnalizadorSueldos as = new AnalizadorSueldos();
        int cantidad = as.contarSueldosSobrePromedio(sueldos);
        
        // (Promedio de la tabla 4.1 es 1921.14, hay 2 sueldos mayores)
        System.out.printf("Número de sueldos sobre el promedio: %d\n", cantidad);
    }
}