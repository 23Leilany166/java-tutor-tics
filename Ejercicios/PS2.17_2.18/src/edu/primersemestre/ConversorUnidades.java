package edu.primersemestre;

import java.util.*;

/**
 * PS 2.17 / 2.18 — Conversor de Unidades
 * Convierte medidas según la opción seleccionada:
 * 1) pulgadas -> milímetros
 * 2) yardas -> metros
 * 3) millas -> kilómetros
 */
public class ConversorUnidades {

    public static void main(String[] args) {
        final double PULGADA_A_MM = 25.40;
        final double YARDA_A_M = 0.9144;
        final double MILLA_A_KM = 1.6093;

        Scanner sc = new Scanner(System.in);

        // 1. Entrada
        System.out.println("OPCION: 1) in->mm, 2) yd->m, 3) mi->km");
        System.out.print("Elige opcion (1..3): ");
        int OPCION = sc.nextInt();

        System.out.print("Ingresa MED (medida a convertir): ");
        double MED = sc.nextDouble();

        if (MED < 0) {
            System.out.println("Error: MED debe ser >= 0");
            sc.close();
            return;
        }

        double resultado = 0.0;
        String etiqueta = "";

        // 2. Proceso
        switch (OPCION) {
            case 1 -> { resultado = MED * PULGADA_A_MM; etiqueta = "mm"; }
            case 2 -> { resultado = MED * YARDA_A_M; etiqueta = "m"; }
            case 3 -> { resultado = MED * MILLA_A_KM; etiqueta = "km"; }
            default -> {
                System.out.println("Error: opcion invalida (usa 1, 2 o 3)");
                sc.close();
                return;
            }
        }

        // 3. Salida
        System.out.printf(Locale.US, "Resultado: %.4f %s%n", resultado, etiqueta);
        sc.close();
    }
}
