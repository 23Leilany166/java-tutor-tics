/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITSOEH.programasjava.Problema_2_4;

import java.util.Scanner;

/**
 *
 * @author imac28
 */
public class VerificarAprobacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la matrícula del alumno: ");
        int MAT = scanner.nextInt();

        System.out.print("Ingrese la primera calificación: ");
        double CAL1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double CAL2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double CAL3 = scanner.nextDouble();

        System.out.print("Ingrese la cuarta calificación: ");
        double CAL4 = scanner.nextDouble();

        System.out.print("Ingrese la quinta calificación: ");
        double CAL5 = scanner.nextDouble();

        double promedio = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5.0;

        System.out.println("Matrícula: " + MAT);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 6) {
            System.out.println("¡Aprobado!");
        } else {
            System.out.println("No aprobado");
        }
    }
}
