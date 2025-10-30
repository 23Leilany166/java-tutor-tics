// Archivo: src/main/java/com/ejercicios/VentasEstadio.java
package com.ejercicios; // <<< CORRECCIÓN: Agregar el paquete

import java.util.Scanner;

public class VentasEstadio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Acumuladores de boletos por tipo (inciso d)
        int AP1 = 0, AP2 = 0, AP3 = 0, AP4 = 0, AP5 = 0;
        // Acumulador de recaudación total (inciso e)
        double RECAU = 0.0;
        // Variables de proceso y precios
        double PRE = 0.0;
        int CLAVE, CANT;

        // --- a) Leer los precios (Simulado) ---
        // P1 a P5 deberían leerse, pero están hardcodeados para que el test sea simple.
        double P1 = 7.25, P2 = 15.80, P3 = 25.00, P4 = 50.00, P5 = 75.00;

        // El código pide leer P1-P5, pero los hardcodea:
        System.out.println("--- Ingreso de Precios (P1 a P5) ---");
        System.out.printf("Precios cargados (P1: %.2f, P5: %.2f, etc.)%n", P1, P5);

        // <<< CORRECCIÓN CLAVE: El código original lee P1-P5 AUNQUE los hardcodeó.
        // Necesitamos leer 5 doubles para consumir la entrada simulada en el test.
        // La entrada simulada en el test (final String PRECIOS = "...") será consumida
        // aquí:
        P1 = scanner.nextDouble();
        P2 = scanner.nextDouble();
        P3 = scanner.nextDouble();
        P4 = scanner.nextDouble();
        P5 = scanner.nextDouble();

        // --- b) Leer la primera venta (inicialización del ciclo) ---
        System.out.println("\n--- Ingreso de Ventas (Clave y Cantidad) ---");
        System.out.println("Clave (1-5) - Cantidad. Ingrese -1 -1 para terminar.");
        System.out.print("Venta 1 (CLAVE CANT): ");
        CLAVE = scanner.nextInt();
        CANT = scanner.nextInt();

        // --- Ciclo Repetitivo Mientras (while) ---
        while (CLAVE != -1 && CANT != -1) {
            PRE = 0.0;

            // 4.1: Condicional para calcular importe y acumular cantidad
            switch (CLAVE) {
                case 1:
                    PRE = P1 * CANT;
                    AP1 += CANT;
                    break;
                case 2:
                    PRE = P2 * CANT;
                    AP2 += CANT;
                    break;
                case 3:
                    PRE = P3 * CANT;
                    AP3 += CANT;
                    break;
                case 4:
                    PRE = P4 * CANT;
                    AP4 += CANT;
                    break;
                case 5:
                    PRE = P5 * CANT;
                    AP5 += CANT;
                    break;
                default:
                    System.out.println("Clave de Localidad inválida: " + CLAVE);
                    PRE = 0;
                    break;
            }

            // --- c) Imprimir datos de la venta actual ---
            if (CLAVE >= 1 && CLAVE <= 5) {
                System.out.printf("Venta procesada: CLAVE=%d, CANT=%d, Importe=%.2f%n", CLAVE, CANT, PRE);
            }

            // 4.2: Acumular recaudación total
            RECAU += PRE;

            // Leer siguiente venta (Actualización del ciclo)
            System.out.print("Siguiente venta (CLAVE CANT): ");
            CLAVE = scanner.nextInt();
            CANT = scanner.nextInt();
        }

        // --- 5 y 6: Escribir resultados finales ---
        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println("d) Cantidad de Boletos Vendidos por Tipo:");
        System.out.println("  CANTIDAD BOLETOS TIPO 1: " + AP1);
        System.out.println("  CANTIDAD BOLETOS TIPO 2: " + AP2);
        System.out.println("  CANTIDAD BOLETOS TIPO 3: " + AP3);
        System.out.println("  CANTIDAD BOLETOS TIPO 4: " + AP4);
        System.out.println("  CANTIDAD BOLETOS TIPO 5: " + AP5);
        System.out.printf("e) RECAUDACIÓN TOTAL DEL ESTADIO: $%.2f%n", RECAU);

        // <<< CORRECCIÓN CLAVE: El test maneja el cierre
        // scanner.close();
    }
}