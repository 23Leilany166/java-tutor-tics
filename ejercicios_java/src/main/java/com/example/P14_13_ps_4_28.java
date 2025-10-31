/*
Dada una matriz cuadrada MAT (M x N), construya un progrma que determine
si la misma puede considerarse como un cuadrado m ́agico. Un cuadrado m ́agico es aquel
en que la suma de las filas, columnas y diagonales siempre tiene el mismo valor.
Dato: A[1..N, 1..N] (arreglo bidimensional de tipo entero, 1 ≤ N ≤ 50).
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class P14_13_ps_4_28 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int N = scanner.nextInt();

        int[][] A = new int[N][N];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el elemento en la posición (" + i + "," + j + "): ");
                A[i][j] = scanner.nextInt();
            }
        }

        int sumaReferencia = sumarFila(A, 0);

        for (int i = 1; i < N; i++) {
            int sumaFila = sumarFila(A, i);
            if (sumaFila != sumaReferencia) {
                System.out.println("La matriz no es un cuadrado mágico");
                return;
            }
        }

        for (int j = 0; j < N; j++) {
            int sumaColumna = sumarColumna(A, j);
            if (sumaColumna != sumaReferencia) {
                System.out.println("La matriz no es un cuadrado mágico");
                return;
            }
        }

        int sumaDiagonal1 = sumarDiagonalPrincipal(A);
        if (sumaDiagonal1 != sumaReferencia) {
            System.out.println("La matriz no es un cuadrado mágico");
            return;
        }

        int sumaDiagonal2 = sumarDiagonalSecundaria(A);
        if (sumaDiagonal2 != sumaReferencia) {
            System.out.println("La matriz no es un cuadrado mágico");
            return;
        }

        System.out.println("La matriz es un cuadrado mágico");
    }

    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }
}
