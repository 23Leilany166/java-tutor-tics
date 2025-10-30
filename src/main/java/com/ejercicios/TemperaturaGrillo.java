package com.ejercicios;

import java.util.Scanner;

public class TemperaturaGrillo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de sonidos por minuto (N): ");
        int n = scanner.nextInt(); // Leer N

        // Verificar si N es positivo antes de calcular
        if (n > 0) { // Si N > 0 [cite: 1672]
            // Calcular T = N/4 + 40. Usar 4.0 para división flotante
            double t = n / 4.0 + 40;
            // Imprimir la temperatura formateada [cite: 1675]
            System.out.printf("Temperatura calculada: %.2f grados Fahrenheit%n", t);
        } else {
            // Si N no es positivo, no se hace el cálculo ni se imprime T
            System.out.println("El número de sonidos debe ser un entero positivo.");
        }

        scanner.close();
    }
}