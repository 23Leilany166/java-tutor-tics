package com.example;

import java.util.Scanner;

public class P14_3_pro_2_10 {

    /**
     * Compara tres números y devuelve un mensaje indicando cuál es el mayor.
     * @param A El primer número.
     * @param B El segundo número.
     * @param C El tercer número.
     * @return Un String con el resultado de la comparación.
     */
    public String encontrarMayor(double A, double B, double C) {
        if (A > B) {
            if (A > C) {
                return "A es el mayor.";
            } else if (A == C) {
                return "A y C son los mayores.";
            } else {
                return "C es el mayor.";
            }
        } else if (A == B) {
            if (A > C) {
                return "A y B son los mayores.";
            } else if (A == C) {
                return "A, B y C son los mayores.";
            } else {
                return "C es el mayor.";
            }
        } else { // B > A
            if (B > C) {
                return "B es el mayor.";
            } else if (B == C) {
                return "B y C son los mayores.";
            } else {
                return "C es el mayor.";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_3_pro_2_10 comparador = new P14_3_pro_2_10();

        System.out.println("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        String resultado = comparador.encontrarMayor(A, B, C);
        System.out.println(resultado);
        
        scanner.close();
    }
}