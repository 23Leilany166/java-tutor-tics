package com.ejercicios;

import java.util.Scanner;

public class CalcularCotangente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del seno: ");
        double seno = scanner.nextDouble(); //
        System.out.print("Ingrese el valor del coseno: ");
        double coseno = scanner.nextDouble(); //

        if (seno != 0) { //
            double cotangente = coseno / seno; //
            System.out.printf("La cotangente es: %.4f%n", cotangente);
        } else {
            System.out.println("La cotangente es indefinida (seno es cero)."); //
        }

        scanner.close();
    }
}