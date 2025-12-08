package com.javatutor.ps_4_20;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int M, N;

        double[][] A = new double[31][21];  // máximos: M<30, N<20
        double[] B = new double[21];

        System.out.print("Ingrese el valor de M (max 30): ");
        M = leer.nextInt();
        System.out.print("Ingrese el valor de N (max 20): ");
        N = leer.nextInt();

        // Leer vector B
        System.out.println("\nIngrese los valores del vector B:");
        for (int i = 1; i <= N; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = leer.nextDouble();
        }

        // Asignar valores a la matriz A según las reglas
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {

                if (i < j) {
                    A[i][j] = B[i];   // regla a)
                } else if (i > j) {
                    A[i][j] = 0;      // regla b)
                } else {
                    A[i][j] = B[i];   // i == j también toma B[i]
                }
            }
        }

        // Imprimir matriz resultante
        System.out.println("\nMatriz A resultante:");
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
