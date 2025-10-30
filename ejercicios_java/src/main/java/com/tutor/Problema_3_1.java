package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_3_1 {
    /**
     * Clase interna estática para almacenar los resultados.
     * No modificar esta clase.
     */
    public static class ResultadosCalculo {
        public final long sumaImpares;
        public final double promedioPares;

        public ResultadosCalculo(long sumaImpares, double promedioPares) {
            this.sumaImpares = sumaImpares;
            this.promedioPares = promedioPares;
        }
    }

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe procesar el arreglo "numeros" y devolver
     * un objeto ResultadosCalculo que contenga:
     * 1. La suma de todos los números impares.
     * 2. El promedio de todos los números pares.
     *
     * @param numeros El arreglo de números a procesar.
     * @return Un objeto ResultadosCalculo con los resultados.
     */
    public ResultadosCalculo procesarNumeros(int[] numeros) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        // Declara tus variables acumuladoras aquí
        long sumaImpares = 0;
        long sumaPares = 0;
        int conteoPares = 0;

        // Escribe el bucle para iterar sobre el arreglo "numeros"

        // Escribe la lógica para sumar pares e impares

        // Escribe la lógica para calcular el promedio de pares (cuidado con la división por cero)
        double promedioPares = 0.0;


        // Devuelve el objeto con tus resultados
        return new ResultadosCalculo(sumaImpares, promedioPares); 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema_3_1 ejercicio = new Problema_3_1();
        
        // NOTA: Para pruebas manuales rápidas, puedes cambiar este número
        final int CANTIDAD_NUMEROS = 5; // Original: 270
        
        int[] numerosIngresados = new int[CANTIDAD_NUMEROS];
        
        System.out.println("Ingrese " + CANTIDAD_NUMEROS + " números enteros:");

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosIngresados[i] = scanner.nextInt();
        }

        ResultadosCalculo resultados = ejercicio.procesarNumeros(numerosIngresados);

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma de los números impares: " + resultados.sumaImpares);
        System.out.println("Promedio de los números pares: " + resultados.promedioPares);

        scanner.close();
    }
}