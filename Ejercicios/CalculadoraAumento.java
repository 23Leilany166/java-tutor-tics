// Archivo: CalculadoraAumento.java
public class CalculadoraAumento {

    /**
     * Calcula el nuevo sueldo basado en un umbral.
     * Si el sueldo es < 1000, aumenta 15%.
     * Si el sueldo es >= 1000, aumenta 12%.
     */
    public double calcularNuevoSueldo(double sueldoActual) {
        if (sueldoActual < 1000) {
            return sueldoActual * 1.15;
        } else {
            return sueldoActual * 1.12;
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        CalculadoraAumento calc = new CalculadoraAumento();
        
        // Casos de prueba del libro (Tabla 2.4)
        double sueldo1 = 840.50;
        double sueldo2 = 1200.00;
        double sueldo3 = 1000.00;

        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo1, calc.calcularNuevoSueldo(sueldo1));
        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo2, calc.calcularNuevoSueldo(sueldo2));
        System.out.printf("Sueldo %.2f -> Nuevo Sueldo: %.2f\n", sueldo3, calc.calcularNuevoSueldo(sueldo3));
    }
}