package com.ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class AnalisisCalificaciones2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usaremos tamaños más pequeños para el ejemplo
        final int NUM_ALUMNOS = 5; // En el problema original es 30
        final int NUM_EXAMENES = 3; // En el problema original es 6

        double[][] calificaciones = new double[NUM_ALUMNOS][NUM_EXAMENES]; // Matriz de calificaciones

        // Leer calificaciones
        System.out.println("Ingrese las calificaciones (" + NUM_ALUMNOS + " alumnos, " + NUM_EXAMENES + " exámenes):");
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < NUM_EXAMENES; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // a) Promedio por examen
        System.out.println("\n--- Promedio por Examen ---");
        double[] promedioExamen = new double[NUM_EXAMENES];
        double maxPromedioExamen = -1.0;
        int indiceMaxExamen = -1;
        for (int j = 0; j < NUM_EXAMENES; j++) { // Iterar por columnas (examen)
            double sumaExamen = 0;
            for (int i = 0; i < NUM_ALUMNOS; i++) { // Iterar por filas (alumno)
                sumaExamen += calificaciones[i][j];
            }
            promedioExamen[j] = sumaExamen / NUM_ALUMNOS;
            System.out.printf("Promedio Examen %d: %.2f%n", (j + 1), promedioExamen[j]);

            // Para inciso c
            if (promedioExamen[j] > maxPromedioExamen) {
                maxPromedioExamen = promedioExamen[j];
                indiceMaxExamen = j;
            }
        }

        // b) Promedio por alumno
        System.out.println("\n--- Promedio por Alumno ---");
        double[] promedioAlumno = new double[NUM_ALUMNOS];
        for (int i = 0; i < NUM_ALUMNOS; i++) { // Iterar por filas (alumno)
            double sumaAlumno = 0;
            for (int j = 0; j < NUM_EXAMENES; j++) { // Iterar por columnas (examen)
                sumaAlumno += calificaciones[i][j];
            }
            promedioAlumno[i] = sumaAlumno / NUM_EXAMENES;
            System.out.printf("Promedio Alumno %d: %.2f%n", (i + 1), promedioAlumno[i]);
        }

        // c) Examen con mayor promedio
        System.out.println("\n--- Examen con Mayor Promedio ---");
        if (indiceMaxExamen != -1) {
            System.out.printf("Examen número %d tuvo el mayor promedio: %.2f%n", (indiceMaxExamen + 1),
                    maxPromedioExamen);
        }

        scanner.close();
    }
}
