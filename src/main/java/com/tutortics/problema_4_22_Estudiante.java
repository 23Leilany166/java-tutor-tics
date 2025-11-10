package com.tutortics;

import java.util.Scanner;

/**
 * Problema 4.22 - Gestión de Inventario de Tienda "Don Marce"
 * ACTIVIDAD PARA EL ESTUDIANTE
 * 
 * Completa los métodos marcados con TODO siguiendo los diagramas de flujo.
 */
public class problema_4_22_Estudiante {

    /**
     * TODO: Encuentra la posición del producto con mayor existencia.
     * 
     * Pista: Usa las variables MCA (Mayor CAntidad) y MPR (Mayor PRoducto)
     * - Inicializa MCA ← CAN[1] y MPR ← PRO[1]
     * - Recorre desde I ← 2 hasta N
     * - Si MCA < CAN[I], actualiza ambas variables
     * 
     * @param pro Arreglo de claves de productos
     * @param can Arreglo de existencias
     * @param n Número de productos
     * @return Posición del producto con mayor existencia
     */
    public static int obtenerMayorExistencia(int[] pro, int[] can, int n) {
        // TODO: Implementar según diagrama de flujo Parte B
        return 0;
    }

    /**
     * TODO: Imprime los productos que se deben pedir al proveedor.
     * 
     * Pista: Productos con existencia entre 1 y 49 (inclusive)
     * - Recorre todo el arreglo (I ← 1 hasta N)
     * - Verifica: CAN[I] ≥ 1 y CAN[I] < 50
     * - Imprime: PRO[I] y la cantidad (50 - CAN[I])
     * 
     * @param pro Arreglo de claves de productos
     * @param can Arreglo de existencias
     * @param n Número de productos
     */
    public static void productosAPedir(int[] pro, int[] can, int n) {
        System.out.println("\n=== PRODUCTOS A PEDIR AL PROVEEDOR ===");
        
        // TODO: Implementar según diagrama de flujo Parte C
        
    }

    /**
     * TODO: Elimina productos con existencia cero.
     * 
     * Pista: Algoritmo de compactación de arreglo
     * - Recorre con I ← 1 hasta N
     * - Si CAN[I] = 0:
     *   1. Asigna J ← I
     *   2. Desplaza elementos: PRO[J] ← PRO[J+1], CAN[J] ← CAN[J+1]
     *   3. Decrementa N ← N - 1
     *   4. NO incrementes I (verifica el nuevo elemento en esa posición)
     * - Si CAN[I] ≠ 0: incrementa I normalmente
     * 
     * @param pro Arreglo de claves de productos
     * @param can Arreglo de existencias
     * @param n Número de productos actual
     * @return Nuevo número de productos (N actualizado)
     */
    public static int eliminarConExistenciaCero(int[] pro, int[] can, int n) {
        // TODO: Implementar según diagrama de flujo Parte D
        
        return n;
    }

    /**
     * Método principal - YA IMPLEMENTADO
     * Este método orquesta todas las operaciones.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del número de productos
        System.out.print("Ingrese el número de productos: ");
        int n = scanner.nextInt();

        // Validación: N ≥ 1 y N ≤ 100
        if (n >= 1 && n <= 100) {
            int[] pro = new int[100];  // Tamaño máximo
            int[] can = new int[100];

            // Lectura de datos
            System.out.println("\n=== INGRESO DE PRODUCTOS ===");
            for (int i = 0; i < n; i++) {
                System.out.print("Producto " + (i + 1) + " - Clave: ");
                pro[i] = scanner.nextInt();
                System.out.print("Producto " + (i + 1) + " - Existencia: ");
                can[i] = scanner.nextInt();
            }

            // Llamada a obtener mayor existencia
            int posMayor = obtenerMayorExistencia(pro, can, n);
            System.out.println("\n=== PRODUCTO CON MAYOR EXISTENCIA ===");
            System.out.println("La clave del producto que tiene la mayor existencia es: " + pro[posMayor]);
            System.out.println("Existencia: " + can[posMayor] + " cajas");

            // Llamada a productos a pedir
            productosAPedir(pro, can, n);

            // Llamada a eliminar productos con existencia cero
            int nuevoN = eliminarConExistenciaCero(pro, can, n);
            
            System.out.println("\n=== INVENTARIO DESPUÉS DE ELIMINAR EXISTENCIA CERO ===");
            System.out.println("Productos restantes: " + nuevoN);
            if (nuevoN > 0) {
                for (int i = 0; i < nuevoN; i++) {
                    System.out.println("Clave: " + pro[i] + " - Existencia: " + can[i]);
                }
            } else {
                System.out.println("No quedan productos en el inventario");
            }

        } else {
            System.out.println("Error en el dato");
        }
        
        scanner.close();
    }
}
