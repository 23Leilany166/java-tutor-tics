package edu.primersemestre;

/**
 * Problema 3.2 — Suma e impresión de una serie.
 * Serie: 2, 5, 7, 10, 12, 15, 17, ..., 1800
 * Programación estructurada en Java 21.
 */
public class SerieSuma {

    public static void main(String[] args) {
        // 1. INICIO
        int I = 2;           // término actual
        long SUMSER = 0L;    // acumulador de la serie
        char BAND = 'T';     // bandera de control

        // 2. {Mientras I <= 1800}
        while (I <= 1800) {
            SUMSER += I; // sumamos el término
            System.out.print(I + ((I < 1800) ? ", " : "\n"));

            // 3. {Alternar incremento según BAND}
            if (BAND == 'T') {
                BAND = 'F';
                I += 3;
            } else {
                BAND = 'T';
                I += 2;
            }
        }

        // 4. {Impresión final}
        System.out.println("SUMSER = " + SUMSER);

        // 5. FIN
    }
}
