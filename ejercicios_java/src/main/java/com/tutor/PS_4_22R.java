package com.tutor; // O tu paquete específico

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * REFRACTORIZADO
 * Este código analiza la producción de N fábricas.
 * Corrige los errores lógicos del original.
 * La lógica está separada en métodos para poder ser probada.
 */
public class PS_4_22R { // El nombre del archivo debe ser PS_4_22R.java

    /**
     * Clase interna estática para almacenar el resultado del inciso (a).
     */
    public static class ResultadoAnual {
        public final int clave;
        public final double produccionTotal;

        public ResultadoAnual(int clave, double produccionTotal) {
            this.clave = clave;
            this.produccionTotal = produccionTotal;
        }
    }

    /**
     * MÉTODO REFACTORIZADO (a):
     * Encuentra la fábrica con la mayor producción anual (suma de 12 meses).
     *
     * @param claves Arreglo con las claves de las fábricas.
     * @param produccion Matriz [fábrica][mes] con los datos de producción.
     * @return Un objeto ResultadoAnual con la clave y la producción total de la fábrica ganadora.
     */
    public ResultadoAnual encontrarMayorProduccion(int[] claves, double[][] produccion) {
        double maxProduccion = -1.0; // Usar -1 para manejar producciones de 0
        int claveMax = -1;
        int N = claves.length;

        for (int i = 0; i < N; i++) { // Iterar sobre cada fábrica
            double sumaAnual = 0.0;
            for (int j = 0; j < 12; j++) { // Sumar los 12 meses
                sumaAnual += produccion[i][j];
            }
            
            // Comparamos la *suma anual* de esta fábrica con el máximo encontrado
            if (sumaAnual > maxProduccion) {
                maxProduccion = sumaAnual;
                claveMax = claves[i];
            }
        }
        return new ResultadoAnual(claveMax, maxProduccion);
    }

    /**
     * MÉTODO REFACTORIZADO (b):
     * Encuentra las fábricas que superaron un límite en un mes específico.
     *
     * @param claves Arreglo con las claves de las fábricas.
     * @param produccion Matriz [fábrica][mes] con los datos de producción.
     * @param mesConsulta El mes a consultar (1 a 12).
     * @param limite El monto a superar (ej. 150000).
     * @return Una Lista de Integers con las claves de las fábricas que cumplen la condición.
     */
    public List<Integer> encontrarSuperioresA(int[] claves, double[][] produccion, int mesConsulta, double limite) {
        List<Integer> fabricasSuperiores = new ArrayList<>();
        int N = claves.length;
        int mesIndice = mesConsulta - 1; // Convertir mes 1-12 a índice 0-11

        // Validar que el mes esté en el rango
        if (mesIndice < 0 || mesIndice >= 12) {
            return fabricasSuperiores; // Devolver lista vacía si el mes es inválido
        }

        for (int i = 0; i < N; i++) { // Iterar sobre cada fábrica
            if (produccion[i][mesIndice] > limite) {
                fabricasSuperiores.add(claves[i]);
            }
        }
        return fabricasSuperiores;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama a los métodos de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_4_22R ejercicio = new PS_4_22R(); // Instancia de la clase

        System.out.print("Ingrese el número de fábricas (N): ");
        int N = scanner.nextInt();

        // Validar N
        if (N < 1 || N > 500) {
            System.out.println("El número de fábricas debe estar entre 1 y 500.");
            scanner.close();
            return;
        }

        // Crear arreglos para almacenar TODOS los datos
        int[] clavesFabricas = new int[N];
        double[][] produccionFabricas = new double[N][12];

        // --- LECTURA DE DATOS ---
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la clave de la fábrica " + (i + 1) + ": ");
            clavesFabricas[i] = scanner.nextInt();
            System.out.println("Ingrese la producción de los 12 meses para la fábrica " + clavesFabricas[i] + ":");
            for (int j = 0; j < 12; j++) {
                System.out.print("  Mes " + (j + 1) + ": ");
                produccionFabricas[i][j] = scanner.nextDouble();
            }
        }

        // --- PROCESAMIENTO INCISO (a) ---
        ResultadoAnual resA = ejercicio.encontrarMayorProduccion(clavesFabricas, produccionFabricas);
        System.out.println("\n--- Inciso (a): Fábrica con Mayor Producción Anual ---");
        System.out.println("La fábrica con mayor producción fue: " + resA.clave);
        System.out.println("Producción total anual: " + resA.produccionTotal);

        // --- PROCESAMIENTO INCISO (b) ---
        System.out.print("\nIngrese el mes a consultar (1-12) para el inciso (b): ");
        int mesConsulta = scanner.nextInt();
        
        List<Integer> resB = ejercicio.encontrarSuperioresA(clavesFabricas, produccionFabricas, mesConsulta, 150000);
        
        System.out.println("--- Inciso (b): Fábricas con producción > 150,000 en el mes " + mesConsulta + " ---");
        if (resB.isEmpty()) {
            System.out.println("Ninguna fábrica superó los 150,000 en ese mes.");
        } else {
            for (int clave : resB) {
                System.out.println("Fábrica clave: " + clave);
            }
        }
        
        scanner.close();
    }
}