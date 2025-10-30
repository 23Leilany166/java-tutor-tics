// src/Practica4_32.java
public class Practica4_32 {
    public static int[][] sumarConTraspuesta(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;
        int[][] R = new int[M][N];

        // B es N x M, su traspuesta B^T es M x N
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                R[i][j] = A[i][j] + B[j][i];
            }
        }
        return R;
    }

    // Método auxiliar para imprimir matrices (solo visual)
    public static void imprimirMatriz(int[][] M) {
        for (int[] fila : M) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
