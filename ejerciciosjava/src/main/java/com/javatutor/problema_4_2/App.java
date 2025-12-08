package com.javatutor.problema_4_2;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Ingresa la cantidad de elementos (1-500): ");
        N = sc.nextInt();

        int[] VEC = new int[N];
        int[] SINREP = new int[N]; // arreglo para almacenar sin repeticiones

        System.out.println("Ingresa los " + N + " valores:");

        // Lectura del arreglo
        for (int i = 0; i < N; i++) {
            VEC[i] = sc.nextInt();
        }

        int nuevoTam = 0; // tamaño del arreglo sin repetidos

        // Proceso para eliminar repetidos
        for (int i = 0; i < N; i++) {
            boolean repetido = false;

            // Buscar si ya se insertó antes
            for (int k = 0; k < nuevoTam; k++) {
                if (VEC[i] == SINREP[k]) {
                    repetido = true;
                    break;
                }
            }

            // Si no se encontró repetido, se agrega
            if (!repetido) {
                SINREP[nuevoTam] = VEC[i];
                nuevoTam++;
            }
        }

        // Mostrar resultado final
        System.out.println("Vector sin repeticiones:");

        for (int i = 0; i < nuevoTam; i++) {
            System.out.print(SINREP[i] + " ");
        }
    }
}
