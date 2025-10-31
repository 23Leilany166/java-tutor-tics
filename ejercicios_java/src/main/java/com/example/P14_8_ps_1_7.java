package com.example;

import java.util.Scanner;

public class P14_8_ps_1_7 {

    /**
     * Calcula el enganche y la mensualidad para la compra de un vehículo.
     * El enganche es del 35%, a un plazo de 36 meses con una tasa de interés anual del 12%.
     *
     * @param precioVehiculo El costo total del vehículo.
     * @return Un arreglo de double con dos elementos: [0] = importe del enganche, [1] = monto de la mensualidad.
     */
    public double[] calcularPagos(double precioVehiculo) {
        if (precioVehiculo < 0) {
            precioVehiculo = 0; // No permitir precios negativos en el cálculo.
        }

        double enganche = precioVehiculo * 0.35;
        double saldoRestante = precioVehiculo - enganche;

        if (saldoRestante == 0) {
            return new double[]{enganche, 0.0};
        }

        double tasaInteresAnual = 0.12;
        int plazoMeses = 36;
        double tasaInteresMensual = tasaInteresAnual / 12;

        double mensualidad = saldoRestante * tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -plazoMeses));
        
        return new double[]{enganche, mensualidad};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_8_ps_1_7 calculadora = new P14_8_ps_1_7();

        System.out.print("Ingrese el precio del vehículo: ");
        double mon = scanner.nextDouble();
        
        double[] resultados = calculadora.calcularPagos(mon);

        System.out.println("Importe del enganche: " + resultados[0]);
        System.out.println("Monto de las mensualidades: " + resultados[1]);
        
        scanner.close();
    }
}