// Archivo: ProcesadorFunciones.java
public class ProcesadorFunciones {

    /**
     * Calcula un valor basado en la opción 'num'.
     * 1: 100 * v
     * 2: 100 ^ v
     * 3: 100 / v
     * Otro: 0
     */
    public double calcularValor(int num, int v) {
        switch (num) {
            case 1:
                return 100 * v; // Multiplicación
            case 2:
                return Math.pow(100, v); // Potencia
            case 3:
                // Aseguramos división de punto flotante
                return 100.0 / v; 
            default:
                // Para cualquier otro valor de 'num'
                return 0.0;
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        ProcesadorFunciones pf = new ProcesadorFunciones();
        
        // Casos de prueba del libro (Tabla 2.5)
        System.out.printf("Opción 1, V=8  -> Resultado: %.1f\n", pf.calcularValor(1, 8));
        System.out.printf("Opción 7, V=6  -> Resultado: %.1f\n", pf.calcularValor(7, 6));
        System.out.printf("Opción 3, V=4  -> Resultado: %.1f\n", pf.calcularValor(3, 4));
        System.out.printf("Opción 2, V=3  -> Resultado: %.1f\n", pf.calcularValor(2, 3));
    }
}