package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 2.4 — Esqueleto para práctica
 * 
 * Enunciado resumido:
 *  - Leer MAT (entero) y 5 calificaciones reales: CAL1..CAL5
 *  - Calcular PRO = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5
 *  - Imprimir MAT, PRO y la palabra "aprobado" si PRO >= 6, en otro caso "no aprobado".
 */
public class Problema24 {

    /** Calcula el promedio de 5 calificaciones. (Completar) */
    public static double promedio(double c1, double c2, double c3, double c4, double c5) {
        // TODO: retorna el promedio correcto
        return 0; // temporal
    }

    /** Retorna el texto de resultado según el promedio (Completar) */
    public static String estado(double promedio) {
        // TODO: si promedio >= 6 => "aprobado", si no => "no aprobado"
        return ""; // temporal
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 2.4 ==");
        System.out.print("Ingresa MAT (entero): ");
        int mat = 0; // TODO: lee la matrícula real
        // mat = sc.nextInt();

        // TODO: lee cinco calificaciones reales
        double c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        // TODO: calcula el promedio real
        double pro = 0;

        // TODO: calcula el estado usando la función estado(promedio)
        String texto = "";

        // TODO: muestra la salida en el formato: MAT, PRO y "aprobado"/"no aprobado"
        // Ejemplo:
        // System.out.printf("MAT=%d  PRO=%.2f  %s%n", mat, pro, texto);

        sc.close();
    }
}
