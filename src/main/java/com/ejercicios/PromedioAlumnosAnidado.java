package com.ejercicios;

import java.util.Scanner;

public class PromedioAlumnosAnidado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_ALUMNOS = 2; //
        final int NUM_CALIFICACIONES = 3; //

        System.out.println("Ingrese los datos de los " + NUM_ALUMNOS + " alumnos:");

        for (int i = 1; i <= NUM_ALUMNOS; i++) { // Ciclo externo para alumnos
            System.out.print("Matrícula del alumno " + i + ": ");
            int matricula = scanner.nextInt(); // Leer MATi
            double sumaCalificaciones = 0.0;

            System.out.println("Ingrese las " + NUM_CALIFICACIONES + " calificaciones para " + matricula + ":");
            for (int j = 1; j <= NUM_CALIFICACIONES; j++) { // Ciclo interno para calificaciones
                System.out.print("Calificación " + j + ": ");
                double calificacion = scanner.nextDouble(); // Leer CALi,j
                sumaCalificaciones += calificacion;
            }

            double promedio = sumaCalificaciones / NUM_CALIFICACIONES; // Calcular promedio

            System.out.printf("Alumno %d - Matrícula: %d, Promedio: %.2f%n%n", i, matricula, promedio); // Imprimir
                                                                                                        // resultado
        }

        scanner.close();
    }
}