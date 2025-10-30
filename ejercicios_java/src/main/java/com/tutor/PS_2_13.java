package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_2_13 { // El nombre del archivo debe ser PS_2_13.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe identificar y devolver el número
     * más grande de los tres.
     * El problema original asume que los tres números son diferentes.
     *
     * @param A Primer número real.
     * @param B Segundo número real.
     * @param C Tercer número real.
     * @return El número mayor.
     */
    public double encontrarMayor(double A, double B, double C) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        double mayor = 0.0; // Valor provisional

        // Escribe aquí tu lógica if-else if-else para encontrar el mayor
        
        
        return mayor; // Devuelve el número mayor

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_13 ejercicio = new PS_2_13();

        System.out.print("Ingrese el numero A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el numero B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el numero C: ");
        double C = scanner.nextDouble();
        
        // Llama al método que el estudiante debe implementar
        double mayor = ejercicio.encontrarMayor(A, B, C);
        
        System.out.println("El numero mayor es: " + mayor);
        
        scanner.close();
    }
}