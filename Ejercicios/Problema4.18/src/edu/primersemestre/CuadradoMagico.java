package edu.primersemestre;

import java.util.*;

/**
 * Problema 4.18 — Cuadrado Mágico
 * Genera un cuadrado mágico de orden N (impar, 1 <= N <= 50) usando el método de Siam.
 * Programación estructurada — Java 21.
 */
public class CuadradoMagico {

    public static int[][] generar(int N) {
        int[][] CM = new int[N][N];
        int i = 0;
        int j = N / 2;
        CM[i][j] = 1;

        for (int num = 2; num <= N * N; num++) {
            int iPrev = i, jPrev = j;
            i = (i - 1 + N) % N;
            j = (j + 1) % N;

            if (CM[i][j] != 0) {
                i = (iPrev + 1) % N;
                j = jPrev;
            }
            CM[i][j] = num;
        }
        return CM;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N (impar, 1..50): ");
        int N = sc.nextInt();

        if (N < 1 || N > 50 || N % 2 == 0) {
            System.out.println("Error en el dato: N debe ser impar entre 1 y 50.");
            sc.close();
            return;
        }

        int[][] CM = generar(N);
        int M = N * (N * N + 1) / 2;
        System.out.println("Cuadrado mágico de orden " + N + " (M = " + M + "):");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", CM[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
