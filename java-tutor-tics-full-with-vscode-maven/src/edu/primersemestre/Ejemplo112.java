package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 1.12 — Esqueleto para práctica
 * 
 * Instrucciones:
 * - Completa el método calcular() para que devuelva el resultado correcto.
 * - Usa el mismo formato del ejemplo en el libro:
 *      RES = (A + B)^2 / 3
 * - No olvides leer A y B desde teclado y mostrar RES.
 */
public class Ejemplo112 {

    /**
     * Calcula el valor de RES = (A + B)^2 / 3
     * (Completa aquí el código)
     */
    public static double calcular(double a, double b) {
        // TODO: Calcula el resultado correcto y retorna su valor
        return 0; // valor temporal para compilar sin errores
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 1.12 ==");
        System.out.println("Calcula RES = (A + B)^2 / 3");

        // TODO: Solicita al usuario A y B
        // Ejemplo:
        // System.out.print("Ingresa A: ");
        // a = sc.nextDouble();

        double a = 0;
        double b = 0;

        // TODO: Llama al método calcular(a, b) y guarda el resultado
        double res = 0;

        // TODO: Muestra el resultado en pantalla
        // Ejemplo:
        // System.out.printf("RES = %.6f%n", res);

        sc.close();
    }
}
