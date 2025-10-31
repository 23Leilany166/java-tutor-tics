package com.example;

import java.util.Scanner;

public class P14_9_ps_3_6 {

    /**
     * Aplica un aumento del 15% a los sueldos que son menores a 800.
     * La modificación se realiza directamente sobre el arreglo de entrada.
     *
     * @param sueldos El arreglo de doubles con los sueldos a procesar.
     */
    public void aplicarAumento(double[] sueldos) {
        if (sueldos == null) {
            return; // Evita errores si el arreglo es nulo
        }
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] < 800) {
                sueldos[i] *= 1.15;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_9_ps_3_6 programa = new P14_9_ps_3_6();

        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();
        double[] sueldos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        // Se llama al método refactorizado para aplicar la lógica
        programa.aplicarAumento(sueldos);

        System.out.println("Sueldos con el aumento:");
        for (int i = 0; i < n; i++) {
            System.out.println("Trabajador " + (i + 1) + ": " + sueldos[i]);
        }
        
        scanner.close();
    }
}