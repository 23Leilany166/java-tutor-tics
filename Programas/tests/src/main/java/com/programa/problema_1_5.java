package com.programa;

import java.util.Scanner;

/**
 * problema_1_5 - Plantilla para cálculos geométricos de un cilindro
 *
 * OBJETIVO:
 * Implementar métodos para calcular el volumen y el área lateral de un cilindro
 * dados el radio y la altura.
 *
 * INSTRUCCIONES:
 * - Mantén las firmas de los métodos.
 * - Si radio o altura son negativos, retorna 0.
 */
public class problema_1_5 {

    // Lógica separada para ser testeable
    public double calcularVolumen(double radio, double altura) {
        // TODO: Implementa volumen = PI * radio^2 * altura
        return 0.0; // Reemplaza con la implementación correcta
    }

    public double calcularArea(double radio, double altura) {
        // TODO: Implementa área lateral = 2 * PI * radio * altura
        return 0.0; // Reemplaza con la implementación correcta
    }
    
    // El main solo maneja la entrada y salida
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_1_5 c = new problema_1_5(); // Creamos instancia

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = c.calcularVolumen(radio, altura);
        double area = c.calcularArea(radio, altura);

        System.out.println("--- Resultados ---");
        System.out.printf("Volumen: %.4f\n", volumen);
        System.out.printf("Área: %.4f\n", area);
        
        scanner.close();
    }
}