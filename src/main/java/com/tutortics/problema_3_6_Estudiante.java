package com.tutortics;
// src/problema_3_6_Estudiante.java
// ESQUELETO DEL EJERCICIO - Para que el estudiante complete

import java.util.Scanner;

public class problema_3_6_Estudiante {

    /**
     * Encuentra el número mayor y menor en un arreglo de enteros.
     *
     * El algoritmo debe:
     * 1. Inicializar MAY con un valor muy bajo (-100000)
     * 2. Inicializar MEN con un valor muy alto (100000)
     * 3. Recorrer todos los números con un ciclo (I desde 1 hasta N)
     * 4. Para cada número (NUM):
     *    - Si NUM > MAY, entonces MAY ← NUM
     *    - Si NUM < MEN, entonces MEN ← NUM
     * 5. Al final, MAY contendrá el mayor y MEN el menor
     *
     * TODO: Implementa la lógica para encontrar el mayor y menor
     *
     * @param numeros El arreglo de números a procesar.
     * @return Un arreglo de dos enteros donde la posición 0 es el MAYOR y la 1 es el MENOR.
     * Retorna null si el arreglo de entrada es nulo o está vacío.
     */
    public int[] encontrarMayorMenor(int[] numeros) {
        // TODO: Verifica si el arreglo es nulo o vacío
        // Pista: if (numeros == null || numeros.length == 0) return null;

        // TODO: Inicializa MAY con un valor muy bajo (por ejemplo -100000 o Integer.MIN_VALUE)
        int mayor = 0;

        // TODO: Inicializa MEN con un valor muy alto (por ejemplo 100000 o Integer.MAX_VALUE)
        int menor = 0;

        // TODO: Implementa el ciclo que recorre todos los números
        // Estructura Repetitiva (Ciclo)
        // Pista: for (int num : numeros) { ... }

            // TODO: Si num > mayor, actualiza mayor

            // TODO: Si num < menor, actualiza menor


        // TODO: Retorna un arreglo con [mayor, menor]
        return new int[]{mayor, menor};
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_3_6_Estudiante buscador = new problema_3_6_Estudiante();

        System.out.println("Introduce la cantidad de números a ingresar (N):");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            int[] numerosIngresados = new int[n];
            System.out.println("Introduce los " + n + " números:");

            // TODO: Lee los N números y guárdalos en el arreglo
            // Pista: Usa un ciclo for desde i=0 hasta i<n


            // TODO: Llama al método encontrarMayorMenor
            int[] resultado = null;

            if (resultado != null) {
                System.out.println("===================================");
                System.out.println("El número MAYOR es: " + resultado[0]);
                System.out.println("El número MENOR es: " + resultado[1]);
                System.out.println("===================================");
            }
        }
        scanner.close();
    }
}
