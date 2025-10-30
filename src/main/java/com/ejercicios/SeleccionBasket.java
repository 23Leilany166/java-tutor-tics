// Archivo: src/main/java/com/ejercicios/SeleccionBasket.java
package com.ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class SeleccionBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> aptasNombres = new ArrayList<>();
        List<String> aptosNombres = new ArrayList<>();
        int totalFemenino = 0, aptasFemenino = 0;
        int totalMasculino = 0, aptosMasculino = 0;

        System.out.println("--- Selección de Basket ---");
        System.out.println("Ingrese datos (Nombre Sexo(F/M) Edad Peso Altura).");
        System.out.println("Ingrese 'X' como nombre para terminar.");

        while (true) {
            String nombre;
            char sexo = ' ';
            // ... (el resto de tus variables) ...

            try {
                System.out.print("\nNombre ('X' para salir): ");
                nombre = scanner.next();

                // <<< CORRECCIÓN: Comprobar el fin ANTES de leer más
                if (nombre.equalsIgnoreCase("X")) {
                    break; // Salir del bucle
                }

                System.out.print("Sexo (F/M): ");
                String sexoStr = scanner.next().toUpperCase();
                if (sexoStr.length() == 1 && (sexoStr.charAt(0) == 'F' || sexoStr.charAt(0) == 'M')) {
                    sexo = sexoStr.charAt(0);
                } else {
                    // <<< CORRECCIÓN: Imprimir el mensaje de error que el test espera
                    System.out.println("Sexo inválido para: " + nombre);
                    scanner.nextLine(); // Limpiar el resto de la línea inválida si la hubiera
                    continue; // Saltar al siguiente ciclo
                }

                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Peso (kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Altura (m): ");
                double altura = scanner.nextDouble();
                // scanner.nextLine(); // No es necesario, el próximo bucle usa next()

                // ... (Lógica de aptitud Femenino) ...
                if (sexo == 'F') {
                    totalFemenino++;
                    if (altura > 1.73 && peso >= 50 && peso <= 90) {
                        aptasFemenino++;
                        aptasNombres.add(nombre);
                    }
                    // ... (Lógica de aptitud Masculino) ...
                } else if (sexo == 'M') {
                    totalMasculino++;
                    if (altura > 1.83 && peso > 73 && peso <= 110) {
                        aptosMasculino++;
                        aptosNombres.add(nombre);
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Error en la entrada de datos. Intente de nuevo.");
                scanner.nextLine(); // Limpiar buffer
                continue;
            }
        } // Fin while

        System.out.println("\n--- Resultados Finales ---");

        System.out.println("a) Alumnas Aptas:");
        if (aptasNombres.isEmpty())
            System.out.println("   (Ninguna)");
        else
            aptasNombres.forEach(nom -> System.out.println("   - " + nom));

        System.out.println("\nb) Porcentaje de Alumnas Aptas:");
        if (totalFemenino > 0) {
            double porcFAptas = ((double) aptasFemenino / totalFemenino) * 100.0;
            System.out.printf("   %.2f%% (%d de %d)%n", porcFAptas, aptasFemenino, totalFemenino);
        } else {
            // <<< CORRECCIÓN: Imprimir el mensaje que el test espera
            System.out.println("   N/A (No hubo alumnas)");
        }

        System.out.println("\nc) Alumnos Aptos:");
        if (aptosNombres.isEmpty())
            System.out.println("   (Ninguno)");
        else
            aptosNombres.forEach(nom -> System.out.println("   - " + nom));

        System.out.println("\nd) Porcentaje de Alumnos Aptos:");
        if (totalMasculino > 0) {
            double porcMAptos = ((double) aptosMasculino / totalMasculino) * 100.0;
            System.out.printf("   %.2f%% (%d de %d)%n", porcMAptos, aptosMasculino, totalMasculino);
        } else {
            // <<< CORRECCIÓN: Imprimir el mensaje que el test espera
            System.out.println("   N/A (No hubo alumnos)");
        }
    }
}