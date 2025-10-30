package com.tutor;

import javax.swing.JOptionPane;

public class Ejemplo_2_1 {

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa este método. Debe devolver "Aprobado" si el numero
     * es mayor que 8, y "Reprobado" en cualquier otro caso.
     */
    public String verificarStatus(int numero) {
        // ----- INICIA EL CÓDIGO DEL ESTUDIANTE -----
        
        // El estudiante debe borrar esta línea y poner su lógica
        return "PENDIENTE"; 
        
        // ----- TERMINA EL CÓDIGO DEL ESTUDIANTE -----
    }


    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El estudiante puede usarlo para probar su lógica manualmente.
     */
    public static void main(String[] args) {
        Ejemplo_2_1 ejercicio = new Ejemplo_2_1();
        
        try {
            String input = JOptionPane.showInputDialog("Ingresa un numero:");
            if (input == null) return; // Salir si presiona cancelar
            
            int numero = Integer.parseInt(input);
            
            // Llama al método que el estudiante debe rellenar
            String status = ejercicio.verificarStatus(numero);
            
            // Muestra el resultado en un pop-up
            JOptionPane.showMessageDialog(null, "Resultado: " + status);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
        }
    }
}