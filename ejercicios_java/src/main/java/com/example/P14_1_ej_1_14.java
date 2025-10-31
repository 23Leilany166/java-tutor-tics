package com.example;
import java.util.Scanner;

/**
 * El programa, dado como dato un número entero positivo,
 * calcula el cuadrado y el cubo de dicho número.
 */
public class P14_1_ej_1_14 {

    /**
     * Calcula el cuadrado de un número.
     * @param num El número entero de entrada.
     * @return El cuadrado del número.
     */
    public double calcularCuadrado(int num) {
        return Math.pow(num, 2);
    }

    /**
     * Calcula el cubo de un número.
     * @param num El número entero de entrada.
     * @return El cubo del número.
     */
    public double calcularCubo(int num) {
        return Math.pow(num, 3);
    }

    public static void main(String[] args) {
        // Se crea una instancia de la clase para usar sus métodos.
        P14_1_ej_1_14 calculadora = new P14_1_ej_1_14();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();

        // Se llaman a los métodos para realizar los cálculos.
        double cua = calculadora.calcularCuadrado(num);
        double cub = calculadora.calcularCubo(num);

        System.out.println("El cuadrado de " + num + " es: " + cua);
        System.out.println("El cubo de " + num + " es: " + cub);

        teclado.close();
    }
}