package edu.primersemestre;

import java.util.Scanner;
import java.util.Locale;

/**
 * Ejemplo 1.9 — Calcula el cuadrado y el cubo de un número entero positivo.
 * Programación estructurada — Java 21 (sin POO avanzada).
 */
public class CalculadoraPrincipiante {
    public static void main(String[] args) {
        // Inicio
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        // Lectura del dato (NUM)
        System.out.print("Introduce un número entero positivo (NUM): ");
        int NUM = teclado.nextInt();

        // Proceso: Cálculo del cuadrado (CUA) y del cubo (CUB)
        int CUA = NUM * NUM;
        int CUB = NUM * NUM * NUM;

        // Salida: Impresión de resultados
        System.out.println("El cuadrado (CUA) es: " + CUA);
        System.out.println("El cubo (CUB) es: " + CUB);

        // Fin
        teclado.close();
    }
}
