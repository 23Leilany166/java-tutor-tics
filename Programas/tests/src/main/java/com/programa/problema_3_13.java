package com.programa;

import java.util.Scanner;

/**
 * problema_3_13 - Plantilla para procesar datos meteorológicos mensuales
 *
 * OBJETIVO:
 * Implementar procesarDatos que reciba tres arreglos de 12 valores cada uno
 * (regiones norte, centro y sur) y calcule:
 *  a) Promedio anual de la región centro
 *  b) Mes con menor lluvia en la región sur
 *  c) Región con mayor lluvia anual
 *
 * INSTRUCCIONES:
 * - Mantén la firma del método.
 * - Retorna un objeto ReporteClima con los valores solicitados.
 */
public class problema_3_13 {

    // Lógica separada
    public ReporteClima procesarDatos(double[] rno, double[] rce, double[] rsu) {
        // TODO: Implementa el procesamiento de los arreglos de 12 meses
        // Pasos sugeridos:
        // 1. Sumar los 12 valores para cada región para determinar promedios y totales
        // 2. Buscar el índice (mes) con menor valor en rsu
        // 3. Comparar totales anuales para decidir la región con mayor lluvia
        
        return new ReporteClima(); // Reemplaza con el ReporteClima calculado
    }

    // El main solo maneja I/O
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_3_13 m = new problema_3_13();

        double[] rno = new double[12];
        double[] rce = new double[12];
        double[] rsu = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("--- Mes " + (i + 1) + " ---");
            System.out.print("Lluvia Región Norte: ");
            rno[i] = scanner.nextDouble();
            System.out.print("Lluvia Región Centro: ");
            rce[i] = scanner.nextDouble();
            System.out.print("Lluvia Región Sur: ");
            rsu[i] = scanner.nextDouble();
        }

        ReporteClima reporte = m.procesarDatos(rno, rce, rsu);

        System.out.printf("\na) Promedio anual Región Centro: %.2f\n", reporte.promedioCentro);
        System.out.printf("b) Menor lluvia Región Sur fue en el mes %d (Registro: %.2f)\n", reporte.mesMenorLluviaSur, reporte.registroMenorLluviaSur);
        System.out.println("c) Región con mayor lluvia anual: " + reporte.regionMayorLluvia);
        
        scanner.close();
    }
}