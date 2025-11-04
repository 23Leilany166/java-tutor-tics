package com.programa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ps_4_18 - Plantilla para generar matriz identidad
 *
 * OBJETIVO:
 * Implementar el método generarIdentidad(int n) que devuelve una matriz n x n
 * con 1s en la diagonal principal y 0s en el resto.
 *
 * INSTRUCCIONES:
 * - Mantén la firma del método.
 * - Para n <= 0 retorna una matriz vacía int[0][0].
 * - Si n es razonable (ej. 1..50) genera la matriz identidad.
 */
public class ps_4_18 {

    // Lógica separada
    public int[][] generarIdentidad(int n) {
        // TODO: Implementa la generación de la matriz identidad
        // Sugerencia:
        // int[][] a = new int[n][n];
        // for (int i=0; i<n; i++) { a[i][i] = 1; }
        
        return new int[0][0]; // Reemplaza con la matriz generada
    }

    // El main solo maneja I/O (no requiere cambios por parte del alumno)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_4_18 mi = new ps_4_18();

        System.out.print("Ingrese la dimensión N de la matriz: ");
        int n = scanner.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Dimensión fuera de rango.");
        } else {
            int[][] matriz = mi.generarIdentidad(n);
            
            System.out.println("--- Matriz Identidad Generada ---");
            for (int[] row : matriz) {
                System.out.println(Arrays.toString(row));
            }
        }
        scanner.close();
    }
}