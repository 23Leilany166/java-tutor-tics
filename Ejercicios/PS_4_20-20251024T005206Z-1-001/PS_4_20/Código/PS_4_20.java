

import java.util.Scanner;

/**
 *
 * @author Chema
 */
public class PS_4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de renglones (M) del arreglo A: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el numero de columnas (N) del arreglo A: ");
        int n = scanner.nextInt();

        double[][] A = new double[m][n];
        double[] B = new double[n];

        // Leer los valores del arreglo B
        System.out.println("Ingrese los valores del arreglo B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor B[" + (i + 1) + "]: ");
            B[i] = scanner.nextDouble();
        }

        // Asignar valores a A según los criterios (Corregido)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    A[i][j] = B[j]; // Se usa B[j] en lugar de B[i]
                } else {
                    A[i][j] = 0;
                }
            }
        }

        // Imprimir el arreglo A
        System.out.println("El arreglo A es:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(); // Salto de línea para el siguiente renglón
        }
    }
}