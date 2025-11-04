package edu.primersemestre;

import java.util.Scanner;

/**
 * Problema 2.5 — Determina si un número es positivo, negativo o nulo.
 * Programación estructurada en Java 21.
 */
public class NumeroSigno {
    public static void main(String[] args) {
        // 1. INICIO
        Scanner teclado = new Scanner(System.in);

        // 2. Lectura del dato NUM
        System.out.print("Introduce un número entero (NUM): ");
        int NUM = teclado.nextInt();

        // 3. Estructura selectiva doble: Si / Sino
        if (NUM > 0) {
            System.out.println("POSITIVO");
        } else if (NUM == 0) {
            System.out.println("NULO");
        } else {
            System.out.println("NEGATIVO");
        }

        // 4. FIN
        teclado.close();
    }
}
