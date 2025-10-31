package com.example;

import java.util.Scanner;

public class P14_10_ps_3_7 {

    /**
     * Calcula el nuevo sueldo de un empleado aplicando un aumento condicional.
     * - 10% si el sueldo es < 10,000
     * - 7% si el sueldo está entre 10,000 y 25,000 inclusive
     * - 8% si el sueldo es > 25,000
     *
     * @param sueldoActual El sueldo original.
     * @return El nuevo sueldo con el aumento aplicado.
     */
    public double calcularNuevoSueldo(double sueldoActual) {
        double aumento;
        if (sueldoActual < 10000) {
            aumento = sueldoActual * 0.10;
        } else if (sueldoActual <= 25000) { // El original `sueldo >= 10000` es redundante
            aumento = sueldoActual * 0.07;
        } else {
            aumento = sueldoActual * 0.08;
        }
        return sueldoActual + aumento;
    }

    /**
     * Calcula el monto total de la nómina a partir de una lista de sueldos originales.
     *
     * @param sueldosActuales Un arreglo de doubles con los sueldos de los empleados.
     * @return El monto total de la nómina con los aumentos ya aplicados.
     */
    public double calcularNominaTotal(double[] sueldosActuales) {
        double totalNomina = 0;
        for (double sueldo : sueldosActuales) {
            totalNomina += calcularNuevoSueldo(sueldo);
        }
        return totalNomina;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_10_ps_3_7 programa = new P14_10_ps_3_7();

        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();
        double[] sueldos = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": $");
            sueldos[i] = scanner.nextDouble();
        }
        
        double totalNomina = programa.calcularNominaTotal(sueldos);

        System.out.println("\n--- Resumen de Nómina ---");
        for (int i = 0; i < n; i++) {
            double nuevoSueldo = programa.calcularNuevoSueldo(sueldos[i]);
            System.out.println("El nuevo sueldo del empleado " + (i + 1) + " es: $" + nuevoSueldo);
        }
        
        System.out.println("\nEl monto total de la nomina considerando el aumento es: $" + totalNomina);
        scanner.close();
    }
}