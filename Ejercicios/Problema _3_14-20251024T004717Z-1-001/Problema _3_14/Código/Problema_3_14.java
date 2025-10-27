/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

import java.util.Scanner;

/**
 *
 * @author Chema
 */
public class Problema_3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Variables de acumulación
        int API = 0;
        int AP2 = 0;
        int AP3 = 0;
        int AP4 = 0;
        int AP5 = 0;
        double RECAU = 0.0;

        // Lectura de precios de localidades
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio de la localidad 1: ");
        double Pl = scanner.nextDouble();
        System.out.print("Ingrese el precio de la localidad 2: ");
        double P2 = scanner.nextDouble();
        System.out.print("Ingrese el precio de la localidad 3: ");
        double P3 = scanner.nextDouble();
        System.out.print("Ingrese el precio de la localidad 4: ");
        double P4 = scanner.nextDouble();
        System.out.print("Ingrese el precio de la localidad 5: ");
        double P5 = scanner.nextDouble();

        // Lectura de datos de ventas
        System.out.print("Ingrese la clave de localidad (o -1 para terminar): ");
        int CLAVE = scanner.nextInt();
        System.out.print("Ingrese la cantidad de boletos vendidos: ");
        int CANT = scanner.nextInt();

        // Procesamiento de ventas
        while (CLAVE != -1 && CANT != -1) {
            double PRE = 0.0;

            if (CLAVE == 1) {
                PRE = Pl * CANT;
                API += CANT;
            } else if (CLAVE == 2) {
                PRE = P2 * CANT;
                AP2 += CANT;
            } else if (CLAVE == 3) {
                PRE = P3 * CANT;
                AP3 += CANT;
            } else if (CLAVE == 4) {
                PRE = P4 * CANT;
                AP4 += CANT;
            } else if (CLAVE == 5) {
                PRE = P5 * CANT;
                AP5 += CANT;
            }

            System.out.println("CLAVE: " + CLAVE + ", CANT: " + CANT + ", PRE: " + PRE);
            RECAU += PRE;

            System.out.print("Ingrese la clave de localidad (o -1 para terminar): ");
            CLAVE = scanner.nextInt();
            System.out.print("Ingrese la cantidad de boletos vendidos: ");
            CANT = scanner.nextInt();
        }

        // Mostrar resultados
        System.out.println("CANTIDAD BOLETOS TIPO 1: " + API);
        System.out.println("CANTIDAD BOLETOS TIPO 2: " + AP2);
        System.out.println("CANTIDAD BOLETOS TIPO 3: " + AP3);
        System.out.println("CANTIDAD BOLETOS TIPO 4: " + AP4);
        System.out.println("CANTIDAD BOLETOS TIPO 5: " + AP5);
        System.out.println("RECAUDACION DEL ESTADIO: $" + RECAU);
    }

}
