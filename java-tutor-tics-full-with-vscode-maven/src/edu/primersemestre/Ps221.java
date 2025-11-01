package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 2.21 — Esqueleto para práctica
 *
 * Dado CATE y MONTO, calcular el monto a pagar aplicando el descuento según la categoría.
 * Categorías:
 * 1 = 35%, 2 = 22%, 3 = 15%, 4 = 5%, >4 = 0%
 */
public class Ps221 {

    /** Calcula el pago con descuento según la categoría */
    public static double calcularPago(double monto, int cate) {
        // TODO: aplicar el descuento según la tabla
        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 2.21 ==");
        // TODO: leer CATE y MONTO
        int cate = 0;
        double monto = 0.0;

        // TODO: llamar a calcularPago() y mostrar resultado
        double pago = 0.0;

        // System.out.printf("PAGO = %.2f%n", pago);
        sc.close();
    }
}
