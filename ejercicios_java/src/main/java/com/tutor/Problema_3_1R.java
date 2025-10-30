package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_3_1R { // El nombre del archivo debe ser Problema_3_1R.java

    /**
     * Clase interna estática para almacenar los resultados del cálculo.
     * Al ser estática, puede ser usada por los tests.
     */
    public static class ResultadosCalculo {
        public final long sumaImpares;
        public final double promedioPares;
        public final int conteoPares; // <-- 1. AÑADIR ESTA LÍNEA

        public ResultadosCalculo(long sumaImpares, double promedioPares, int conteoPares) { // <-- 2. AÑADIR conteoPares AQUÍ
            this.sumaImpares = sumaImpares;
            this.promedioPares = promedioPares;
            this.conteoPares = conteoPares; // <-- 3. AÑADIR ESTA LÍNEA
        }
    }

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Procesa un arreglo de números y devuelve la suma de impares y el promedio de pares.
     *
     * @param numeros El arreglo de números a procesar.
     * @return Un objeto ResultadosCalculo con los resultados.
     */
    public ResultadosCalculo procesarNumeros(int[] numeros) {
        
        long sumaImpares = 0;
        long sumaPares = 0;
        int conteoPares = 0;

        // Bucle para procesar el arreglo
        for (int numero : numeros) {
            // Verificar si es par o impar
            if (numero % 2 == 0) {
                // Es par
                sumaPares += numero;
                conteoPares++;
            } else {
                // Es impar
                sumaImpares += numero;
            }
        }

        // Calcular el promedio de los pares
        double promedioPares = 0.0;
        if (conteoPares > 0) {
            promedioPares = (double) sumaPares / conteoPares;
        }

        // Devolver un nuevo objeto con los resultados
        return new ResultadosCalculo(sumaImpares, promedioPares, conteoPares); // <-- 4. PASAR conteoPares AL CONSTRUCTOR
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema_3_1R ejercicio = new Problema_3_1R();
        
        // Crear un arreglo para guardar los 270 números
        int[] numerosIngresados = new int[270];
        
        System.out.println("Ingrese 270 números enteros:");

        // Bucle solo para leer los datos
        for (int i = 0; i < 270; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosIngresados[i] = scanner.nextInt();
        }

        // Llamar al método de lógica con el arreglo lleno
        ResultadosCalculo resultados = ejercicio.procesarNumeros(numerosIngresados);

        // Imprimir los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma de los números impares: " + resultados.sumaImpares);

        // <-- 5. CORREGIR LA CONDICIÓN 'IF'
        if (resultados.conteoPares > 0) { 
            System.out.println("Promedio de los números pares: " + resultados.promedioPares);
        } else {
            System.out.println("No se ingresaron números pares para calcular el promedio.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}