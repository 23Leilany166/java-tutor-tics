package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 4.2 — Esqueleto para práctica
 *
 * Se leen 70 sueldos (reales) S1..S70.
 * 1) Calcular AC = suma de los 70 sueldos.
 * 2) Calcular PROM = AC / 70.
 * 3) Contar cuántos sueldos son > PROM (CONT).
 */
public class Ejemplo42 {

    /** Calcula el promedio dada una suma y un conteo (Completar) */
    public static double promedio(double suma, int n) {
        // TODO: retorna suma/n (n>0), de lo contrario 0
        return 0.0; // temporal
    }

    /** Devuelve cuántos elementos del arreglo son mayores que prom (Completar) */
    public static int contarMayoresQue(double[] sueldos, double prom) {
        // TODO: recorre el arreglo y cuenta > prom
        return 0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 4.2 ==");
        System.out.println("Ingrese los 70 sueldos:");

        final int N = 70;
        double[] sueldos = new double[N];
        double ac = 0.0;

        // TODO: leer los 70 sueldos (S1..S70) y acumular AC
        // for (int i = 0; i < N; i++) {
        //     System.out.printf("Sueldo %d: ", i + 1);
        //     sueldos[i] = sc.nextDouble();
        //     ac += sueldos[i];
        // }

        // TODO: calcular prom = promedio(ac, N)
        double prom = 0.0;

        // TODO: cont = contarMayoresQue(sueldos, prom)
        int cont = 0;

        // TODO: imprimir PROM y CONT
        // System.out.printf("PROM = %.2f  CONT = %d%n", prom, cont);

        sc.close();
    }
}
