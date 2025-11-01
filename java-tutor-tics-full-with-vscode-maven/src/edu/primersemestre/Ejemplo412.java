package edu.primersemestre;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 4.12 — Solución completa
 * 
 * Ordena un arreglo (1 ≤ N ≤ 50) por selección directa (Selection Sort).
 * 
 * Pasos generales:
 *  - Leer N (validar 1..50) y luego los N elementos de VECTOR.
 *  - Para i=0..N-2:
 *      - Buscar el índice del menor en VECTOR[i..N-1].
 *      - Intercambiar VECTOR[i] con VECTOR[k] (si k != i).
 *  - Imprimir el arreglo ordenado.
 */
public class Ejemplo412 {

    /** Intercambia VECTOR[i] y VECTOR[j] */
    public static void swap(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    /** Devuelve el índice del menor elemento en v[from..n-1] */
    public static int indiceMenorDesde(int[] v, int from, int n) {
        int k = from;
        for (int i = from + 1; i < n; i++) {
            if (v[i] < v[k]) {
                k = i;
            }
        }
        return k;
    }

    /** Ordena el arreglo por selección directa */
    public static void seleccion(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            int k = indiceMenorDesde(v, i, n);
            if (k != i) {
                swap(v, i, k);
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 4.12 ==");
        System.out.print("Ingrese N (1..50): ");
        int N = sc.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Error en los datos");
            sc.close();
            return;
        }

        int[] vector = new int[50]; // máximo 50
        for (int i = 0; i < N; i++) {
            System.out.printf("Elemento [%d]: ", i + 1);
            vector[i] = sc.nextInt();
        }

        seleccion(vector, N);

        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(Arrays.copyOf(vector, N)));

        sc.close();
    }
}
