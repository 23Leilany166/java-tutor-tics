package com.javatutor.problema_4_15;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int M, N;

        System.out.print("Ingresa número de años (1-10): ");
        M = sc.nextInt();

        System.out.print("Ingresa número de sucursales (1-35): ");
        N = sc.nextInt();

        double[][] MONTO = new double[M][N];

        // Lectura de datos
        for (int i = 0; i < M; i++) {
            System.out.println("\nAño " + (i + 1));
            for (int j = 0; j < N; j++) {
                System.out.print("Monto vendido por la sucursal " + (j + 1) + ": ");
                MONTO[i][j] = sc.nextDouble();
            }
        }

        // -------------------------------
        // a) Sucursal que más vendió
        // -------------------------------
        double MAX = -1;
        int SUC = -1;

        for (int j = 0; j < N; j++) {
            double SUM = 0;
            for (int i = 0; i < M; i++) {
                SUM += MONTO[i][j];
            }

            if (SUM > MAX) {
                MAX = SUM;
                SUC = j + 1; // número de sucursal
            }
        }

        // -------------------------------
        // b) Promedio de ventas por año
        // c) Año con mayor promedio
        // -------------------------------
        double mayorProm = -1;
        int ANO = -1;

        for (int i = 0; i < M; i++) {
            double SUM = 0;

            for (int j = 0; j < N; j++) {
                SUM += MONTO[i][j];
            }

            double PROM = SUM / N;

            System.out.println("\nPromedio del año " + (i + 1) + ": " + PROM);

            if (PROM > mayorProm) {
                mayorProm = PROM;
                ANO = i + 1;
            }
        }

        // -------------------------------
        // Resultados finales
        // -------------------------------
        System.out.println("\nSucursal que más vendió en todos los años: " + SUC);
        System.out.println("Año con mayor promedio de ventas: " + ANO);
    }
}
