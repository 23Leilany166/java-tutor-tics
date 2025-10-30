package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_1_1 { // El nombre del archivo debe ser PS_1_1.java

    /**
     * Clase interna estática para almacenar los resultados.
     * No modificar esta clase.
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
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe calcular la suma, resta (num1 - num2) 
     * y multiplicación de los dos números.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return Un objeto ResultadosOperaciones con los tres cálculos.
     */
    public ResultadosOperaciones realizarOperaciones(double num1, double num2) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        double suma = 0.0; // Valor provisional
        double resta = 0.0; // Valor provisional
        double multiplicacion = 0.0; // Valor provisional

        // Aquí va la lógica del estudiante para calcular las tres operaciones
        

        // Devuelve el objeto con tus resultados
        return new ResultadosOperaciones(suma, resta, multiplicacion); 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_1_1 ejercicio = new PS_1_1();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        ResultadosOperaciones resultados = ejercicio.realizarOperaciones(num1, num2);

        System.out.println("Suma: " + resultados.suma);
        System.out.println("Resta: " + resultados.resta);
        System.out.println("Multiplicación: " + resultados.multiplicacion);
        
        scanner.close();
    }
}