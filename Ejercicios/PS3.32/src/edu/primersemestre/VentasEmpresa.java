package edu.primersemestre;

import java.util.*;

/**
 * PS 3.32 — Análisis de ventas (N sucursales x 14 años)
 * Calcula:
 * a) Sucursal con mayor venta por año
 * b) Promedio anual de ventas
 * c) Año con mayor promedio
 * d) Ventas totales de la empresa
 * Programación estructurada — Java 21
 */
public class VentasEmpresa {
    public static void main(String[] args) {
        final int ANIOS = 14;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número de sucursales (1..50): ");
        int N = sc.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Error: N fuera de rango.");
            sc.close();
            return;
        }

        double[][] V = new double[ANIOS][N];

        // Lectura de ventas
        for (int i = 0; i < ANIOS; i++) {
            System.out.println("Año " + (i + 1) + ":");
            for (int j = 0; j < N; j++) {
                System.out.print("  Venta[" + (i + 1) + "][" + (j + 1) + "] = ");
                V[i][j] = sc.nextDouble();
            }
        }

        double totalEmpresa = 0.0;
        double mejorPromedio = -1.0;
        int anioMejorProm = -1;

        System.out.println("\n== Resultados ==");
        for (int i = 0; i < ANIOS; i++) {
            double sumaAnio = 0.0;
            double maxAnio = -1.0;
            int sucMax = -1;

            for (int j = 0; j < N; j++) {
                double x = V[i][j];
                sumaAnio += x;
                if (x > maxAnio) {
                    maxAnio = x;
                    sucMax = j;
                }
            }

            double promAnio = sumaAnio / N;
            totalEmpresa += sumaAnio;

            System.out.printf(Locale.US, "Año %2d -> Sucursal %d mayor venta: $%.2f | Promedio anual: $%.2f%n",
                    (i + 1), (sucMax + 1), maxAnio, promAnio);

            if (promAnio > mejorPromedio) {
                mejorPromedio = promAnio;
                anioMejorProm = i + 1;
            }
        }

        System.out.printf(Locale.US, "\nAño con mayor promedio: %d (promedio = $%.2f)%n",
                anioMejorProm, mejorPromedio);
        System.out.printf(Locale.US, "Ventas totales de la empresa (14 años): $%.2f%n", totalEmpresa);

        sc.close();
    }
}
