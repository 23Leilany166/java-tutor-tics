package com.ejercicios;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author imac13
 */
public class Capital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el número de meses: ");
        int meses = dato.nextInt();

        System.out.println("Ingrese el capital inicial: ");
        double capIni = dato.nextInt();

        double[] tasas = new double[meses];

        for (int i = 0; i < meses; i++) {
            System.out.println("Ingrese el interés mensual: ");
            tasas[i] = dato.nextDouble();
        }

        double montoFinal = calcularMonto(capIni, tasas);
        System.out.println("El monto final de la inversión es: " + montoFinal);
    }

    public static double calcularMonto(double capIni, double[] tasas) {
        double montoFinal = capIni;

        for (double tasa : tasas) {
            montoFinal += montoFinal * tasa;
        }

        return montoFinal;
    }
}