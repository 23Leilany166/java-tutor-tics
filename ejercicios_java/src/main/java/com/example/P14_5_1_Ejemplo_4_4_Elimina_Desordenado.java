package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class P14_5_1_Ejemplo_4_4_Elimina_Desordenado {

    /**
     * Busca y elimina la primera ocurrencia de un elemento en un arreglo desordenado.
     * La eliminación se realiza desplazando los elementos subsecuentes.
     *
     * @param arreglo El arreglo de enteros a modificar.
     * @param tamanoActual El número de elementos válidos en el arreglo.
     * @param elementoAEliminar El entero a eliminar.
     * @return El nuevo tamaño del arreglo después de la eliminación. Si no se encuentra
     * el elemento, devuelve el tamaño original.
     */
    public int eliminarElemento(int[] arreglo, int tamanoActual, int elementoAEliminar) {
        int i = 0;
        boolean encontrado = false;
        
        // Búsqueda del elemento
        while (i < tamanoActual && !encontrado) {
            if (arreglo[i] == elementoAEliminar) {
                encontrado = true;
            } else {
                i++;
            }
        }

        // Si se encontró, se realiza el desplazamiento y se reduce el tamaño
        if (encontrado) {
            tamanoActual--; // Se reduce el tamaño lógico
            for (int k = i; k < tamanoActual; k++) {
                arreglo[k] = arreglo[k + 1];
            }
        }
        
        return tamanoActual;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P14_5_1_Ejemplo_4_4_Elimina_Desordenado eliminador = new P14_5_1_Ejemplo_4_4_Elimina_Desordenado();

        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Ingrese el elemento a eliminar (X): ");
        int x = sc.nextInt();

        int tamanoOriginal = n;
        int nuevoTamano = eliminador.eliminarElemento(a, tamanoOriginal, x);

        if (nuevoTamano < tamanoOriginal) {
            System.out.println("Elemento " + x + " eliminado del arreglo.");
            System.out.print("Arreglo resultante: ");
            // Imprime solo hasta el nuevo tamaño
            for (int i = 0; i < nuevoTamano; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("El elemento " + x + " no está en el arreglo.");
        }
        sc.close();
    }
}