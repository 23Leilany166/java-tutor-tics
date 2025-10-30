package com.ejercicios;

import java.util.Scanner;

public class CostoLlamadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cl = 0; // Contador llamadas locales
        double cuenta = 0.0; // Acumulador costo total
        double costo = 0.0; // Costo llamada actual

        System.out.println("Ingrese tipo (I, N, L) y duración (min). ('X' y -1 para terminar):");
        String tipo = scanner.next().toUpperCase(); // Leer tipo
        int dur = scanner.nextInt(); // Leer duración

        while (!tipo.equals("X") && dur != -1) { // Mientras no sea fin de datos
            costo = 0.0; // Reiniciar costo para esta llamada

            switch (tipo) {
                case "I": // Internacional
                    if (dur > 3) {
                        costo = 7.59 + (dur - 3) * 3.03;
                    } else {
                        costo = 7.59;
                    }
                    break;
                case "N": // Nacional
                    if (dur > 3) {
                        costo = 1.20 + (dur - 3) * 0.48;
                    } else {
                        costo = 1.20;
                    }
                    break;
                case "L": // Local
                    cl++;
                    if (cl > 50) {
                        costo = 0.60;
                    } else {
                        costo = 0.0; // Primeras 50 son gratis
                    }
                    break;
                default:
                    System.out.println("Tipo de llamada inválido: " + tipo);
                    break;
            }

            cuenta += costo; // Acumular costo

            // Leer siguiente llamada
            System.out.println("Siguiente llamada (Tipo y Duración):");
            tipo = scanner.next().toUpperCase();
            dur = scanner.nextInt();
        }

        System.out.printf("Costo total de las llamadas: $%.2f%n", cuenta); // Imprimir total

        scanner.close();
    }
}