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
public class PS_3_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de X: ");
        double x = scanner.nextDouble();

        double termino = x;
        double senX = termino;
        int numeroTerminos = 1;

        while (Math.abs(termino) > 0.01) {
            termino *= -(x * x) / ((2 * numeroTerminos) * (2 * numeroTerminos + 1));
            senX += termino;
            numeroTerminos++;
        }

        System.out.println("SEN(X) ≈ " + senX);
        System.out.println("Número de términos requeridos: " + numeroTerminos);
    
    }
    
}
