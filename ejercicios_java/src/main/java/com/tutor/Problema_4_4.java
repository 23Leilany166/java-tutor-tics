package com.tutor; // O tu paquete específico

import java.util.Arrays; // Importamos Arrays para imprimir

public class Problema_4_4 { // El nombre del archivo debe ser Problema_4_4.java

    /**
     * Método auxiliar (opcional): El estudiante puede crear su propio
     * método para verificar si un número es primo si lo desea.
     * private boolean esPrimo(int num) { ... }
     */
    

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe generar y devolver un arreglo de enteros
     * que contenga los primeros 'n' números primos.
     *
     * @param n La cantidad de números primos a generar.
     * @return Un arreglo de int[] con los 'n' primeros primos.
     */
    public int[] generarPrimerosPrimos(int n) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        if (n <= 0) {
            return new int[0];
        }

        int[] primos = new int[n];
        
        // Escribe aquí tu lógica:
        // 1. Añade el 2 como el primer primo.
        // 2. Escribe un bucle (while) que busque los siguientes n-1 primos.
        // 3. Dentro del bucle, necesitarás otro bucle o un método para verificar si un número es primo.
        // 4. Añade los primos encontrados al arreglo.
        // 5. Continúa hasta que el arreglo esté lleno.


        return primos; // Devuelve el arreglo lleno

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Problema_4_4 ejercicio = new Problema_4_4();
        int cantidadPrimos = 30;

        int[] primerosPrimos = ejercicio.generarPrimerosPrimos(cantidadPrimos);

        System.out.println("Los primeros " + cantidadPrimos + " números primos son:");
        System.out.println(Arrays.toString(primerosPrimos));
    }
}