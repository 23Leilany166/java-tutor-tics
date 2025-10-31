package com.example;

import java.util.Scanner;

public class P14_6_pro_4_8 {

    /**
     * Calcula varias estadísticas basadas en un arreglo de calificaciones de alumnos.
     *
     * @param calificaciones Un arreglo de enteros con las calificaciones.
     * @return Un arreglo de doubles con los resultados en el siguiente orden:
     * [0] Promedio general
     * [1] Total de alumnos aprobados
     * [2] Total de alumnos reprobados
     * [3] Porcentaje de aprobados
     * [4] Porcentaje de reprobados
     * [5] Total de alumnos con calificación > 8
     */
    public double[] calcularEstadisticas(int[] calificaciones) {
        int n = calificaciones.length;
        if (n == 0) {
            // Si no hay calificaciones, devuelve ceros para evitar división por cero.
            return new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        }

        int totalAprobados = 0;
        int totalReprobados = 0;
        int calificacionMayorA8 = 0;
        double sumaCalificaciones = 0;

        for (int calificacion : calificaciones) {
            if (calificacion > 6) {
                totalAprobados++;
                if (calificacion > 8) {
                    calificacionMayorA8++;
                }
            } else {
                totalReprobados++;
            }
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / n;
        double porcAprobados = (double) totalAprobados / n * 100.0;
        double porcReprobados = (double) totalReprobados / n * 100.0;

        return new double[]{
            promedio,
            totalAprobados,
            totalReprobados,
            porcAprobados,
            porcReprobados,
            calificacionMayorA8
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_6_pro_4_8 programa = new P14_6_pro_4_8();

        System.out.print("Ingrese número de alumnos: ");
        int n = scanner.nextInt();

        if (n > 0 && n < 100) { // Simplificado para aceptar 1 alumno
            int[] calificaciones = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese calificación del alumno " + (i + 1) + ": ");
                calificaciones[i] = scanner.nextInt();
            }

            double[] resultados = programa.calcularEstadisticas(calificaciones);

            System.out.println("Promedio del grupo: " + resultados[0]);
            System.out.println("Total alumnos aprobados: " + (int)resultados[1]);
            System.out.println("Total alumnos reprobados: " + (int)resultados[2]);
            System.out.println("Porcentaje alumnos aprobados: " + resultados[3] + "%");
            System.out.println("Porcentaje alumnos reprobados: " + resultados[4] + "%");
            System.out.println("Número de alumnos con calificación mayor a 8: " + (int)resultados[5]);
        } else {
            System.out.println("El número de alumnos ingresado es incorrecto.");
        }
        scanner.close();
    }
}