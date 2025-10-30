package com.ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ContarPosNegNulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SIZE = 300; // Tamaño máximo permitido
        int n;

        System.out.print("Ingrese el tamaño del arreglo (max " + MAX_SIZE + "): ");
        n = scanner.nextInt();

        if (n < 1 || n > MAX_SIZE) {
            System.out.println("Tamaño inválido.");
            scanner.close();
            return;
        }

        int[] arre = new int[n]; // Arreglo de enteros
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        System.out.println("Ingrese los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            arre[i] = scanner.nextInt();
        }

        // Contar
        for (int elemento : arre) {
            if (elemento > 0) { // número positivo
                positivos++;
            } else if (elemento < 0) { // número negativo
                negativos++;
            } else { // número nulo
                nulos++;
            }
        }

        System.out.println("\n--- Conteo ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Nulos: " + nulos);

        scanner.close();
    }
}
