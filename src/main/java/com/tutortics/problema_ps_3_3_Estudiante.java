package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.3 - Contar Pares e Impares (Archivo para Estudiante)
 * Dado N números enteros, determina cuántos son pares y cuántos impares.
 * Programación Estructurada: todos los métodos son estáticos.
 * 
 * INSTRUCCIONES: Completa los métodos marcados con TODO
 */
public class problema_ps_3_3_Estudiante {

    /**
     * Clase para almacenar el resultado del conteo de pares e impares.
     */
    public static class ResultadoConteo {
        public int pares;
        public int impares;
        
        public ResultadoConteo(int pares, int impares) {
            this.pares = pares;
            this.impares = impares;
        }
    }

    /**
     * Cuenta cuántos números en el arreglo son pares y cuántos son impares.
     * 
     * @param numeros Arreglo de números enteros
     * @param n Cantidad de números a procesar
     * @return Objeto ResultadoConteo con pares e impares
     */
    public static ResultadoConteo contarParesImpares(int[] numeros, int n) {
        // TODO: Inicializar PARES en 0
        
        // TODO: Inicializar IMPARES en 0
        
        // TODO: Crear un ciclo for desde i = 0 hasta i < n
        
            // TODO: Obtener el número en la posición i
            
            // TODO: Verificar si el número es par usando num % 2 == 0
            
                // TODO: Si es par, incrementar PARES
                
            // TODO: Si no es par (else)
            
                // TODO: Incrementar IMPARES
        
        // TODO: Retornar un nuevo ResultadoConteo con los valores de PARES e IMPARES
        
        return null; // Reemplaza esta línea con tu código
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Contador de Números Pares e Impares");
        System.out.println("========================================");
        
        // Lectura de N
        System.out.print("¿Cuántos números desea ingresar? N = ");
        int n = scanner.nextInt();

        // Leer los N números
        int[] numeros = new int[n];
        System.out.println("\nIngrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar pares e impares
        ResultadoConteo resultado = contarParesImpares(numeros, n);

        // Mostrar resultados
        System.out.println("\n========================================");
        System.out.println("Resultados:");
        System.out.println("Números PARES: " + resultado.pares);
        System.out.println("Números IMPARES: " + resultado.impares);
        System.out.println("========================================");

        scanner.close();
    }
}
