package com.example;

import java.util.Scanner;

public class P14_5_4_Ejemplo_4_4_Insertar_Desordenado {

    /**
     * Inserta un elemento al final de un arreglo desordenado si hay espacio disponible.
     *
     * @param arreglo El arreglo donde se insertará el elemento.
     * @param tamanoActual El número de elementos válidos actualmente en el arreglo.
     * @param elementoAInsertar El entero a insertar.
     * @return El nuevo tamaño del arreglo. Será (tamanoActual + 1) si la inserción fue exitosa,
     * o el tamaño original si el arreglo ya está lleno.
     */
    public int insertarElementoDesordenado(int[] arreglo, int tamanoActual, int elementoAInsertar) {
        // 1. Verificar si hay espacio en el arreglo
        if (tamanoActual < arreglo.length) {
            // 2. Insertar el elemento en la siguiente posición disponible
            arreglo[tamanoActual] = elementoAInsertar;
            // 3. Devolver el nuevo tamaño incrementado
            return tamanoActual + 1;
        } else {
            // No hay espacio, devolver el tamaño original sin cambios
            return tamanoActual;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P14_5_4_Ejemplo_4_4_Insertar_Desordenado insertador = new P14_5_4_Ejemplo_4_4_Insertar_Desordenado();

        int[] a = new int[5]; // Un arreglo pequeño para probar fácilmente el límite
        int n = 0; // El tamaño actual empieza en 0
        char continuar = 's';

        while (n < a.length && (continuar == 's' || continuar == 'S')) {
            System.out.print("Ingrese el elemento a insertar: ");
            int y = sc.nextInt();

            int tamanoOriginal = n;
            n = insertador.insertarElementoDesordenado(a, tamanoOriginal, y);

            if (n > tamanoOriginal) {
                System.out.println("Elemento insertado correctamente.");
                System.out.print("Arreglo actual: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println("\n¿Desea insertar otro elemento? (s/n)");
                continuar = sc.next().charAt(0);
            }
        }
        
        if (n >= a.length) {
            System.out.println("No hay más espacio para insertar elementos.");
        }
        
        System.out.println("Proceso finalizado.");
        sc.close();
    }
}