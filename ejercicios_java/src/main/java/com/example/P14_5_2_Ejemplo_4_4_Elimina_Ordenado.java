package com.example;

import java.util.Scanner;

public class P14_5_2_Ejemplo_4_4_Elimina_Ordenado {

    /**
     * Busca y elimina un elemento en un arreglo ordenado ascendentemente.
     * La búsqueda se detiene si se pasa del valor buscado.
     *
     * @param arreglo El arreglo de enteros ordenado.
     * @param tamanoActual El número de elementos válidos en el arreglo.
     * @param elementoAEliminar El entero a eliminar.
     * @return El nuevo tamaño del arreglo después de la eliminación. Si no se encuentra
     * el elemento, devuelve el tamaño original.
     */
    public int eliminarElementoOrdenado(int[] arreglo, int tamanoActual, int elementoAEliminar) {
        if (tamanoActual <= 0) {
            return 0; // No hay nada que eliminar en un arreglo vacío
        }
        
        // 1. Buscar la posición del elemento o donde debería estar (usando 0-based indexing)
        int i = 0;
        while (i < tamanoActual && arreglo[i] < elementoAEliminar) {
            i++;
        }
        
        // 2. Verificar si el elemento fue encontrado
        if (i < tamanoActual && arreglo[i] == elementoAEliminar) {
            // 3. Desplazar los elementos para eliminar el actual
            for (int k = i; k < tamanoActual - 1; k++) {
                arreglo[k] = arreglo[k + 1];
            }
            return tamanoActual - 1; // Devolver el nuevo tamaño reducido
        } else {
            // El elemento no está en el arreglo
            return tamanoActual; // Devolver el tamaño original
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P14_5_2_Ejemplo_4_4_Elimina_Ordenado eliminador = new P14_5_2_Ejemplo_4_4_Elimina_Ordenado();

        System.out.println("Ingrese el tamaño del arreglo (M):");
        int m = sc.nextInt();
        int[] a = new int[m];

        if (m > 0) {
            System.out.println("Ingrese los " + m + " elementos del arreglo (ordenados):");
            for (int i = 0; i < m; i++) { // Usando 0-based index
                a[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a eliminar (X):");
            int x = sc.nextInt();

            int tamanoOriginal = m;
            int nuevoTamano = eliminador.eliminarElementoOrdenado(a, tamanoOriginal, x);

            if (nuevoTamano < tamanoOriginal) {
                System.out.println("Elemento eliminado del arreglo.");
                System.out.println("Arreglo resultante:");
                for (int i = 0; i < nuevoTamano; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("El elemento no existe en el arreglo.");
            }
        } else {
            System.out.println("El arreglo está vacío.");
        }
        sc.close();
    }
}