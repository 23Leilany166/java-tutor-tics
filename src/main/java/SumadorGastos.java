// Archivo: SumadorGastos.java
import java.util.Scanner;

public class SumadorGastos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGastos = 0;

        // 1. Lectura inicial (cebar el bucle)
        System.out.print("Ingrese el monto del gasto (o -1 para terminar): ");
        double gasto = scanner.nextDouble();

        // 2. Bucle 'mientras' (while)
        while (gasto != -1) {
            totalGastos += gasto; // Acumula el gasto
            
            // 3. Lectura siguiente
            System.out.print("Ingrese el monto del gasto (o -1 para terminar): ");
            gasto = scanner.nextDouble();
        }

        System.out.printf("El total de gastos del viaje es: $%.2f\n", totalGastos);
        scanner.close();
    }
}