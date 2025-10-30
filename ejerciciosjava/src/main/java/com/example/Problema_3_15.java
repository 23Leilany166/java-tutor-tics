package com.example;


import java.util.Scanner;

/**
 *
 * @author imac22
 */
public class Problema_3_15 {

    public static void main(String[] args) {
        int CL = 0;
        int CUENTA = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese TIPO: ");
        String TIPO = scanner.nextLine();
        
        System.out.print("Ingrese DUR: ");
        int DUR = scanner.nextInt();
        
        while (!TIPO.equals("X") && DUR != -1) {
            if (TIPO.equals("H") && DUR > 3) {
                double COSTO = 7.59 + ((DUR - 3) * 3.03);
                CUENTA += COSTO;
            } else {
                double COSTO = 7.59;
                CUENTA += COSTO;
            }
            
            if (TIPO.equals("L")) {
                CL++;
                
                if (CL > 50) {
                    CUENTA += 0.60;
                }
            }
            
            if (DUR > 3) {
                double COSTO = 1.20 + ((DUR - 3) * 0.48);
                CUENTA += COSTO;
            } else {
                double COSTO = 1.20;
                CUENTA += COSTO;
            }
            
            System.out.print("Ingrese TIPO: ");
            TIPO = scanner.nextLine();
            
            System.out.print("Ingrese DUR: ");
            DUR = scanner.nextInt();
            
            scanner.nextLine(); // Limpiar el búfer de entrada
        }
        
        System.out.println("CUENTA: " + CUENTA);
    }
}

