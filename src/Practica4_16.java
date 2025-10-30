import java.util.Scanner;

public class Practica4_16 {

    /**
     * Muestra la diagonal principal de una matriz cuadrada A[N][N].
     */
    public static void imprimirDiagonal(double[][] A, int N) {
        System.out.println("Diagonal principal de la matriz:");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Ingrese el tamaño N de la matriz (1 < N < 50): ");
            N = sc.nextInt();
        } while (N <= 1 || N >= 50);

        double[][] A = new double[N][N];

        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = sc.nextDouble();
            }
        }

        imprimirDiagonal(A, N);
        sc.close();
    }
}
