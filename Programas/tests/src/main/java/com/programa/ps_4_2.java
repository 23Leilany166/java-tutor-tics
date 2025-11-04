package com.programa;

import java.util.Scanner;

/**
 * ps_4_2 - Plantilla para contar ocurrencias en un arreglo
 *
 * OBJETIVO:
 * Implementar el método contarOcurrencias(int[] vec, int num) que devuelve
 * cuántas veces aparece num en el arreglo vec.
 *
 * INSTRUCCIONES PARA ALUMNOS:
 * - Mantén la firma del método.
 * - Considera que vec puede ser null.
 * - Recorre el arreglo y cuenta las coincidencias exactas.
 */
public class ps_4_2 {

    // Lógica separada
    public int contarOcurrencias(int[] vec, int num) {
        // TODO: Implementa la lógica para contar cuántas veces aparece num en vec
        // Sugerencia: maneja el caso vec == null
        return 0; // Reemplaza con tu implementación
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_4_2 c = new ps_4_2();

        // Llenar el arreglo
        int[] vec = new int[10]; // O 100
        System.out.println("Ingrese " + vec.length + " números:");
        for(int i=0; i < vec.length; i++) {
            vec[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int num = scanner.nextInt();
        int total = c.contarOcurrencias(vec, num);
        
        System.out.printf("El número %d se encuentra %d veces en el arreglo.\n", num, total);
        scanner.close();
    }
}