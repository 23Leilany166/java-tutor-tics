package com.ejercicios;

import java.util.Scanner;

public class CalculoAumentoSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = scanner.nextInt();

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        double aumento;

        switch (categoria) {
            case 1:
                aumento = sueldo * 0.15;
                break;
            case 2:
                aumento = sueldo * 0.10;
                break;
            case 3:
                aumento = sueldo * 0.08;
                break;
            case 4:
                aumento = sueldo * 0.07;
                break;
            default:
                System.out.println("Categoría inválida.");
                return; // Termina el programa si la categoría es inválida
        }

        double nuevoSueldo = sueldo + aumento;
        System.out.println("Categoría del trabajador: " + categoria);
        System.out.println("Nuevo sueldo: " + nuevoSueldo);
    }
}