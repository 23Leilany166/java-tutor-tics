package com.tutor;

import javax.swing.JOptionPane;

public class Ejemplo_2_1R {

    /**
     * Determines the status based on a number.
     * @param numero The number (representing a grade) to check.
     * @return "Aprobado" if numero > 8, "Reprobado" otherwise.
     */
    public String verificarStatus(int numero) {
        if (numero > 8) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo 2.1 ");
        Ejemplo_2_1R ejercicio = new Ejemplo_2_1R();

        try {
            // Get input using JOptionPane
            String input = JOptionPane.showInputDialog("Ingresa un numero:");
            if (input == null) { // Handle case where user clicks Cancel or closes dialog
                System.out.println("Operación cancelada.");
                return; 
            }
            int numero = Integer.parseInt(input);
            
            // Call the refactored method to get the status
            String status = ejercicio.verificarStatus(numero);
            
            // Print the status
            System.out.println(status);

        } catch (NumberFormatException e) {
            // Handle case where input is not a valid integer
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: Entrada no es un número entero válido.");
        }
    }
}