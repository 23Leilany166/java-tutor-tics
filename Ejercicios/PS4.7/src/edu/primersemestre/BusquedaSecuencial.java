package edu.primersemestre;

import java.util.*;

/**
 * PS 4.7 — Búsqueda secuencial en un vector
 * Programa estructurado para encontrar el elemento X en VECTOR[1..N]
 */
public class BusquedaSecuencial {

    /** Retorna el índice si se encuentra X; -1 en caso contrario */
    public static int buscarSecuencial(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N (1..50): ");
        int N = sc.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Error: N fuera de rango.");
            sc.close();
            return;
        }

        int[] VECTOR = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("VECTOR[" + (i + 1) + "]: ");
            VECTOR[i] = sc.nextInt();
        }

        System.out.print("Elemento a buscar (X): ");
        int X = sc.nextInt();

        int pos = buscarSecuencial(VECTOR, X);

        if (pos >= 0) {
            System.out.println("Elemento encontrado en la posición: " + (pos + 1));
        } else {
            System.out.println("Elemento no encontrado en el vector.");
        }

        sc.close();
    }
}
