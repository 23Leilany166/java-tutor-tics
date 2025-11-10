package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.2 - Promedio de Calificaciones (Archivo para Estudiante)
 * Calcula el promedio de calificaciones usando centinela -1 para indicar fin de datos.
 * Programación Estructurada: todos los métodos son estáticos.
 * 
 * INSTRUCCIONES: Completa los métodos marcados con TODO
 */
public class problema_ps_3_2_Estudiante {

    /**
     * Calcula el promedio de un arreglo de calificaciones.
     * El arreglo debe terminar con el valor -1 que indica fin de datos.
     * 
     * @param calificaciones Arreglo con las calificaciones y -1 al final
     * @return El promedio de las calificaciones (excluyendo el -1)
     */
    public static double calcularPromedio(double[] calificaciones) {
        // TODO: Inicializar SUMA en 0
        
        // TODO: Inicializar CONTADOR en 0
        
        // TODO: Crear un ciclo para recorrer el arreglo de calificaciones
        // PISTA: Usa un for-each: for (double cal : calificaciones)
        
            // TODO: Si la calificación es -1, salir del ciclo
            // PISTA: Usa if (cal == -1) break;
            
            // TODO: Sumar la calificación a SUMA
            
            // TODO: Incrementar CONTADOR en 1
        
        // TODO: Calcular y retornar PROMEDIO = SUMA / CONTADOR
        // IMPORTANTE: Verifica que CONTADOR > 0 antes de dividir
        
        return 0.0; // Reemplaza esta línea con tu código
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Cálculo de Promedio de Calificaciones");
        System.out.println("========================================");
        System.out.println("Ingrese las calificaciones (ingrese -1 para terminar):");

        // Usar una lista para almacenar calificaciones
        java.util.ArrayList<Double> listaCals = new java.util.ArrayList<>();
        
        while (true) {
            System.out.print("Calificación: ");
            double cal = scanner.nextDouble();
            listaCals.add(cal);
            
            if (cal == -1) {
                break;
            }
        }

        // Convertir a arreglo
        double[] calificaciones = new double[listaCals.size()];
        for (int i = 0; i < listaCals.size(); i++) {
            calificaciones[i] = listaCals.get(i);
        }

        // Calcular promedio
        double promedio = calcularPromedio(calificaciones);

        // Mostrar resultado
        System.out.println("\n========================================");
        System.out.printf("El promedio de calificaciones es: %.2f%n", promedio);
        System.out.println("========================================");

        scanner.close();
    }
}
