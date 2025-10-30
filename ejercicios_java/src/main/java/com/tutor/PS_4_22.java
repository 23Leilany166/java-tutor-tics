package com.tutor; // O tu paquete específico

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PS_4_22 { // El nombre del archivo debe ser PS_4_22.java

    /**
     * Clase interna estática para almacenar el resultado del inciso (a).
     * No modificar esta clase.
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
     * TAREA DEL ESTUDIANTE (a):
     * Completa este método. Debe encontrar la fábrica con la mayor
     * PRODUCCIÓN ANUAL TOTAL (la suma de sus 12 meses).
     *
     * @param claves Arreglo con las claves de las fábricas.
     * @param produccion Matriz [fábrica][mes] con los datos de producción.
     * @return Un objeto ResultadoAnual con la clave y la producción total de la fábrica ganadora.
     */
    public ResultadoAnual encontrarMayorProduccion(int[] claves, double[][] produccion) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (a) -----
        
        double maxProduccion = -1.0;
        int claveMax = -1;
        
        // Escribe tu lógica aquí:
        // 1. Itera sobre cada fábrica (índice i)
        // 2. Dentro, crea una variable 'sumaAnual = 0.0'
        // 3. Itera sobre los 12 meses (índice j) y suma 'produccion[i][j]' a 'sumaAnual'
        // 4. Después del bucle de meses, compara 'sumaAnual' con 'maxProduccion'
        // 5. Si es mayor, actualiza 'maxProduccion' y 'claveMax'
        
        return new ResultadoAnual(claveMax, maxProduccion); 

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (a) -----
    }

    /**
     * TAREA DEL ESTUDIANTE (b):
     * Completa este método. Debe encontrar las claves de las fábricas
     * cuya producción en el 'mesConsulta' fue SUPERIOR a 'limite'.
     *
     * @param claves Arreglo con las claves de las fábricas.
     * @param produccion Matriz [fábrica][mes] con los datos de producción.
     * @param mesConsulta El mes a consultar (viene como 1 a 12).
     * @param limite El monto a superar (150000).
     * @return Una Lista de Integers con las claves de las fábricas que cumplen la condición.
     */
    public List<Integer> encontrarSuperioresA(int[] claves, double[][] produccion, int mesConsulta, double limite) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (b) -----
        
        List<Integer> fabricasSuperiores = new ArrayList<>();
        
        // 1. Convierte 'mesConsulta' (1-12) a un 'mesIndice' (0-11)
        int mesIndice = mesConsulta - 1;

        // 2. Valida que 'mesIndice' esté entre 0 y 11. Si no, devuelve la lista vacía.

        // 3. Itera sobre cada fábrica (índice i)
        // 4. Comprueba si 'produccion[i][mesIndice]' es mayor que 'limite'
        // 5. Si lo es, añade 'claves[i]' a la lista 'fabricasSuperiores'
        
        return fabricasSuperiores;

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (b) -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_4_22 ejercicio = new PS_4_22();
        
        System.out.print("Ingrese el número de fábricas (N): ");
        int N = scanner.nextInt();

        if (N < 1 || N > 500) {
            System.out.println("El número de fábricas debe estar entre 1 y 500.");
            scanner.close();
            return;
        }

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