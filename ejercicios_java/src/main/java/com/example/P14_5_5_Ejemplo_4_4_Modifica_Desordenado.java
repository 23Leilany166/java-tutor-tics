package com.example;

import java.util.Scanner;

public class P14_5_5_Ejemplo_4_4_Modifica_Desordenado {

    /**
     * Busca la primera ocurrencia de un valor y lo reemplaza por uno nuevo.
     *
     * @param arreglo El arreglo desordenado a modificar.
     * @param tamanoActual El número de elementos válidos en el arreglo.
     * @param valorAntiguo El valor a buscar para ser reemplazado.
     * @param valorNuevo El nuevo valor que reemplazará al antiguo.
     * @return `true` si la modificación fue exitosa, `false` si el valor antiguo no se encontró.
     */
    public boolean modificarElemento(int[] arreglo, int tamanoActual, int valorAntiguo, int valorNuevo) {
        int i = 0;
        boolean encontrado = false;
        
        // Búsqueda del elemento a modificar
        while (i < tamanoActual && !encontrado) {
            if (arreglo[i] == valorAntiguo) {
                arreglo[i] = valorNuevo; // Se realiza la modificación
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P14_5_5_Ejemplo_4_4_Modifica_Desordenado modificador = new P14_5_5_Ejemplo_4_4_Modifica_Desordenado();
        
        int[] a = new int[100];

        System.out.println("Ingrese el tamaño del arreglo (N):");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Ingrese los " + n + " elementos del arreglo:");
            for (int i = 0; i < n; i++) { // Usando 0-based index
                a[i] = sc.nextInt();
            }

            System.out.println("Ingrese el elemento a modificar (X):");
            int x = sc.nextInt();
            
            System.out.println("Ingrese el nuevo valor (Y):");
            int y = sc.nextInt();

            boolean modificado = modificador.modificarElemento(a, n, x, y);

            if (modificado) {
                System.out.println("Arreglo modificado:");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("El elemento " + x + " no está en el arreglo.");
            }
        } else {
            System.out.println("El arreglo está vacío.");
        }
        sc.close();
    }
}