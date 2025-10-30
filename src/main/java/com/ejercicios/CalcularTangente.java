package com.ejercicios;

import java.util.Scanner;

public class CalcularTangente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del seno: ");
        double seno = scanner.nextDouble(); //
        System.out.print("Ingrese el valor del coseno: ");
        double coseno = scanner.nextDouble(); //

        if (coseno != 0) { //
            double tangente = seno / coseno; //
            System.out.printf("La tangente es: %.4f%n", tangente);
        } else {
            System.out.println("La tangente es indefinida (coseno es cero)."); //
        }

        scanner.close();
    }
}