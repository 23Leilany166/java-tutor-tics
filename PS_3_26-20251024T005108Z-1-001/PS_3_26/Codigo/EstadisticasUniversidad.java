package com.ITSOEH.programasjava.PS_3_26;

import java.util.Scanner;
/**
 *
 * @author imac28
 */

public class EstadisticasUniversidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos: ");
        int N = scanner.nextInt();
        
        int contadorFemenino = 0;
        int contadorMasculino = 0;
        int sumaFemenino = 0;
        int sumaMasculino = 0;
        int sumaTotal = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.println("\nAlumno " + i);
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            
            System.out.print("Sexo (0: Femenino, 1: Masculino): ");
            int sexo = scanner.nextInt();
            
            System.out.print("Semestre: ");
            int semestre = scanner.nextInt();
            
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            
            if (sexo == 0) {
                contadorFemenino++;
                sumaFemenino += promedio;
            } else {
                contadorMasculino++;
                sumaMasculino += promedio;
            }
            
            sumaTotal += promedio;
        }
        
        double promedioFemenino = (contadorFemenino > 0) ? sumaFemenino / (double) contadorFemenino : 0;
        double promedioMasculino = (contadorMasculino > 0) ? sumaMasculino / (double) contadorMasculino : 0;
        double promedioGeneral = (N > 0) ? sumaTotal / (double) N : 0;
        
        double porcentajeFemenino = (N > 0) ? (contadorFemenino / (double) N) * 100 : 0;
        double porcentajeMasculino = (N > 0) ? (contadorMasculino / (double) N) * 100 : 0;
        
        System.out.println("\nEstadísticas de la universidad:");
        System.out.println("Porcentaje de población femenina: " + porcentajeFemenino + "%");
        System.out.println("Promedio de la población femenina: " + promedioFemenino);
        System.out.println("Porcentaje de población masculina: " + porcentajeMasculino + "%");
        System.out.println("Promedio de la población masculina: " + promedioMasculino);
        System.out.println("Promedio general de los alumnos: " + promedioGeneral);
    }
}

