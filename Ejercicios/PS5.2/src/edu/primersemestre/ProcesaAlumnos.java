package edu.primersemestre;

import java.util.*;

/**
 * PS 5.2 — Procesar registros de alumnos (ESC[1..N])
 * Programación estructurada en Java 21.
 */
public class ProcesaAlumnos {

    static class Alumno {
        String NOM, CAR;
        int MAT, NSE;
        double[] SEM;

        Alumno(String nom, int mat, int nse, double[] sem, String car) {
            NOM = nom; MAT = mat; NSE = nse; SEM = sem; CAR = car;
        }
    }

    static double promedio(Alumno a) {
        double s = 0;
        for (int i = 0; i < a.NSE; i++) s += a.SEM[i];
        return (a.NSE > 0) ? s / a.NSE : 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("N (1..2000): ");
        int N = sc.nextInt();
        if (N < 1 || N > 2000) { System.out.println("N fuera de rango"); return; }

        Alumno[] ESC = new Alumno[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.print("  Nombre: "); sc.nextLine(); String nom = sc.nextLine();
            System.out.print("  Matrícula: "); int mat = sc.nextInt();
            System.out.print("  Semestres cursados (1..9): "); int nse = sc.nextInt();
            double[] sem = new double[Math.min(nse, 9)];
            for (int k = 0; k < sem.length; k++) {
                System.out.print("    Promedio semestre " + (k + 1) + ": ");
                sem[k] = sc.nextDouble();
            }
            System.out.print("  Carrera: "); sc.nextLine(); String car = sc.nextLine();
            ESC[i] = new Alumno(nom, mat, nse, sem, car);
        }

        System.out.println("\n(a) Promedio general > 9:");
        for (Alumno a : ESC)
            if (promedio(a) > 9.0)
                System.out.printf("%s (MAT: %d)%n", a.NOM, a.MAT);

        System.out.println("\n(b) Economía con todos los semestres > 9:");
        for (Alumno a : ESC) {
            if (!a.CAR.equalsIgnoreCase("Economía")) continue;
            boolean todosMayor9 = true;
            for (int i = 0; i < a.NSE; i++) if (a.SEM[i] <= 9.0) { todosMayor9 = false; break; }
            if (todosMayor9) System.out.printf("%s (MAT: %d)%n", a.NOM, a.MAT);
        }

        System.out.println("\n(c) Mejor promedio en Ingeniería en Computación:");
        double maxProm = -1; Alumno mejor = null;
        for (Alumno a : ESC) {
            if (!a.CAR.equalsIgnoreCase("Ingeniería en Computación")) continue;
            double p = promedio(a);
            if (p > maxProm) { maxProm = p; mejor = a; }
        }
        if (mejor != null)
            System.out.printf("%s (MAT: %d) Promedio: %.2f%n", mejor.NOM, mejor.MAT, maxProm);
        else
            System.out.println("No hay alumnos de esa carrera.");

        sc.close();
    }
}
