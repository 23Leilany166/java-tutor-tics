package com.programa;

import java.util.Arrays;

/**
 * problema_4_13 - Plantilla para intercambiar mitades de una matriz
 *
 * OBJETIVO:
 * Implementar el método intercambiar(int[][] matrix) que invierte las filas
 * de la matriz (intercambia fila 0 con fila N-1, fila 1 con fila N-2, ...).
 *
 * INSTRUCCIONES:
 * - Modifica la matriz "in-place".
 * - Maneja matrices n x n y casos n == 0 o matrix == null.
 */
public class problema_4_13 {

    // Lógica separada
    // Modifica la matriz "in-place" (directamente), no devuelve nada (void)
    public void intercambiar(int[][] matrix) {
        // TODO: Implementa el intercambio de filas
        // Sugerencia: usa dos índices i (desde 0) y k = n-1-i para swap
    }
    
    // Método main para demostración
    public static void main(String[] args) {
        problema_4_13 ir = new problema_4_13();
        int[][] a = {
            {10, 15, 28, 49},
            {68, 115, 36, 15},
            {90, 0, 7, 28},
            {87, 5, 13, 56}
        };

        System.out.println("--- Matriz Original ---");
        printMatrix(a);

        ir.intercambiar(a); // Modifica la matriz 'a'

        System.out.println("\n--- Matriz Modificada ---");
        printMatrix(a);
    }

    // Método de utilidad para imprimir
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}