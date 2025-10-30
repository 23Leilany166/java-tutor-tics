package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código realiza operaciones aritméticas básicas.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_2_15R { // El nombre del archivo debe ser PS_2_15R.java

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Realiza una operación aritmética basada en una clave.
     *
     * @param oper1 El primer operando.
     * @param oper2 El segundo operando.
     * @param clave El carácter de operación (+, -, *, /).
     * @return El resultado de la operación.
     * @throws IllegalArgumentException Si la clave no es válida.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public double calcular(double oper1, double oper2, char clave) {
        double resultado;

        switch (clave) {
            case '+':
                resultado = oper1 + oper2;
                break;
            case '-':
                resultado = oper1 - oper2;
                break;
            case '*':
                resultado = oper1 * oper2;
                break;
            case '/':
                // ¡Validación crítica!
                if (oper2 == 0) {
                    throw new ArithmeticException("División por cero no permitida.");
                }
                resultado = oper1 / oper2;
                break;
            default:
                // Lanzar una excepción es mejor que imprimir un error y continuar
                throw new IllegalArgumentException("Clave de operación inválida: " + clave);
        }
        return resultado;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_15R ejercicio = new PS_2_15R(); // Instancia de la clase

        try {
            System.out.print("Ingrese el primer operando: ");
            double oper1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo operando: ");
            double oper2 = scanner.nextDouble();

            System.out.print("Ingrese la clave de la operación (+, -, *, /): ");
            char clave = scanner.next().charAt(0);

            // Llamar al método de lógica
            double resultado = ejercicio.calcular(oper1, oper2, clave);

            // Imprimir resultados
            System.out.println("Clave ingresada: " + clave);
            System.out.println("Resultado: " + resultado);

        } catch (IllegalArgumentException | ArithmeticException e) {
            // Capturar los errores que nuestro método puede lanzar
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Capturar otros errores (ej. entrada no numérica)
            System.err.println("Ocurrió un error inesperado en la entrada.");
        } finally {
            scanner.close(); // Cerrar el scanner
        }
    }
}