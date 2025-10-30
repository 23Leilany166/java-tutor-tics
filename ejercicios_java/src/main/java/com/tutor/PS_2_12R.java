package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código determina un deporte basado en la temperatura.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_2_12R { // El nombre del archivo debe ser PS_2_12R.java

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Determina el deporte apropiado basado en la temperatura.
     *
     * @param temperatura La temperatura en grados Fahrenheit.
     * @return El nombre del deporte apropiado como un String.
     */
    public String determinarDeporte(double temperatura) {
        // Esta lógica if-else if es más eficiente
        // Si el código llega al 'else if', ya sabe que la condición anterior fue falsa
        if (temperatura > 85) {
            return "Natación";
        } else if (temperatura > 70) { 
            // No es necesario (&& <= 85) porque si fuera > 85, habría entrado en el primer 'if'
            return "Tenis";
        } else if (temperatura > 32) {
            // No es necesario (&& <= 70)
            return "Golf";
        } else if (temperatura > 10) {
            // No es necesario (&& <= 32)
            return "Esquí";
        } else {
            // Todo lo demás (<= 10)
            return "Marcha";
        }
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_12R ejercicio = new PS_2_12R(); // Instancia de la clase

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temperatura = scanner.nextDouble();

        // Llamar al método de lógica
        String deporte = ejercicio.determinarDeporte(temperatura);

        // Imprimir el resultado devuelto por el método
        System.out.println("Deporte apropiado: " + deporte);
        
        scanner.close();
    }
}