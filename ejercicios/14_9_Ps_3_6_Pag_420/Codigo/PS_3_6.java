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
public class PS_3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de empleados: ");
        int N = scanner.nextInt();
        
        double[] sueldos = new double[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
            
            if (sueldos[i] < 800) {
                sueldos[i] *= 1.15; 
            }
        }
        
        System.out.println("Sueldos con el aumento:");
        for (int i = 0; i < N; i++) {
            System.out.println("Trabajador " + (i + 1) + ": " + sueldos[i]);
        }
    }
    
}
