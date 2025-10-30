package com.tutor; // Or your specific package

import java.util.Scanner;

/**
 * Template for Ejemplo 1.8: Average calculation.
 */
public class Ejemplo_1_8 { // File name should be Ejemplo_1_8.java

    /**
     * STUDENT TASK:
     * Complete this method. It should calculate and return the average
     * of the five grades provided as parameters.
     * Ensure the division results in a double (handle floating-point division).
     * Optional: Add validation to ensure grades are not negative.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        // ----- START STUDENT CODE -----
        
        // Student should replace this line with their calculation logic
        double promedio = 0.0; // Placeholder

        return promedio; // Return the calculated average

        // ----- END STUDENT CODE -----
    }


    /**
     * MAIN METHOD (FOR STUDENT'S MANUAL TESTING ONLY)
     * The student can use this to manually test their calcularPromedio logic.
     */
    public static void main(String[] args) {
        Ejemplo_1_8 ejercicio = new Ejemplo_1_8();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejemplo 1.8 - Manual Test");
        
        System.out.print("Ingrese la matrícula del alumno: ");
        int matricula = scanner.nextInt(); // Read matrícula (not used in logic, just for context)

        // Request grades
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
            // Call the method the student needs to implement
            double promedioCalculado = ejercicio.calcularPromedio(c1, c2, c3, c4, c5);

            // Display the result from the student's logic
            System.out.println("\n--- Resultado del Cálculo ---");
            System.out.println("Matrícula (informativa): " + matricula);
            System.out.println("Promedio calculado: " + promedioCalculado);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}