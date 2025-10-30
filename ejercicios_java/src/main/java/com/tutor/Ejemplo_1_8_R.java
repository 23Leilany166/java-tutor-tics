package com.tutor; // Asegúrate de que el paquete sea el correcto

import java.util.Scanner;

public class Ejemplo_1_8_R {

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Recibe 5 calificaciones y devuelve el promedio.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        
        // Opcional pero buena práctica: validar entradas
        if (cal1 < 0 || cal2 < 0 || cal3 < 0 || cal4 < 0 || cal5 < 0) {
            throw new IllegalArgumentException("Las calificaciones no pueden ser negativas.");
        }

        // 4. Calcular el promedio
        double promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5.0;
        return promedio;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        // 1. Crear Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Crear una instancia de la clase para llamar al método
        Ejemplo_1_8_R ejercicio = new Ejemplo_1_8_R();

        // 2. Solicitar matrícula
        System.out.print("Ingrese la matrícula del alumno: ");
        int matricula = scanner.nextInt();

        // 3. Solicitar calificaciones
        System.out.print("Ingrese la calificación 1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Ingrese la calificación 2: ");
        double c2 = scanner.nextDouble();
        System.out.print("Ingrese la calificación 3: ");
        double c3 = scanner.nextDouble();
        System.out.print("Ingrese la calificación 4: ");
        double c4 = scanner.nextDouble();
        System.out.print("Ingrese la calificación 5: ");
        double c5 = scanner.nextDouble();

        try {
            // 4. Llamar al método de lógica para calcular
            double promedio = ejercicio.calcularPromedio(c1, c2, c3, c4, c5);

            // 5. Imprimir resultados
            System.out.println("\n--- Resultados ---");
            System.out.println("Matrícula del alumno: " + matricula);
            System.out.println("Promedio de calificaciones: " + promedio);

        } catch (IllegalArgumentException e) {
            // Manejar el error de calificación negativa
            System.err.println("Error: " + e.getMessage());
        } finally {
            // 6. Cerrar el scanner
            scanner.close();
        }
    }
}