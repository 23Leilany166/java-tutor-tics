package com.tutortics;
// src/ejemplo_1_13_Estudiante.java
// ESQUELETO DEL EJERCICIO - Para que el estudiante complete

import java.util.Scanner;

public class ejemplo_1_13_Estudiante {

    /**
     * Calcula el promedio de cinco calificaciones.
     *
     * TODO: Implementa la lógica para calcular el promedio de las 5 calificaciones.
     *
     * @param cal1 Calificación 1
     * @param cal2 Calificación 2
     * @param cal3 Calificación 3
     * @param cal4 Calificación 4
     * @param cal5 Calificación 5
     * @return El promedio de las cinco calificaciones.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        // TODO: Completa la implementación aquí
        // Pista: Suma todas las calificaciones y divide entre 5
        return 0.0;
    }

    /**
     * Método principal para leer los datos y mostrar el resultado.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_1_13_Estudiante calculator = new ejemplo_1_13_Estudiante();

        // 1. Leer MAT, CAL1, CAL2, CAL3, CAL4, CAL5
        System.out.println("Introduce la matrícula del alumno:");
        int matricula = scanner.nextInt();

        System.out.println("Introduce las 5 calificaciones:");
        // TODO: Lee las 5 calificaciones del usuario
        double cal1 = 0.0;
        double cal2 = 0.0;
        double cal3 = 0.0;
        double cal4 = 0.0;
        double cal5 = 0.0;

        // 2. Hacer PRO ← (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5
        // TODO: Llama al método calcularPromedio con las 5 calificaciones
        double promedio = 0.0;

        // 3. Escribir MAT, PRO
        System.out.println("======================================");
        System.out.println("Matrícula del Alumno: " + matricula);
        System.out.println("Promedio de Calificaciones: " + promedio);
        System.out.println("======================================");

        scanner.close();
    }
}
