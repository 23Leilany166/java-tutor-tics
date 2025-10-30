package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_4_17 { // El nombre del archivo debe ser Problema_4_17.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe calcular y devolver la matriz transpuesta
     * de la matriz que recibe como parámetro.
     *
     * @param matrizOriginal La matriz A[M][N]
     * @return La matriz transpuesta TA[N][M]
     */
    public int[][] calcularTranspuesta(int[][] matrizOriginal) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        // 1. Obtén las dimensiones M (filas) y N (columnas) de la matrizOriginal
        // Pista: M = matrizOriginal.length;
        int M = 0; // Reemplazar
        int N = 0; // Reemplazar
        
        // 2. Crea la nueva matriz transpuesta con las dimensiones N y M
        int[][] matrizTranspuesta = new int[N][M]; // Esto fallará si M o N es 0
        
        // 3. Escribe los bucles anidados para copiar A[i][j] a TA[j][i]
        
        
        // 4. Devuelve la matriz transpuesta
        return matrizTranspuesta; 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * Método auxiliar para validar dimensiones.
     * No necesitas modificarlo.
     */
    public boolean validarDimensiones(int M, int N) {
        return (M >= 1 && M <= 50 && N >= 1 && N <= 30);
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema_4_17 ejercicio = new Problema_4_17();
        
        System.out.print("Ingrese numero de filas (M) y columnas (N): ");
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        // Llama al método de validación
        if (ejercicio.validarDimensiones(M, N)) {
            int[][] A = new int[M][N];
            
            System.out.println("Ingrese elementos de la matriz A:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "): ");
                    A[i][j] = scanner.nextInt();
                }
            }
            
            // Llama al método que el estudiante debe implementar
            int[][] TA = ejercicio.calcularTranspuesta(A);
            
            // Imprime el resultado
            System.out.println("Matriz traspuesta:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(TA[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error en los datos (M debe estar entre 1-50, N entre 1-30)");
        }
        scanner.close();
    }
}