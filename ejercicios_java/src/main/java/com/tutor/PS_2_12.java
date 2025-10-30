package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_2_12 { // El nombre del archivo debe ser PS_2_12.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe devolver el deporte apropiado
     * basado en la temperatura, según la siguiente tabla:
     * * TEMPERATURA 		DEPORTE
     * > 85 			Natación
     * > 70 y <= 85 	Tenis
     * > 32 y <= 70 	Golf
     * > 10 y <= 32 	Esquí
     * <= 10 			Marcha
     *
     * @param temperatura La temperatura en grados Fahrenheit.
     * @return El nombre del deporte apropiado como un String.
     */
    public String determinarDeporte(double temperatura) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        String deporte = "PENDIENTE"; // Valor provisional

        // Escribe aquí tu estructura if-else if-else
        

        return deporte; // Devuelve el deporte determinado

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_12 ejercicio = new PS_2_12();

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temperatura = scanner.nextDouble();

        // Llama al método que el estudiante debe implementar
        String deporte = ejercicio.determinarDeporte(temperatura);

        System.out.println("Deporte apropiado: " + deporte);
        
        scanner.close();
    }
}