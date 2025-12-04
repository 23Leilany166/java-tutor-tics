// Archivo: AnalizadorSueldos.java
public class AnalizadorSueldos {
    public static void main(String[] args) {
        // Usamos 5 sueldos como en el ejemplo (Tabla 4.1)
        double[] sueldos = { 1200.00, 3950.00, 7575.00, 980.00, 1050.70 };

        // Validación: evitar división por cero
        if (sueldos.length == 0) {
            System.out.println("No hay sueldos para analizar.");
            return;
        }

        // --- Pasada 1: Calcular el promedio ---
        double total = 0;
        for (int i = 0; i < sueldos.length; i++) {
            total += sueldos[i];
        }
        double promedio = total / sueldos.length;
        System.out.printf("El promedio de sueldos es: %.2f\n", promedio);

        // --- Pasada 2: Contar sueldos > promedio ---
        int contador = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] > promedio) {
                contador++;
            }
        }

        // (Promedio de la tabla 4.1 es 2951.14, hay 2 sueldos mayores)
        System.out.printf("Número de sueldos sobre el promedio: %d\n", contador);
    }
}