package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_3_30 { // El nombre del archivo debe ser PS_3_30.java

    /**
     * Clase interna estática para almacenar los resultados.
     * No modificar esta clase.
     */
    public static class ResultadosSeno {
        public final double valorSeno;
        public final int conteoTerminos;

        public ResultadosSeno(double valorSeno, int conteoTerminos) {
            this.valorSeno = valorSeno;
            this.conteoTerminos = conteoTerminos;
        }
    }

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe calcular la serie de Sen(X) dada por:
     * X - X^3/3! + X^5/5! - X^7/7! ...
     *
     * El bucle debe detenerse cuando el valor absoluto del *próximo*
     * término a sumar sea menor o igual a 0.01.
     *
     * @param x El valor (entero) en radianes.
     * @return Un objeto ResultadosSeno con la suma (valorSeno) y 
     * el número de términos sumados (conteoTerminos).
     */
    public ResultadosSeno calcularSeno(int x) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        double x_rad = (double) x;
        double senX = 0.0;
        double termino = x_rad; // El primer término es X
        int numeroTerminos = 0;

        // Escribe aquí tu lógica (se recomienda un bucle 'do-while')
        // 1. Suma el 'termino' actual a 'senX'
        // 2. Incrementa 'numeroTerminos'
        // 3. Calcula el 'termino' *siguiente*
        // 4. El bucle debe continuar mientras Math.abs(termino) > 0.01
        
        
        
        // Devuelve el objeto con tus resultados
        return new ResultadosSeno(senX, numeroTerminos); 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_3_30 ejercicio = new PS_3_30();

        System.out.print("Ingrese el valor de X (entero en radianes): ");
        int x = scanner.nextInt();

        ResultadosSeno resultados = ejercicio.calcularSeno(x);

        System.out.println("SEN(X) ≈ " + resultados.valorSeno);
        System.out.println("Número de términos requeridos: " + resultados.conteoTerminos);
        
        scanner.close();
    }
}