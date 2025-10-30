package com.example;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejemplo_3_4 { 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumGas = 0;

        System.out.println("Ingrese los gastos (ingrese -1 para finalizar):");
        double gasto = sc.nextDouble();

        while (gasto != -1) {
            sumGas += gasto;
            System.out.println("Ingrese los gastos (ingrese -1 para finalizar):");
            gasto = sc.nextDouble();
        }

        System.out.println("El total de gastos del viaje es: " + sumGas);
        
        sc.close(); // <-- 3. Agrega esto para quitar la advertencia amarilla
    }
    
}