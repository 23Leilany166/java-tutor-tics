package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula la matriz transpuesta.
 * La lógica está separada en métodos para poder ser probada.
 */
public class Problema_4_17R { // El nombre del archivo debe ser Problema_4_17R.java

    /**
     * Valida las dimensiones de la matriz según las reglas del problema.
     * @param M Filas (1 <= M <= 50)
     * @param N Columnas (1 <= N <= 30)
     * @return true si las dimensiones son válidas, false en caso contrario.
     */
    public boolean validarDimensiones(int M, int N) {
        return (M >= 1 && M <= 50 && N >= 1 && N <= 30);
    }

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Calcula y devuelve la matriz transpuesta de la matriz original.
     *
     * @param matrizOriginal La matriz A[M][N] a transponer.
     * @return La matriz transpuesta TA[N][M].
     */
    public int[][] calcularTranspuesta(int[][] matrizOriginal) {
        // 1. Obtener dimensiones de la matriz original
        int M = matrizOriginal.length; // Número de filas
        
        // Manejar caso de matriz vacía o inválida
        if (M == 0) {
            return new int[0][0]; 
        }
        int N = matrizOriginal[0].length; // Número de columnas

        // 2. Crear la matriz transpuesta con las dimensiones invertidas
        int[][] matrizTranspuesta = new int[N][M];

        // 3. Llenar la matriz transpuesta
        for (int i = 0; i < M; i++) { // Iterar sobre filas de la original (M)
            for (int j = 0; j < N; j++) { // Iterar sobre columnas de la original (N)
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // 4. Devolver el resultado
        return matrizTranspuesta;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama a los métodos de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema_4_17R ejercicio = new Problema_4_17R(); // Instancia de la clase

        System.out.print("Ingrese numero de filas (M) y columnas (N): ");
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // 1. Llamar al método de validación
        if (ejercicio.validarDimensiones(M, N)) {
            int[][] A = new int[M][N]; // Matriz original

            // 2. Leer datos de la matriz original
            System.out.println("Ingrese elementos de la matriz:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "): ");
                    A[i][j] = scanner.nextInt();
                }
            }

            // 3. Llamar al método de lógica
            int[][] TA = ejercicio.calcularTranspuesta(A);

            // 4. Imprimir la matriz transpuesta (TA)
            System.out.println("Matriz traspuesta:");
            // Las filas de TA son N, las columnas son M
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