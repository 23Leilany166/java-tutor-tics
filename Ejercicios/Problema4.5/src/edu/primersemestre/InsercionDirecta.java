package edu.primersemestre;

import java.util.*;

/**
 * Problema 4.5 — Ordenación por Inserción Directa
 * Método clásico que ordena un arreglo de enteros de forma ascendente.
 * Programación estructurada — Java 21.
 */
public class InsercionDirecta {

    /** Ordena un arreglo mediante inserción directa */
    public static void insertarOrdenado(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int clave = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > clave) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = clave;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: ");
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        insertarOrdenado(A);

        System.out.println("Arreglo ordenado:");
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
        sc.close();
    }
}
