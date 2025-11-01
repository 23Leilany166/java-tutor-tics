package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 3.5 — Esqueleto para práctica
 * 
 * Dado N números enteros:
 * a) Cuántos fueron mayores que 0 (CUEPOS).
 * b) Promedio de los positivos (PROPOS).
 * c) Promedio de todos los números (PROMGEN).
 */
public class Problema35 {

    /** Devuelve true si num es positivo (> 0). Completar si se requiere. */
    public static boolean esPositivo(int num) {
        // TODO: retorna si es positivo
        return false; // temporal
    }

    /** Calcula el promedio de un acumulado y un conteo (>0). */
    public static double promedio(double suma, int conteo) {
        // TODO: si conteo > 0 regresar suma / conteo; si no, 0 (o lo que indique tu profe)
        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 3.5 ==");
        System.out.print("Ingresa N: ");
        int N = 0; // TODO: leer N real
        // N = sc.nextInt();

        // TODO: variables de acumulación/contadores
        int cuepos = 0;      // cantidad de positivos
        long sumtot = 0;     // suma de todos los números
        long sumpos = 0;     // suma de positivos

        // TODO: ciclo para leer N valores y actualizar sumas/contadores

        // TODO: calcula promedios
        double propos = 0.0;
        double promgen = 0.0;

        // TODO: imprime CUEPOS, PROPOS, PROMGEN
        // System.out.printf("CUEPOS=%d  PROPOS=%.2f  PROMGEN=%.2f%n", cuepos, propos, promgen);
        sc.close();
    }
}
