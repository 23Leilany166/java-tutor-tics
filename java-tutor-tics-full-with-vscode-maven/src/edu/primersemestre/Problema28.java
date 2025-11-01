package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 2.8 — Esqueleto para práctica
 * 
 * Tienda con descuentos según el monto de COMPRA:
 * < 500                   -> 0%
 * 500 .. 1000 (incluye)   -> 5%
 * 1000 .. 7000 (incluye)  -> 11%
 * 7000 .. 15000 (incluye) -> 18%
 * > 15000                 -> 25%
 * Debe imprimirse el total a pagar (PAGAR).
 */
public class Problema28 {

    /** Retorna el porcentaje de descuento (0.0..0.25) según COMPRA (Completar) */
    public static double descuento(double compra) {
        // TODO: devuelve la tasa adecuada (por ejemplo 0.05 para 5%)
        return 0.0; // temporal
    }

    /** Calcula el total a pagar con el descuento aplicado (Completar) */
    public static double pagar(double compra) {
        // TODO: usar descuento(compra) y devolver compra - compra * tasa
        return 0.0; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 2.8 ==");
        System.out.print("Ingresa COMPRA: ");
        double compra = 0; // TODO: leer el valor real
        // compra = sc.nextDouble();

        // TODO: calcular el total a pagar y mostrarlo
        double total = 0;

        // System.out.printf("PAGAR = %.2f%n", total);
        sc.close();
    }
}
