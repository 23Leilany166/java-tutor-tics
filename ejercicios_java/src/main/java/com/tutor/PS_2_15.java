package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_2_15 { // El nombre del archivo debe ser PS_2_15.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe realizar la operación aritmética
     * indicada por 'clave' usando 'oper1' y 'oper2'.
     *
     * @param oper1 El primer operando.
     * @param oper2 El segundo operando.
     * @param clave El carácter de operación (+, -, *, /).
     * @return El resultado de la operación.
     * @throws IllegalArgumentException Si la clave no es válida.
     * @throws ArithmeticException Si se intenta dividir por cero (solo para clave '/').
     */
    public double calcular(double oper1, double oper2, char clave) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        double resultado = 0.0; // Valor provisional

        // Escribe aquí tu lógica (probablemente un 'switch')
        
        // ¡No olvides manejar la división por cero!
        // if (clave == '/' && oper2 == 0) { ... throw new ArithmeticException(...); }
        
        // ¡No olvides manejar la clave inválida!
        // default: ... throw new IllegalArgumentException(...);
        

        return resultado; // Devuelve el resultado calculado

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_15 ejercicio = new PS_2_15();

        try {
            System.out.print("Ingrese el primer operando: ");
            double oper1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo operando: ");
            double oper2 = scanner.nextDouble();

            System.out.print("Ingrese la clave de la operación (+, -, *, /): ");
            char clave = scanner.next().charAt(0);

            // Llama al método que el estudiante debe implementar
            double resultado = ejercicio.calcular(oper1, oper2, clave);

            System.out.println("Clave ingresada: " + clave);
            System.out.println("Resultado: " + resultado);

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado en la entrada.");
        } finally {
            scanner.close();
        }
    }
}