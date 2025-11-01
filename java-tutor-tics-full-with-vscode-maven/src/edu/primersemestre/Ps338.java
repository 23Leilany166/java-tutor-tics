package edu.primersemestre;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * PS 3.38 — Esqueleto para práctica
 *
 * En un restaurante hay 7 platillos identificados por clave 1..7.
 * a) Leer los precios de los 7 platillos (P1..P7).
 * b) Para cada cliente, leer K (número de conceptos) y luego K pares (CLAVE, CANT).
 *    Generar una factura enumerada con total a pagar.
 *    Repetir hasta que se capture K = -1 (fin del día).
 * c) Al final, imprimir lo vendido por el restaurante (suma de todos los totales).
 */
public class Ps338 {

    /** Devuelve el total para una factura a partir de precios[1..7], claves[] y cants[] (Completar) */
    public static double totalFactura(double[] precios, int[] claves, int[] cants) {
        // TODO: calcular sumatoria precios[clave] * cant (validar 1..7)
        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 3.38 ==");

        // a) Leer los precios P1..P7
        double[] precios = new double[8]; // usaremos índices 1..7
        // TODO: leer P1..P7 en precios[1]..precios[7]

        double totalDia = 0.0;
        int folio = 1;

        while (true) {
            // b) Leer K (cantidad de conceptos de la factura actual)
            // TODO: leer K
            int K = 0;

            // Si K == -1 -> terminar
            // TODO: condicional de salida
            // if (K == -1) break;

            // Arreglos para conceptos
            int[] claves = new int[K];
            int[] cants = new int[K];

            // TODO: leer K pares (CLAVE, CANT) para este cliente

            // Calcular total de la factura
            double total = 0.0; // TODO: totalFactura(precios, claves, cants);

            // TODO: imprimir la factura (folio, renglones y total)

            // Acumular para el día
            totalDia += total;
            folio++;
        }

        // c) Imprimir total del día
        // System.out.printf("VENTA TOTAL DEL DÍA = %.2f%n", totalDia);
        sc.close();
    }
}
