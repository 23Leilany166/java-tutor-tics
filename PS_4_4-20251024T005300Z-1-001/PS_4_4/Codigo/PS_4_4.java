/*
Dados dos vectores de tipo entero A y B, construya un diagrama de flujo que cal-
cule el producto de dichos vectores.
Datos: A[1..N], B[1..N] (arreglos unidimensionales de tipo entero, 1 < N< 50).
 */
package ps_4_4;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_4_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        System.out.println("Ingrese los elementos del vector A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del vector B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            B[i] = scanner.nextInt();
        }

        int producto = calcularProducto(A, B, N);

        System.out.println("El producto de los vectores es: " + producto);
    }

    public static int calcularProducto(int[] A, int[] B, int N) {
        int producto = 0;

        for (int i = 0; i < N; i++) {
            producto += A[i] * B[i];
        }

        return producto;
    }    
}