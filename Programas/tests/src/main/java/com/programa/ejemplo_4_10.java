package com.programa;

import java.util.Random;

/**
 * Ejemplo 4.10 - Análisis de Datos Meteorológicos
 * 
 * OBJETIVO:
 * Implementar un sistema que analice datos meteorológicos (lluvia) almacenados en
 * un arreglo tridimensional, realizando diferentes cálculos y extracciones de datos.
 * 
 * CONTEXTO:
 * Los datos están organizados en un arreglo met[32][12][5] donde:
 * - Primera dimensión [32]: Estados (0-31)
 * - Segunda dimensión [12]: Meses (0-11)
 * - Tercera dimensión [5]: Años (0-4)
 * 
 * INSTRUCCIONES:
 * Implementa los siguientes métodos:
 * 
 * 1. getLluviasAnio3(): Extrae datos del tercer año (índice 2)
 * 2. calcTotalAnio4(): Calcula total de lluvias del cuarto año (índice 3)
 * 3. calcTotalEst17Anio5(): Calcula total del estado 17 en el último año
 * 4. calcGranTotal(): Suma todas las lluvias de todos los años
 */
public class ejemplo_4_10 {

    /**
     * a) Extrae las lluvias mensuales de cada estado para el tercer año.
     * 
     * @param met arreglo 3D con datos meteorológicos [estado][mes][año]
     * @return matriz 2D [32][12] con las lluvias del tercer año
     */
    public double[][] getLluviasAnio3(double[][][] met) {
        // TODO: Implementa la extracción de datos del tercer año (índice 2)
        //
        // Pasos sugeridos:
        // 1. Crea una matriz resultado double[32][12]
        // 2. Recorre estados (32) y meses (12)
        // 3. Copia los valores de met[estado][mes][2]
        
        return new double[32][12]; // Reemplaza con tu implementación
    }

    /**
     * b) Calcula el total de lluvias en todo el país durante el cuarto año.
     * 
     * @param met arreglo 3D con datos meteorológicos [estado][mes][año]
     * @return suma total de lluvias del cuarto año
     */
    public double calcTotalAnio4(double[][][] met) {
        // TODO: Implementa el cálculo del total para el cuarto año (índice 3)
        //
        // Pasos sugeridos:
        // 1. Inicializa una variable para el total
        // 2. Suma los valores de met[estado][mes][3]
        // 3. Retorna el total
        
        return 0.0; // Reemplaza con tu implementación
    }

    /**
     * c) Calcula el total de lluvias del estado 17 en el último año.
     * 
     * @param met arreglo 3D con datos meteorológicos [estado][mes][año]
     * @return suma de lluvias del estado 17 en el último año
     */
    public double calcTotalEst17Anio5(double[][][] met) {
        // TODO: Implementa el cálculo para el estado 17 (índice 16)
        // en el último año (índice 4)
        //
        // Tip: Solo necesitas recorrer los meses del estado 16
        
        return 0.0; // Reemplaza con tu implementación
    }

    /**
     * d) Calcula el total general de lluvias en todos los estados, 
     * meses y años.
     * 
     * @param met arreglo 3D con datos meteorológicos [estado][mes][año]
     * @return suma total de todas las lluvias
     */
    public double calcGranTotal(double[][][] met) {
        // TODO: Implementa el cálculo del gran total
        //
        // Pasos sugeridos:
        // 1. Usa tres bucles anidados (estados, meses, años)
        // 2. Suma cada valor al total
        
        return 0.0; // Reemplaza con tu implementación
    }

    // El main te permite probar tu implementación
    public static void main(String[] args) {
        ejemplo_4_10 m3d = new ejemplo_4_10();
        double[][][] met = new double[32][12][5];
        Random rand = new Random();
        for (int e = 0; e < 32; e++) {
            for (int m = 0; m < 12; m++) {
                for (int a = 0; a < 5; a++) {
                    met[e][m][a] = rand.nextDouble() * 100;
                }
            }
        }
        
        System.out.println("--- a) Lluvias del 3er año ---");
        System.out.println("(Salida omitida por brevedad...)\n");
        // m3d.getLluviasAnio3(met); // ... (imprimir si se desea)

        System.out.printf("--- b) Total Lluvias 4to año: %.2f\n", m3d.calcTotalAnio4(met));
        System.out.printf("--- c) Total Lluvias Est. 17 (Último año): %.2f\n", m3d.calcTotalEst17Anio5(met));
        System.out.printf("--- d) Gran Total 5 años: %.2f\n", m3d.calcGranTotal(met));
    }
}