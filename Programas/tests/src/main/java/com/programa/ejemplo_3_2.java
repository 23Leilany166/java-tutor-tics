package com.programa;

import java.util.Scanner;

/**
 * Ejemplo 3.2 - Cálculo de Nómina Total
 * 
 * OBJETIVO:
 * Implementar un programa que calcule la suma total de los sueldos de un conjunto
 * de trabajadores utilizando un arreglo.
 * 
 * CONTEXTO:
 * Este ejercicio introduce el uso de arreglos para almacenar y procesar una
 * colección de valores numéricos (sueldos).
 * 
 * INSTRUCCIONES:
 * 1. Implementa el método calcularNomina() que recibe un arreglo de sueldos.
 * 2. Calcula la suma total de todos los sueldos en el arreglo.
 * 3. Maneja correctamente los siguientes casos:
 *    - Arreglo con valores positivos
 *    - Arreglo con algunos valores en cero
 *    - Arreglo vacío (debe retornar 0.0)
 * 
 * TIPS:
 * - Puedes usar un bucle for tradicional o for-each
 * - Recuerda inicializar la variable que almacena la suma
 * - Los sueldos son valores tipo double (números con decimales)
 */
public class ejemplo_3_2 {

    /**
     * Calcula la suma total de los sueldos.
     * 
     * @param sueldos arreglo con los sueldos de los trabajadores
     * @return la suma total de todos los sueldos
     */
    public double calcularNomina(double[] sueldos) {
        // TODO: Implementa el cálculo de la nómina total
        //
        // Pasos sugeridos:
        // 1. Declara una variable para almacenar la suma (tipo double)
        // 2. Recorre el arreglo sumando cada sueldo
        // 3. Retorna el total calculado
        
        return 0.0; // Reemplaza esta línea con tu implementación
    }

    // El main te permite probar tu implementación
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_3_2 nr = new ejemplo_3_2();
        
        final int TOTAL_TRABAJADORES = 10;
        double[] sueldos = new double[TOTAL_TRABAJADORES];

        System.out.println("Ingrese los " + TOTAL_TRABAJADORES + " sueldos:");

        for (int i = 0; i < TOTAL_TRABAJADORES; i++) {
            System.out.print("Sueldo del trabajador " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        double nominaTotal = nr.calcularNomina(sueldos);
        System.out.printf("\nEl total de la nómina es: %.2f\n", nominaTotal);
        
        scanner.close();
    }
}