package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula la suma, resta y multiplicación de dos números.
 * La lógica está separada en métodos para poder ser probada.
 */
public class PS_1_1R { // El nombre del archivo debe ser PS_1_1R.java

    /**
     * Clase interna estática para almacenar los resultados de las operaciones.
     */
    public static class ResultadosOperaciones {
        public final double suma;
        public final double resta;
        public final double multiplicacion;

        public ResultadosOperaciones(double suma, double resta, double multiplicacion) {
            this.suma = suma;
            this.resta = resta;
            this.multiplicacion = multiplicacion;
        }
    }

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Realiza las operaciones básicas y devuelve los resultados.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return Un objeto ResultadosOperaciones con los tres cálculos.
     */
    public ResultadosOperaciones realizarOperaciones(double num1, double num2) {
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        return new ResultadosOperaciones(suma, resta, multiplicacion);
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_1_1R ejercicio = new PS_1_1R(); // Instancia de la clase

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Llamar al método de lógica
        ResultadosOperaciones resultados = ejercicio.realizarOperaciones(num1, num2);

        // Imprimir resultados desde el objeto
        System.out.println("Suma: " + resultados.suma);
        System.out.println("Resta: " + resultados.resta);
        System.out.println("Multiplicación: " + resultados.multiplicacion);
        
        scanner.close();
    }
}