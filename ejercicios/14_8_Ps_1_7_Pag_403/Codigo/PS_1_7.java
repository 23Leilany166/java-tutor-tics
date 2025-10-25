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
public class PS_1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del vehículo: ");
        double MON = scanner.nextDouble();

        double enganche = MON * 0.35;
        double saldoRestante = MON - enganche;
        double tasaInteres = 0.12;
        int plazoMeses = 36;
        double mensualidad = saldoRestante * (tasaInteres / 12) / (1 - Math.pow(1 + (tasaInteres / 12), -plazoMeses));

        System.out.println("Importe del enganche: " + enganche);
        System.out.println("Monto de las mensualidades: " + mensualidad);
    }

}
