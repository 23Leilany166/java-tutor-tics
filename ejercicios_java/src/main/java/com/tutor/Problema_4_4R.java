package com.tutor; // O tu paquete específico

import java.util.Arrays; // Importamos Arrays para imprimir fácilmente

/**
 * REFRACTORIZADO
 * Este código genera los primeros 'n' números primos y los devuelve en un arreglo.
 * La lógica está separada en métodos para poder ser probada.
 */
public class Problema_4_4R { // El nombre del archivo debe ser Problema_4_4R.java

    /**
     * Método auxiliar para verificar si un número es primo.
     * @param num El número a verificar.
     * @return true si es primo, false en caso contrario.
     */
    private boolean esPrimo(int num) {
        // El 2 es el único primo par
        if (num % 2 == 0) return false; 
        
        // Solo probamos divisores impares hasta la raíz cuadrada
        // (La lógica original usaba num / 2, pero Math.sqrt es más eficiente)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // Se encontró un divisor
            }
        }
        return true; // No se encontraron divisores
    }

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Genera un arreglo con los primeros 'n' números primos.
     *
     * @param n La cantidad de números primos a generar.
     * @return Un arreglo de int[] con los 'n' primeros primos.
     */
    public int[] generarPrimerosPrimos(int n) {
        if (n <= 0) {
            return new int[0]; // Devolver arreglo vacío si n es 0 o negativo
        }

        int[] primos = new int[n];
        primos[0] = 2; // El primer primo es 2

        int k = 1;     // Índice actual del arreglo (empezamos en 1, ya que 0 está lleno)
        int num = 3;   // Número actual que estamos probando si es primo

        // Bucle 'while' hasta que el arreglo esté lleno (k llegue a n)
        while (k < n) {
            if (esPrimo(num)) {
                primos[k] = num;
                k++;
            }
            num += 2; // Solo probamos los siguientes números impares
        }

        return primos;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Problema_4_4R ejercicio = new Problema_4_4R();
        int cantidadPrimos = 30;

        // Llamamos al método lógico
        int[] primerosPrimos = ejercicio.generarPrimerosPrimos(cantidadPrimos);

        // Imprimimos los resultados
        System.out.println("Los primeros " + cantidadPrimos + " números primos son:");
        // Usamos Arrays.toString para una impresión limpia del arreglo
        System.out.println(Arrays.toString(primerosPrimos));
    }
}