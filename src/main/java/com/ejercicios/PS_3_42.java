/*
hacer operaciones

 */
package com.ejercicios;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_3_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();

        int x = 0;
        int k = 0;

        if (n > 0) {
            while (n > 0) {
                k = n % 10;
                x = x * 10 + k;
                n = n / 10;
            }
            System.out.println("k -> n % 10 = " + k);
            System.out.println("x -> x * 10 + k = " + x);
            System.out.println("n -> n / 10= " + n);
        } else {
            System.out.println("El número ingresado no es válido.");
        }
    }
}