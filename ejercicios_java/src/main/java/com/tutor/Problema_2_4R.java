package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_2_4R { // El nombre del archivo debe ser Problema_2_4R.java

    /**
     * Calcula el promedio de 5 calificaciones.
     * @param cal1 Calificación 1
     * @param cal2 Calificación 2
     * @param cal3 Calificación 3
     * @param cal4 Calificación 4
     * @param cal5 Calificación 5
     * @return El promedio calculado como double.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        // Validación opcional (buena práctica)
        if (cal1 < 0 || cal2 < 0 || cal3 < 0 || cal4 < 0 || cal5 < 0) {
            throw new IllegalArgumentException("Las calificaciones no pueden ser negativas.");
        }
        return (cal1 + cal2 + cal3 + cal4 + cal5) / 5.0;
    }

    /**
     * Determina si un promedio es aprobatorio (>= 6).
     * @param promedio El promedio a evaluar.
     * @return "Aprobado" si promedio >= 6, "No Aprobado" en caso contrario.
     */
    public String determinarStatus(double promedio) {
        if (promedio >= 6) {
            return "Aprobado"; // Cambiado de "¡Aprobado!" para consistencia
        } else {
            return "No Aprobado";
        }
    }

    /**
     * Método principal para interacción con el usuario.
     * Los tests automáticos no usarán este método directamente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema_2_4R ejercicio = new Problema_2_4R(); // Instancia de la clase

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

        try {
            // Llamar al método de cálculo
            double promedioCalculado = ejercicio.calcularPromedio(CAL1, CAL2, CAL3, CAL4, CAL5);
            
            // Llamar al método para determinar el estado
            String status = ejercicio.determinarStatus(promedioCalculado);

            // Imprimir resultados
            System.out.println("\n--- Resultados ---");
            System.out.println("Matrícula: " + MAT);
            System.out.println("Promedio: " + promedioCalculado);
            System.out.println("Estado: " + status); // Imprime el estado devuelto

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Cerrar el scanner
        }
    }
}