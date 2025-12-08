package com.javatutor.problema_3_15;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        char TIPO;
        int DUR;
        int CL = 0;       // Contador de llamadas locales
        double COSTO;     // Costo de cada llamada
        double CUENTA = 0; // Acumulador

        System.out.print("Ingresa el tipo de llamada (I/N/L/X para terminar): ");
        TIPO = sc.next().toUpperCase().charAt(0);

        // Comienza el ciclo mientras el tipo no sea X
        while (TIPO != 'X') {

            System.out.print("Ingresa la duración en minutos: ");
            DUR = sc.nextInt();

            COSTO = 0; // Reiniciar costo por llamada

            // --- Internacional ---
            if (TIPO == 'I') {
                if (DUR <= 3) {
                    COSTO = 7.59;
                } else {
                    COSTO = 7.59 + (DUR - 3) * 3.03;
                }
            }

            // --- Nacional ---
            else if (TIPO == 'N') {
                if (DUR <= 3) {
                    COSTO = 1.20;
                } else {
                    COSTO = 1.20 + (DUR - 3) * 0.48;
                }
            }

            // --- Local ---
            else if (TIPO == 'L') {
                CL++;  // Contar llamadas locales

                if (CL > 50) {
                    COSTO = 0.60; // Solo se cobra a partir de la llamada 51
                } else {
                    COSTO = 0; // Las primeras 50 son gratis
                }
            }

            CUENTA += COSTO;

            System.out.println("Costo de esta llamada: $" + COSTO);

            System.out.print("\nIngresa el tipo de llamada (I/N/L/X para terminar): ");
            TIPO = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("\nCosto total a pagar: $" + CUENTA);
        System.out.println("Total de llamadas locales: " + CL);
    }
}
