/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Libros;

import java.util.Scanner;

/**
 *
 * @author zenri
 */
public class PS_2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura > 85) {
            System.out.println("Deporte apropiado: Natación");
        } else if (temperatura > 70 && temperatura <= 85) {
            System.out.println("Deporte apropiado: Tenis");
        } else if (temperatura > 32 && temperatura <= 70) {
            System.out.println("Deporte apropiado: Golf");
        } else if (temperatura > 10 && temperatura <= 32) {
            System.out.println("Deporte apropiado: Esquí");
        } else {
            System.out.println("Deporte apropiado: Marcha");
        }
    }
    
}
