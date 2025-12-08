package com.javatutor.ps_4_4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int N;
        int[] A = new int[50];
        int[] B = new int[50];
        int[] PROD = new int[50];

        System.out.print("Ingrese el valor de N (max 50): ");
        N = leer.nextInt();

        // Leer vector A
        System.out.println("\nIngrese los valores del vector A:");
        for (int i = 1; i <= N; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = leer.nextInt();
        }

        // Leer vector B
        System.out.println("\nIngrese los valores del vector B:");
        for (int i = 1; i <= N; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = leer.nextInt();
        }

        // Calcular producto elemento a elemento
        for (int i = 1; i <= N; i++) {
            PROD[i] = A[i] * B[i];
        }

        // Imprimir resultado
        System.out.println("\nProducto de los vectores A y B:");
        for (int i = 1; i <= N; i++) {
            System.out.println("PROD[" + i + "] = " + PROD[i]);
        }
    }
}
