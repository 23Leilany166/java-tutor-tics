package com.ejercicios;

import java.util.Scanner;

/**
 *
 * @author imac28
 */
public class SumaSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos (N): ");
        int N = scanner.nextInt();

        double serie = calcularSumaSerie(N);

        System.out.println("La suma de la serie es: " + serie);
    }

    // Método para calcular la SERIE de la serie
    static double calcularSumaSerie(int _N) {
        double SERIE = 0;

        for (int i = 1; i <= _N; i++) {
            SERIE += Math.pow(i, i);
        }

        return SERIE;
    }
}