package com.ejercicios.noresueltos;
import java.util.*;

public class esqueleto4_16{

    // Método para construir el arreglo B a partir de la matriz A
    public static long[] construirB(long[][] A, int M, int N) {

        // Declarar arreglo B de tamaño M+1

        // Recorrer filas de 1..M

            // Crear variable suma


            // Si la fila es par → multiplicar fila i con fila i-1
            // if (i % 2 == 0) {
            //     for (int j = 1; j <= N; j++) {
            //         s += A[i][j] * A[i-1][j];
            //     }
            // }
            // Si la fila es impar → sumar solo la fila i
            // else {
            //     for (int j = 1; j <= N; j++) {
            //         s += A[i][j];
            //     }
            // }

            // Guardar resultado en B[i]
            // B[i] = s;
        // }

        // return B;

        return new long[0]; // temporal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer M y N (tamaño de la matriz)
        // int M = sc.nextInt();
        // int N = sc.nextInt();

        // Declarar matriz A de tamaño [M+1][N+1]
        // long[][] A = new long[M+1][N+1];

        // Llenar matriz A con datos del usuario
        // for (int i = 1; i <= M; i++) {
        //     for (int j = 1; j <= N; j++) {
        //         A[i][j] = sc.nextLong();
        //     }
        // }

        // Llamar construirB(A, M, N)
        // long[] B = construirB(A, M, N);

        // Imprimir el arreglo B
        // for (int i = 1; i <= M; i++) {
        //     System.out.print(B[i] + (i < M ? " " : "\n"));
        // }

        sc.close();
    }
}

