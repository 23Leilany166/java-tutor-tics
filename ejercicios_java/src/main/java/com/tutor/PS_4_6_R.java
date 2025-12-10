package com.tutor; // O tu paquete específico

import java.math.BigInteger;
import java.util.Arrays; // Importamos Arrays para imprimir fácilmente

/**
 * REFRACTORIZADO
 * Este código genera los primeros 'n' números Fibonacci.
 * Toda la lógica está contenida en el método main para principiantes.
 */
public class PS_4_6_R { // El nombre del archivo debe ser PS_4_6R.java

    /**
     * El método main contiene toda la lógica del programa.
     */
    public static void main(String[] args) {
        int cantidad = 100;

        // Crear el arreglo para almacenar los números Fibonacci
        BigInteger[] fibonacci = new BigInteger[cantidad];

        // Manejar el caso base n=1
        if (cantidad >= 1) {
            fibonacci[0] = BigInteger.ZERO; // F(0) = 0
        }
        // Manejar el caso base n=2
        if (cantidad >= 2) {
            fibonacci[1] = BigInteger.ONE; // F(1) = 1
        }

        // Bucle para calcular el resto (desde el 3er elemento, índice 2)
        for (int i = 2; i < cantidad; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        // Imprimimos los resultados
        System.out.println("Los primeros " + cantidad + " números Fibonacci son:");
        // Usamos Arrays.toString para una impresión limpia del arreglo
        System.out.println(Arrays.toString(fibonacci));
    }
}