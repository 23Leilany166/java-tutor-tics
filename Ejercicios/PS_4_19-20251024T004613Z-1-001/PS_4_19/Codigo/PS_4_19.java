/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Libros;

import java.util.Scanner;

/**
 *
 * @author zenri
 */
public class PS_4_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] calificaciones = new double[30][6];

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingrese la calificación del alumno " + (i + 1) + " en el examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        double[] promediosExamenes = new double[6];
        for (int j = 0; j < 6; j++) {
            double sumaExamenes = 0.0;
            for (int i = 0; i < 30; i++) {
                sumaExamenes += calificaciones[i][j];
            }
            promediosExamenes[j] = sumaExamenes / 30;
        }

        double[] promediosAlumnos = new double[30];
        for (int i = 0; i < 30; i++) {
            double sumaAlumno = 0.0;
            for (int j = 0; j < 6; j++) {
                sumaAlumno += calificaciones[i][j];
            }
            promediosAlumnos[i] = sumaAlumno / 6;
        }

        double mayorPromedio = promediosExamenes[0];
        int tipoExamenMayorPromedio = 1;
        for (int j = 1; j < 6; j++) {
            if (promediosExamenes[j] > mayorPromedio) {
                mayorPromedio = promediosExamenes[j];
                tipoExamenMayorPromedio = j + 1;
            }
        }

        System.out.println("Promedio de calificaciones de cada examen:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Examen " + (j + 1) + ": " + promediosExamenes[j]);
        }

        System.out.println("Promedio de cada alumno:");
        for (int i = 0; i < 30; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + promediosAlumnos[i]);
        }

        System.out.println("Examen con el mayor promedio de calificación: Examen " + tipoExamenMayorPromedio);
        System.out.println("Promedio: " + mayorPromedio);
    }
}
