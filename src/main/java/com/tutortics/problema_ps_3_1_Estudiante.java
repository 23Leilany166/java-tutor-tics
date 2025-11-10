package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.1 - Suma de N Primeros Números Naturales
 * ACTIVIDAD PARA EL ESTUDIANTE
 * 
 * Completa los métodos marcados con TODO siguiendo el diagrama de flujo.
 */
public class problema_ps_3_1_Estudiante {

    /**
     * TODO: Calcula la suma de los N primeros números naturales.
     * 
     * Pista: 
     * 1. Inicializa SUMA = 0
     * 2. Usa un ciclo for desde I = 1 hasta I <= N
     * 3. En cada iteración: SUMA = SUMA + I
     * 4. Retorna SUMA
     * 
     * @param n Cantidad de números a sumar
     * @return La suma de 1 + 2 + 3 + ... + N
     */
    public static int calcularSuma(int n) {
        // TODO: Implementar el cálculo de la suma
        return 0;
    }

    /**
     * Método principal - YA IMPLEMENTADO
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de N
        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        // Calcular la suma
        int suma = calcularSuma(n);

        // Mostrar resultado
        System.out.println("\n========================================");
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        System.out.println("========================================");

        scanner.close();
    }
}
