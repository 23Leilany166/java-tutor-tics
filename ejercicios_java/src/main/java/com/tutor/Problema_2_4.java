package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * Plantilla para Problema 2.4: Promedio y Estado Aprobado/No Aprobado.
 */
public class Problema_2_4 { // El nombre del archivo debe ser Problema_2_4.java

    /**
     * TAREA DEL ESTUDIANTE 1: Calcular Promedio
     * Completa este método. Debe calcular y devolver el promedio
     * de las cinco calificaciones proporcionadas.
     * Asegúrate de que la división sea de punto flotante.
     * Opcional: Añade validación para calificaciones negativas.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE 1 -----
        
        // El estudiante debe reemplazar esta línea
        double promedio = 0.0; // Valor provisional

        // Aquí va la lógica del estudiante para calcular el promedio

        return promedio; // Devuelve el promedio calculado

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE 1 -----
    }

    /**
     * TAREA DEL ESTUDIANTE 2: Determinar Estado
     * Completa este método. Debe devolver "Aprobado" si el
     * promedio proporcionado es mayor o igual a 6, y "No Aprobado" en caso contrario.
     */
    public String determinarStatus(double promedio) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE 2 -----
        
        // El estudiante debe reemplazar esta línea
        String status = "PENDIENTE"; // Valor provisional

        // Aquí va la lógica del estudiante para determinar el estado

        return status; // Devuelve "Aprobado" o "No Aprobado"

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE 2 -----
    }


    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Problema_2_4 ejercicio = new Problema_2_4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Problema 2.4 - Prueba Manual");
        
        System.out.print("Ingrese la matrícula del alumno: ");
        int matricula = scanner.nextInt(); 

        // Solicitar calificaciones
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
            // Llama al primer método que el estudiante debe implementar
            double promedioCalculado = ejercicio.calcularPromedio(c1, c2, c3, c4, c5);
            
            // Llama al segundo método que el estudiante debe implementar
            String statusCalculado = ejercicio.determinarStatus(promedioCalculado);

            // Muestra los resultados
            System.out.println("\n--- Resultados del Cálculo ---");
            System.out.println("Matrícula (informativa): " + matricula);
            System.out.println("Promedio calculado: " + promedioCalculado);
            System.out.println("Status: " + statusCalculado);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}