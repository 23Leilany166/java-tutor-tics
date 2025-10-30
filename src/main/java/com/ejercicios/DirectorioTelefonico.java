package com.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class DirectorioTelefonico {
    static final int MAX_CONTACTOS = 1000; // Límite máximo de contactos
    static String[] nombres = new String[MAX_CONTACTOS]; // Nombres de los contactos
    static String[] telefonos = new String[MAX_CONTACTOS]; // Teléfonos correspondientes
    static int contador = 0; // Número actual de contactos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Opcional: Cargar datos iniciales ordenados aquí
        // contador = ...;

        String nombreBuscado;
        System.out.println("Directorio Telefónico (ingrese 'salir' para terminar)");

        while (true) {
            System.out.print("\nIngrese nombre a buscar o agregar: ");
            nombreBuscado = scanner.nextLine();

            if (nombreBuscado.equalsIgnoreCase("salir")) {
                break;
            }

            // Búsqueda Binaria
            // Arrays.binarySearch requiere que el array esté ordenado y busca en el rango
            // [0, contador)
            int indice = Arrays.binarySearch(nombres, 0, contador, nombreBuscado);

            if (indice >= 0) { // Encontrado
                System.out.println("Teléfono de " + nombres[indice] + ": " + telefonos[indice]);
            } else { // No encontrado
                System.out.println(nombreBuscado + " no encontrado.");
                if (contador < MAX_CONTACTOS) { // Hay espacio
                    System.out.print("Ingrese el teléfono para " + nombreBuscado + ": ");
                    String nuevoTelefono = scanner.nextLine();

                    // Calcular posición de inserción
                    int posInsercion = -(indice + 1);

                    // Desplazar elementos para hacer espacio
                    // Mover desde el final hacia atrás hasta la posición de inserción
                    for (int i = contador; i > posInsercion; i--) {
                        nombres[i] = nombres[i - 1];
                        telefonos[i] = telefonos[i - 1];
                    }

                    // Insertar nuevo contacto
                    nombres[posInsercion] = nombreBuscado;
                    telefonos[posInsercion] = nuevoTelefono;
                    contador++; // Incrementar contador

                    System.out.println(nombreBuscado + " agregado al directorio.");

                } else { // No hay espacio
                    System.out.println("Directorio lleno, no se puede agregar.");
                }
            }

            // Opcional: Imprimir directorio actual para verificar orden
            // System.out.println("Directorio actual (" + contador + "):");
            // for (int i = 0; i < contador; i++) System.out.println(nombres[i] + ": " +
            // telefonos[i]);
        }

        System.out.println("Saliendo del directorio.");
        scanner.close();
    }
}
