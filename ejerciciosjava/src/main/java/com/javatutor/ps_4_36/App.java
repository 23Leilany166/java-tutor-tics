package com.javatutor.ps_4_36;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] PRODUCTO = new int[101];
        int[] CANTIDAD = new int[101];

        int N; // número actual de productos
        char tipo;
        int clave, cant;

        System.out.print("Ingrese el número de productos actuales (max 100): ");
        N = leer.nextInt();

        // Leer claves
        System.out.println("\nIngrese las claves de los productos:");
        for (int i = 1; i <= N; i++) {
            System.out.print("PRODUCTO[" + i + "]: ");
            PRODUCTO[i] = leer.nextInt();
        }

        // Leer cantidades
        System.out.println("\nIngrese las cantidades existentes:");
        for (int i = 1; i <= N; i++) {
            System.out.print("CANTIDAD[" + i + "]: ");
            CANTIDAD[i] = leer.nextInt();
        }

        System.out.println("\n=== Ingrese transacciones: (C ó V), Clave, Cantidad ===");
        System.out.println("Para terminar ingrese: X 0 0");

        while (true) {

            System.out.print("\nTipo de operación: ");
            tipo = leer.next().toUpperCase().charAt(0);

            System.out.print("Clave del producto: ");
            clave = leer.nextInt();

            System.out.print("Cantidad: ");
            cant = leer.nextInt();

            // Fin de datos
            if (tipo == 'X' && clave == 0 && cant == 0) {
                System.out.println("\nFin de transacciones.");
                break;
            }

            // Buscar si el producto existe
            int pos = -1;
            for (int i = 1; i <= N; i++) {
                if (PRODUCTO[i] == clave) {
                    pos = i;
                    break;
                }
            }

            // PROCESAR COMPRA
            if (tipo == 'C') {

                if (pos != -1) {
                    // Ya existe → aumentar cantidad
                    CANTIDAD[pos] += cant;
                } else {
                    // No existe → agregar si hay espacio
                    if (N < 100) {
                        N++;
                        PRODUCTO[N] = clave;
                        CANTIDAD[N] = cant;
                    } else {
                        System.out.println("No se puede agregar el producto, límite alcanzado.");
                    }
                }
            }

            // PROCESAR VENTA
            else if (tipo == 'V') {

                if (pos == -1) {
                    System.out.println("El producto no existe.");
                } else {
                    if (CANTIDAD[pos] >= cant) {
                        CANTIDAD[pos] -= cant;
                    } else {
                        System.out.println("No hay suficiente cantidad para realizar la venta.");
                    }
                }
            }

            else {
                System.out.println("Operación inválida.");
            }

        }

        // Mostrar el arreglo actualizado
        System.out.println("\n=== PRODUCTOS ACTUALIZADOS ===");
        for (int i = 1; i <= N; i++) {
            System.out.println("Clave: " + PRODUCTO[i] + "  Cantidad: " + CANTIDAD[i]);
        }

    }
}
