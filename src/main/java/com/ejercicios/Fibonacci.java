
package com.ejercicios;

/**
 *
 * @author imac28
 */

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        // Creación del arreglo para almacenar los números Fibonacci
        BigInteger[] fibonacci = new BigInteger[100];

        // Calcula los primeros 100 números Fibonacci y los almacena en el arreglo
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        // Imprime el arreglo de números Fibonacci
        System.out.println("Arreglo de los primeros 100 números Fibonacci:");

        for (int i = 0; i < 100; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}