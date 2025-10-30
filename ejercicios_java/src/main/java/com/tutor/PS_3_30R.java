package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula la serie de Sen(X) hasta que el próximo término
 * a sumar sea <= 0.01.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_3_30R { // El nombre del archivo debe ser PS_3_30R.java

    /**
     * Clase interna estática para almacenar los resultados del cálculo.
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
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Calcula la serie de Sen(X) hasta que el valor absoluto del 
     * próximo término sea <= 0.01.
     *
     * @param x El valor (entero) en radianes.
     * @return Un objeto ResultadosSeno con la suma y el conteo de términos.
     */
    public ResultadosSeno calcularSeno(int x) {
        // Convertimos a double para los cálculos
        double x_rad = (double) x; 
        
        double senX = 0.0;
        double termino = x_rad; // El primer término es X
        int numeroTerminos = 0;
        int k = 1; // Para el denominador (1, 3, 5...)

        // Usamos un bucle do-while para asegurar que al menos el primer término se sume
        // y que la condición se verifique *antes* de sumar el siguiente término.
        do {
            // 1. Sumar el término actual
            senX += termino;
            numeroTerminos++;

            // 2. Calcular el siguiente término
            // termino_nuevo = termino_anterior * -(x*x) / ( (2k) * (2k+1) )
            // Aquí k representa el *conteo* de términos, así que usamos 2*k y 2*k+1
            termino *= -(x_rad * x_rad) / ((2 * numeroTerminos) * (2 * numeroTerminos + 1));

        } while (Math.abs(termino) > 0.01); // El bucle se detiene si el *nuevo* término es <= 0.01

        return new ResultadosSeno(senX, numeroTerminos);
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_3_30R ejercicio = new PS_3_30R(); // Instancia de la clase

        System.out.print("Ingrese el valor de X (entero en radianes): ");
        int x = scanner.nextInt();

        // Llamar al método de lógica
        ResultadosSeno resultados = ejercicio.calcularSeno(x);

        // Imprimir resultados
        System.out.println("SEN(X) ≈ " + resultados.valorSeno);
        System.out.println("Número de términos requeridos: " + resultados.conteoTerminos);
        
        scanner.close();
    }
}