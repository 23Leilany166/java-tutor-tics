package com.ejercicios;

import java.util.Scanner;

public class MejorPeorAlumno {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_ALUMNOS = 3; // O leer N si se generaliza
        final int NUM_CALIFICACIONES = 2;

        int matriculaMejor = -1, matriculaPeor = -1;
        double mejorPromedio = -1.0; // Inicializar con valor bajo
        double peorPromedio = 11.0; // Inicializar con valor alto (asumiendo calif 0-10)

        System.out.println("Ingrese los datos de los " + NUM_ALUMNOS + " alumnos:");

        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            System.out.print("Matrícula del alumno " + i + ": ");
            int matricula = scanner.nextInt();
            double sumaCalificaciones = 0.0;

            // System.out.println("Ingrese las " + NUM_CALIFICACIONES + " calificaciones
            // para " + matricula + ":"); // Opcional
            for (int j = 1; j <= NUM_CALIFICACIONES; j++) {
                // System.out.print("Calificación " + j + ": "); // Opcional
                double calificacion = scanner.nextDouble();
                sumaCalificaciones += calificacion;
            }

            double promedio = sumaCalificaciones / NUM_CALIFICACIONES;

            // Actualizar mejor alumno
            if (promedio > mejorPromedio) { // [cite: 3589]
                mejorPromedio = promedio;
                matriculaMejor = matricula;
            }

            // Actualizar peor alumno
            if (promedio < peorPromedio) { // [cite: 3589]
                peorPromedio = promedio;
                matriculaPeor = matricula;
            }
            // System.out.printf("Temp: Alumno %d - Mat: %d, Prom: %.2f%n", i, matricula,
            // promedio); // Opcional para debug
        }

        System.out.println("\n--- Resultados ---");
        if (matriculaMejor != -1) {
            System.out.printf("Mejor Alumno - Matrícula: %d, Promedio: %.2f%n", matriculaMejor, mejorPromedio);
        }
        if (matriculaPeor != -1) {
            System.out.printf("Peor Alumno  - Matrícula: %d, Promedio: %.2f%n", matriculaPeor, peorPromedio);
        }

        scanner.close();
    }
}