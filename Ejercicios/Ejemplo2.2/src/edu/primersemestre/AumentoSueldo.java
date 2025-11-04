package edu.primersemestre;

import java.util.Scanner;

/**
 * Ejemplo 2.2 — Aumento de sueldo.
 * Programación estructurada en Java 21.
 * Si el sueldo es menor a 1000, se aplica un aumento del 15%.
 */
public class AumentoSueldo {
    public static void main(String[] args) {
        // 1. INICIO
        Scanner teclado = new Scanner(System.in);

        // 2. Lectura del dato SUE
        System.out.print("Introduce el sueldo (SUE): ");
        double SUE = teclado.nextDouble();

        // 3. Inicialización de variables
        double AUM = 0;
        double NSUE = SUE;

        // 4. Estructura selectiva simple: si SUE < 1000
        if (SUE < 1000) {
            // Cálculo del aumento
            AUM = SUE * 0.15;
            NSUE = SUE + AUM;
        }

        // 5. Impresión del resultado
        System.out.println("El nuevo sueldo (NSUE) es: " + NSUE);

        // 6. FIN
        teclado.close();
    }
}
