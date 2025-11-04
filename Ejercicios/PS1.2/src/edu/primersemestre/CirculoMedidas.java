package edu.primersemestre;

import java.util.*;

/**
 * PS 1.2 - Cálculo de área y circunferencia de un círculo
 * Dado el radio, calcula e imprime el área y la circunferencia.
 * Programación estructurada - Java 21.
 */
public class CirculoMedidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el radio (RADIO): ");
        double RADIO = sc.nextDouble();

        if (RADIO <= 0) {
            System.out.println("Error: el radio debe ser positivo.");
            sc.close();
            return;
        }

        double AREA = Math.PI * Math.pow(RADIO, 2);
        double CIRC = 2 * Math.PI * RADIO;

        System.out.printf(Locale.US, "Area = %.4f%n", AREA);
        System.out.printf(Locale.US, "Circunferencia = %.4f%n", CIRC);

        sc.close();
    }
}
