package com.tutor; // Asegúrate de que el paquete sea el correcto

import java.util.Scanner;

/**
 * Este código calcula el promedio de calificaciones de un alumno.
 * Todo el código está en main() para estudiantes principiantes.
 */
public class Ejemplo_1_8_R {

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        // 1. Crear Scanner
        Scanner scanner = new Scanner(System.in);

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

        // 4. Validar que las calificaciones no sean negativas
        if (c1 < 0 || c2 < 0 || c3 < 0 || c4 < 0 || c5 < 0) {
            System.err.println("Error: Las calificaciones no pueden ser negativas.");
        } else {
            // 5. Calcular el promedio directamente aquí
            double promedio = (c1 + c2 + c3 + c4 + c5) / 5.0;

            // 6. Imprimir resultados
            System.out.println("\n--- Resultados ---");
            System.out.println("Matrícula del alumno: " + matricula);
            System.out.println("Promedio de calificaciones: " + promedio);
        }

        // 7. Cerrar el scanner
        scanner.close();
    }
}