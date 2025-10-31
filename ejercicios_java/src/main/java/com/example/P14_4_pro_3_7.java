package com.example;

import java.util.Scanner;

public class P14_4_pro_3_7 {

    /**
     * Clasifica una lista de ventas en chicas, medianas y grandes.
     * @param ventas Un arreglo de doubles con los montos de las ventas.
     * @return Un arreglo de enteros de tamaño 3: [conteo_chicas, conteo_medianas, conteo_grandes].
     */
    public int[] clasificarVentas(double[] ventas) {
        int chi = 0; // Ventas chicas
        int med = 0; // Ventas medianas
        int gra = 0; // Ventas grandes

        for (double v : ventas) {
            if (v <= 200.0) {
                chi++;
            } else if (v < 400.0) {
                med++;
            } else {
                gra++;
            }
        }
        return new int[]{chi, med, gra};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_4_pro_3_7 clasificador = new P14_4_pro_3_7();

        System.out.print("Ingrese la cantidad de ventas: ");
        int n = scanner.nextInt();
        double[] montosVentas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la venta #" + (i + 1) + ": ");
            montosVentas[i] = scanner.nextDouble();
        }

        int[] resultados = clasificador.clasificarVentas(montosVentas);

        System.out.println("Ventas chicas: " + resultados[0]);
        System.out.println("Ventas medianas: " + resultados[1]);
        System.out.println("Ventas grandes: " + resultados[2]);
        
        scanner.close();
    }
}