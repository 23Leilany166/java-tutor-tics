package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 1.5 — Esqueleto para práctica
 * 
 * Una persona invierte un monto de dinero (MD) a una tasa de interés mensual (TASA).
 * Calcular el monto final que se obtiene al finalizar el mes.
 * Fórmula esperada: MF = MD + (MD * TASA / 100)
 */
public class Ps15 {

    /** Calcula el monto final del mes (Completar) */
    public static double montoFinal(double md, double tasa) {
        // TODO: aplica la fórmula con tasa en porcentaje
        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 1.5 ==");
        // TODO: leer MD y TASA
        double md = 0.0;
        double tasa = 0.0;

        // TODO: calcular y mostrar MF
        double mf = 0.0;
        // System.out.printf("MF = %.2f%n", mf);
        sc.close();
    }
}
