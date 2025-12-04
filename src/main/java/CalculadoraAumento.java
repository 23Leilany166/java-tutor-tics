// Archivo: CalculadoraAumento.java
public class CalculadoraAumento {
    public static void main(String[] args) {
        // Casos de prueba del libro (Tabla 2.4)
        double sueldo1 = 840.50;
        double sueldo2 = 1200.00;
        double sueldo3 = 1000.00;

        // Calcular nuevo sueldo para sueldo1
        double nuevoSueldo1;
        if (sueldo1 < 1000) {
            nuevoSueldo1 = sueldo1 * 1.15; // Aumento del 15%
        } else {
            nuevoSueldo1 = sueldo1 * 1.12; // Aumento del 12%
        }
        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo1, nuevoSueldo1);

        // Calcular nuevo sueldo para sueldo2
        double nuevoSueldo2;
        if (sueldo2 < 1000) {
            nuevoSueldo2 = sueldo2 * 1.15; // Aumento del 15%
        } else {
            nuevoSueldo2 = sueldo2 * 1.12; // Aumento del 12%
        }
        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo2, nuevoSueldo2);

        // Calcular nuevo sueldo para sueldo3
        double nuevoSueldo3;
        if (sueldo3 < 1000) {
            nuevoSueldo3 = sueldo3 * 1.15; // Aumento del 15%
        } else {
            nuevoSueldo3 = sueldo3 * 1.12; // Aumento del 12%
        }
        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo3, nuevoSueldo3);
    }
}