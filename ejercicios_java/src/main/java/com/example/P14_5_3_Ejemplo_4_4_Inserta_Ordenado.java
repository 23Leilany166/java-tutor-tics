package com.example;

import java.util.Scanner;

public class P14_5_3_Ejemplo_4_4_Inserta_Ordenado {

    /**
     * Inserta un elemento en un arreglo ordenado si no existe previamente y hay espacio.
     *
     * @param arreglo El arreglo ordenado donde se insertará el elemento.
     * @param tamanoActual El número de elementos válidos en el arreglo.
     * @param elementoAInsertar El entero a insertar.
     * @return El nuevo tamaño del arreglo. Será (tamanoActual + 1) si la inserción fue exitosa,
     * o el tamaño original si el arreglo está lleno o el elemento ya existe.
     */
    public int insertarElementoOrdenado(int[] arreglo, int tamanoActual, int elementoAInsertar) {
        // 1. Verificar si hay espacio en el arreglo
        if (tamanoActual >= arreglo.length) {
            return tamanoActual; // No hay espacio, no se puede insertar
        }

        // 2. Encontrar la posición donde debería ir el elemento
        int pos = 0;
        while (pos < tamanoActual && arreglo[pos] < elementoAInsertar) {
            pos++;
        }

        // 3. Verificar si el elemento ya existe en esa posición
        if (pos < tamanoActual && arreglo[pos] == elementoAInsertar) {
            return tamanoActual; // El elemento ya existe, no se inserta
        }

        // 4. Desplazar los elementos para hacer espacio
        for (int i = tamanoActual; i > pos; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        // 5. Insertar el nuevo elemento y devolver el nuevo tamaño
        arreglo[pos] = elementoAInsertar;
        return tamanoActual + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P14_5_3_Ejemplo_4_4_Inserta_Ordenado insertador = new P14_5_3_Ejemplo_4_4_Inserta_Ordenado();

        int[] a = new int[100]; // Capacidad máxima

        System.out.println("Ingrese la cantidad de elementos iniciales (N < 100):");
        int n = sc.nextInt();

        if (n < 100) {
            System.out.println("Ingrese los " + n + " elementos del arreglo (ordenados):");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a insertar (X):");
            int x = sc.nextInt();
            
            int tamanoOriginal = n;
            int nuevoTamano = insertador.insertarElementoOrdenado(a, tamanoOriginal, x);

            if (nuevoTamano > tamanoOriginal) {
                System.out.println("Elemento insertado exitosamente.");
                System.out.println("Arreglo resultante:");
                for (int i = 0; i < nuevoTamano; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                // Esta condición cubre tanto el caso de "elemento ya existe" como "no hay espacio"
                System.out.println("No se pudo insertar el elemento (ya existe o no hay espacio).");
            }
        } else {
            System.out.println("El arreglo ya está lleno.");
        }
        sc.close();
    }
}