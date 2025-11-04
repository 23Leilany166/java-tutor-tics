package com.programa;

import java.util.ArrayList;
import java.util.List;

/**
 * problema_5_1 - Plantilla para sumar matrices dispersas representadas como listas
 *
 * OBJETIVO:
 * Implementar el método sumar() que, dadas dos listas de elementos no nulos
 * (A1 y B1) y las dimensiones MxN, construya la matriz resultante C = A + B.
 *
 * INSTRUCCIONES PARA ALUMNOS:
 * - Cada MatrizElemento tiene (ren, col, val).
 * - Las listas A1 y B1 están ordenadas por (ren, col). Usa un merge similar al
 *   de dos listas ordenadas para construir C sin iterar toda la matriz si es posible.
 */
public class problema_5_1 {

    // Lógica separada
    public int[][] sumar(List<MatrizElemento> A1, List<MatrizElemento> B1, int M, int N) {
        // TODO: Implementa la suma de matrices representadas por listas de elementos
        // Pasos sugeridos:
        // 1. Crea la matriz int[][] C = new int[M][N];
        // 2. Usa dos índices i, j para recorrer A1 y B1
        // 3. Compara (ren,col) de A1[i] y B1[j] para decidir si copiar o sumar
        // 4. Maneja los elementos restantes cuando una lista termine
        
        return new int[M][N]; // Reemplaza con la matriz resultante
    }


    public static void main(String[] args) {
        problema_5_1 s = new problema_5_1();
        int M = 3, N = 4;

        List<MatrizElemento> A1 = new ArrayList<>();
        A1.add(new MatrizElemento(0, 0, 5));
        A1.add(new MatrizElemento(1, 2, 7));

        List<MatrizElemento> B1 = new ArrayList<>();
        B1.add(new MatrizElemento(0, 0, 10)); // Suma
        B1.add(new MatrizElemento(2, 2, 9)); // Nuevo

        int[][] C = s.sumar(A1, B1, M, N);

        System.out.println("--- Matriz Resultante C (A + B) ---");
        for (int r = 0; r < M; r++) {
            System.out.println(java.util.Arrays.toString(C[r]));
        }
    }
}