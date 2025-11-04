package edu.primersemestre;

import java.util.*;

/**
 * PS 4.23 — Análisis de ingresos de alumnos en 7 carreras durante 12 años.
 * Programa estructurado en Java 21.
 */
public class IngresosUniversidad {

    public static void main(String[] args) {
        final int ANIOS = 12, CARRERAS = 7;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[][] ALUM = new int[ANIOS][CARRERAS];

        // Lectura de la matriz
        for (int i = 0; i < ANIOS; i++) {
            System.out.println("Año " + (i + 1) + ":");
            for (int j = 0; j < CARRERAS; j++) {
                System.out.print("  ALUM[" + (i + 1) + "][" + (j + 1) + "] = ");
                ALUM[i][j] = sc.nextInt();
            }
        }

        System.out.print("X (año 1..12): ");
        int X = sc.nextInt();
        System.out.print("Y (carrera 1..7): ");
        int Y = sc.nextInt();
        System.out.print("T (carrera 1..7): ");
        int T = sc.nextInt();

        if (X < 1 || X > 12 || Y < 1 || Y > 7 || T < 1 || T > 7) {
            System.out.println("Error: X, Y o T fuera de rango.");
            sc.close();
            return;
        }

        // (a) Total por año
        int[] sumaAnio = new int[ANIOS];
        for (int i = 0; i < ANIOS; i++) {
            int suma = 0;
            for (int j = 0; j < CARRERAS; j++) suma += ALUM[i][j];
            sumaAnio[i] = suma;
        }

        System.out.println("\n(a) Total de alumnos por año:");
        for (int i = 0; i < ANIOS; i++)
            System.out.printf(Locale.US, "Año %2d: %d alumnos%n", (i + 1), sumaAnio[i]);

        // (b) Porcentaje de alumnos en año X y carrera Y
        double porcentaje = (sumaAnio[X - 1] == 0) ? 0.0
            : (ALUM[X - 1][Y - 1] * 100.0) / sumaAnio[X - 1];
        System.out.printf(Locale.US, "\n(b) Porcentaje: carrera %d en año %d = %.2f%%%n", Y, X, porcentaje);

        // (c) Menor ingreso global
        int minVal = Integer.MAX_VALUE, minAnio = -1, minCar = -1;
        for (int i = 0; i < ANIOS; i++) {
            for (int j = 0; j < CARRERAS; j++) {
                if (ALUM[i][j] < minVal) {
                    minVal = ALUM[i][j];
                    minAnio = i + 1;
                    minCar = j + 1;
                }
            }
        }
        System.out.printf("(c) Menor ingreso: %d alumnos (año %d, carrera %d)%n", minVal, minAnio, minCar);

        // (d) Año con mayor ingreso en la carrera T
        int maxVal = -1, anioMax = -1;
        for (int i = 0; i < ANIOS; i++) {
            if (ALUM[i][T - 1] > maxVal) {
                maxVal = ALUM[i][T - 1];
                anioMax = i + 1;
            }
        }
        System.out.printf("(d) Mayor ingreso carrera %d: año %d (%d alumnos)%n", T, anioMax, maxVal);

        sc.close();
    }
}
