// Archivo: ProcesadorFunciones.java
public class ProcesadorFunciones {
    public static void main(String[] args) {
        // Casos de prueba del libro (Tabla 2.5)
        int opcion1 = 1, valor1 = 8;
        int opcion2 = 7, valor2 = 6;
        int opcion3 = 3, valor3 = 4;
        int opcion4 = 2, valor4 = 3;

        // Procesar opción 1
        double resultado1;
        switch (opcion1) {
            case 1:
                resultado1 = 100 * valor1; // Multiplicación
                break;
            case 2:
                resultado1 = Math.pow(100, valor1); // Potencia
                break;
            case 3:
                resultado1 = 100.0 / valor1; // División
                break;
            default:
                resultado1 = 0.0;
                break;
        }
        System.out.printf("Opción %d, V=%d  -> Resultado: %.1f\n", opcion1, valor1, resultado1);

        // Procesar opción 2
        double resultado2;
        switch (opcion2) {
            case 1:
                resultado2 = 100 * valor2; // Multiplicación
                break;
            case 2:
                resultado2 = Math.pow(100, valor2); // Potencia
                break;
            case 3:
                resultado2 = 100.0 / valor2; // División
                break;
            default:
                resultado2 = 0.0;
                break;
        }
        System.out.printf("Opción %d, V=%d  -> Resultado: %.1f\n", opcion2, valor2, resultado2);

        // Procesar opción 3
        double resultado3;
        switch (opcion3) {
            case 1:
                resultado3 = 100 * valor3; // Multiplicación
                break;
            case 2:
                resultado3 = Math.pow(100, valor3); // Potencia
                break;
            case 3:
                resultado3 = 100.0 / valor3; // División
                break;
            default:
                resultado3 = 0.0;
                break;
        }
        System.out.printf("Opción %d, V=%d  -> Resultado: %.1f\n", opcion3, valor3, resultado3);

        // Procesar opción 4
        double resultado4;
        switch (opcion4) {
            case 1:
                resultado4 = 100 * valor4; // Multiplicación
                break;
            case 2:
                resultado4 = Math.pow(100, valor4); // Potencia
                break;
            case 3:
                resultado4 = 100.0 / valor4; // División
                break;
            default:
                resultado4 = 0.0;
                break;
        }
        System.out.printf("Opción %d, V=%d  -> Resultado: %.1f\n", opcion4, valor4, resultado4);
    }
}