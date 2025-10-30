package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula f(x) basándose en el módulo 4 de x.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_2_14R { // El nombre del archivo debe ser PS_2_14R.java

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Calcula f(x) según la expresión dada.
     *
     * @param x El valor de tipo entero.
     * @return El resultado de f(x) como un double.
     */
    public double calcularFuncion(int x) {
        double resultado;
        int mod = x % 4;

        // Manejar el módulo negativo de Java (ej. -1 % 4 = -1)
        if (mod < 0) {
            mod += 4; // Convertir -1 a 3, -2 a 2, etc.
        }

        switch (mod) {
            case 0:
                // f(x) = x^2
                resultado = Math.pow(x, 2);
                break;
            case 1:
                // f(x) = x / 6
                resultado = x / 6.0; // Usar 6.0 para asegurar división de punto flotante
                break;
            case 2:
                // f(x) = sqrt(x)
                resultado = Math.sqrt(x);
                break;
            case 3:
                // f(x) = x^3 + 5
                resultado = Math.pow(x, 3) + 5;
                break;
            default:
                // Este caso es teóricamente inalcanzable con la corrección del módulo
                throw new IllegalStateException("Valor de módulo inesperado: " + mod);
        }
        return resultado;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS_2_14R ejercicio = new PS_2_14R(); // Instancia de la clase

        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        try {
            // Llamar al método de lógica
            double resultado = ejercicio.calcularFuncion(x);
            System.out.println("El resultado de f(x) es: " + resultado);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}