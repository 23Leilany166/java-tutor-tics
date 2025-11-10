package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 1.6 - Plan de Financiamiento Automotriz
 * ACTIVIDAD PARA EL ESTUDIANTE
 * 
 * Completa los métodos marcados con TODO siguiendo el diagrama de flujo.
 */
public class problema_ps_1_6_Estudiante {

    /**
     * TODO: Calcula el enganche del vehículo (35% del monto total).
     * 
     * Pista: ENG = MON * 0.35
     * 
     * @param mon Monto total del vehículo
     * @return Enganche a pagar
     */
    public static double calcularEnganche(double mon) {
        // TODO: Implementar el cálculo del enganche
        return 0.0;
    }

    /**
     * TODO: Calcula la mensualidad (resto después del enganche / 18 meses).
     * 
     * Pista: MEN = (MON - ENG) / 18
     * 
     * @param mon Monto total del vehículo
     * @param eng Enganche ya pagado
     * @return Mensualidad a pagar
     */
    public static double calcularMensualidad(double mon, double eng) {
        // TODO: Implementar el cálculo de la mensualidad
        return 0.0;
    }

    /**
     * Método principal - YA IMPLEMENTADO
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del monto del vehículo
        System.out.print("Ingrese el precio del vehículo: $");
        double mon = scanner.nextDouble();

        // Calcular enganche
        double eng = calcularEnganche(mon);

        // Calcular mensualidad
        double men = calcularMensualidad(mon, eng);

        // Mostrar resultados
        System.out.println("\n========================================");
        System.out.println("PLAN DE FINANCIAMIENTO XGW");
        System.out.println("========================================");
        System.out.printf("Precio del vehículo: $%.2f%n", mon);
        System.out.printf("Enganche (35%%):     $%.2f%n", eng);
        System.out.printf("Mensualidad (18):    $%.2f%n", men);
        System.out.println("========================================");

        scanner.close();
    }
}
