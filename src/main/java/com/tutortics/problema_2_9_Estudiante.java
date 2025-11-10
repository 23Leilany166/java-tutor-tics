package com.tutortics;
// src/problema_2_9_Estudiante.java
// ESQUELETO DEL EJERCICIO - Para que el estudiante complete

import java.util.Scanner;

public class problema_2_9_Estudiante {

    /**
     * Calcula el impuesto según las reglas del Problema 2.9.
     *
     * Reglas:
     * - Los primeros $20 no causan impuesto
     * - Los siguientes $20 (de $20 a $40) tienen 30% de impuesto
     * - El resto (más de $40) tiene 40% de impuesto
     * - PERO si el costo es mayor a $500, el impuesto del resto es 50% en lugar de 40%
     *
     * TODO: Implementa la lógica para calcular el impuesto
     *
     * @param precioBase El precio básico del artículo (PREBAS).
     * @return El impuesto calculado (IMP).
     */
    public double calcularImpuesto(double precioBase) {
        double impuesto = 0.0;

        // TODO: Implementa las condiciones para calcular el impuesto
        // Pista 1: Usa if-else para verificar los rangos de precio
        // Pista 2: Primero verifica si es > 500, luego > 40, luego > 20

        return impuesto;
    }

    /**
     * Calcula el precio total sumando el precio base y el impuesto.
     *
     * TODO: Implementa la lógica para calcular el precio total
     *
     * @param precioBase El precio básico del artículo (PREBAS).
     * @return El precio total (PRETOT).
     */
    public double calcularPrecioTotal(double precioBase) {
        // TODO: Llama a calcularImpuesto() y suma el resultado al precio base
        return 0.0;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_2_9_Estudiante calculadora = new problema_2_9_Estudiante();

        System.out.println("Introduce el precio básico del producto:");
        double precioBase = scanner.nextDouble();

        // TODO: Calcula el precio total usando el método calcularPrecioTotal
        double precioTotal = 0.0;
        double impuesto = precioTotal - precioBase;

        System.out.println("===================================");
        System.out.printf("Precio Básico (PREBAS): $%.2f%n", precioBase);
        System.out.printf("Impuesto (IMP):         $%.2f%n", impuesto);
        System.out.printf("Precio Total (PRETOT):  $%.2f%n", precioTotal);
        System.out.println("===================================");

        scanner.close();
    }
}
