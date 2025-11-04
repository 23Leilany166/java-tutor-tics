package edu.primersemestre;

import java.util.*;

/**
 * Problema 3.18 — Producción anual de fábricas
 * Calcula totales anuales, la fábrica con mayor producción y las que superaron 3 millones en julio.
 * Programación estructurada — Java 21.
 */
public class ProduccionIndustrias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N (1..100): ");
        int N = sc.nextInt();

        if (N < 1 || N > 100) {
            System.out.println("Error en número de fábricas");
            sc.close();
            return;
        }

        double MAYPRO = 0.0;
        int CLAVE = -1;
        List<Integer> julioAltas = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.print("Clave de la fábrica: ");
            int FABRICA = sc.nextInt();

            double TOTANU = 0.0;
            for (int j = 1; j <= 12; j++) {
                System.out.print("Producción del mes " + j + ": ");
                double MES = sc.nextDouble();
                TOTANU += MES;

                if (j == 7 && MES > 3_000_000) {
                    julioAltas.add(FABRICA);
                }
            }

            System.out.printf(Locale.US, "Producción anual fábrica %d: $%.2f%n", FABRICA, TOTANU);

            if (TOTANU > MAYPRO) {
                MAYPRO = TOTANU;
                CLAVE = FABRICA;
            }
        }

        if (CLAVE != -1) {
            System.out.printf(Locale.US,
                    "Fábrica que más produjo en el año: clave %d, producción: $%.2f%n", CLAVE, MAYPRO);
        }

        if (julioAltas.isEmpty()) {
            System.out.println("Ninguna fábrica superó $3,000,000 en julio.");
        } else {
            System.out.print("Claves con julio > $3,000,000: ");
            for (int i = 0; i < julioAltas.size(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(julioAltas.get(i));
            }
            System.out.println();
        }

        sc.close();
    }
}
