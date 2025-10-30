package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_2_14 { // El nombre del archivo debe ser PS_2_14.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe calcular y devolver el valor de f(x)
     * según la siguiente expresión:
     *
     * f(x) = x^2,       si (x mod 4) = 0
     * f(x) = x / 6,     si (x mod 4) = 1
     * f(x) = sqrt(x),   si (x mod 4) = 2
     * f(x) = x^3 + 5,   si (x mod 4) = 3
     *
     * @param x El valor de tipo entero.
     * @return El resultado de f(x) como un double.
     */
    public double calcularFuncion(int x) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        double resultado = 0.0; // Valor provisional

        // Escribe aquí tu lógica (probablemente un 'switch' o 'if-else if')
        // basada en (x % 4)
        
        // Pista: Para x/6, asegúrate de usar 6.0 para división con decimales.
        // Pista: Para potencias, usa Math.pow(base, exponente).
        // Pista: Para raíz cuadrada, usa Math.sqrt(numero).
        

        return resultado; // Devuelve el resultado calculado

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS_2_14 ejercicio = new PS_2_14();

        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        try {
            double resultado = ejercicio.calcularFuncion(x);
            System.out.println("El resultado de f(x) es: " + resultado);

        } catch (Exception e) {
            System.err.println("Ocurrió un error al calcular: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}