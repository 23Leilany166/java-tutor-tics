package com.example; // <-- ¡ESTA LÍNEA ES OBLIGATORIA!

/*
 * EXPRESSION
 {El programa dado como datos dos valores enteros, determina si los mismos satisfacen una expresión}
*/

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Problema_2_2 {
    
    // Aquí dentro va tu código (el método main, etc.)
    // Por ejemplo:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese P:");
        int P = sc.nextInt();
        
        System.out.println("Ingrese Q:");
        int Q = sc.nextInt();
        
        double resultado = Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);
        
        if (resultado < 680) {
            System.out.println("Los valores SÍ satisfacen la expresión.");
            System.out.println("P = " + P + ", Q = " + Q);
        } else {
            System.out.println("Los valores NO satisfacen la expresión.");
        }
        
        sc.close(); 
    }
}