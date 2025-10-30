package com.tutor; // O tu paquete específico

import java.math.BigInteger;
import java.util.Arrays; // Importamos Arrays para imprimir

public class PS_4_6 { // El nombre del archivo debe ser PS_4_6.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe generar y devolver un arreglo
     * que contenga los primeros 'n' números Fibonacci.
     *
     * IMPORTANTE: Debes usar 'BigInteger' ya que los números crecen mucho.
     *
     * @param n La cantidad de números Fibonacci a generar (ej. 100).
     * @return Un arreglo de BigInteger[] con los 'n' primeros números.
     */
    public BigInteger[] generarFibonacci(int n) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        if (n <= 0) {
            return new BigInteger[0];
        }

        BigInteger[] fibonacci = new BigInteger[n];
        
        // Escribe tu lógica aquí:
        // 1. Asigna fibonacci[0] (si n >= 1). Usa BigInteger.ZERO.
        // 2. Asigna fibonacci[1] (si n >= 2). Usa BigInteger.ONE.
        // 3. Usa un bucle 'for' (desde i=2 hasta n-1) para calcular el resto.
        //    Pista: usa el método .add() de BigInteger (ej. num1.add(num2)).


        return fibonacci; // Devuelve el arreglo lleno

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        PS_4_6 ejercicio = new PS_4_6();
        int cantidad = 100;

        BigInteger[] primerosCienFibonacci = ejercicio.generarFibonacci(cantidad);

        System.out.println("Los primeros " + cantidad + " números Fibonacci son:");
        System.out.println(Arrays.toString(primerosCienFibonacci));
    }
}