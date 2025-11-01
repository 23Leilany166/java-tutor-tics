package edu.primersemestre;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * PS 4.10 — Esqueleto para práctica
 * Inserta y elimina elementos en un arreglo unidimensional de enteros que está ORDENADO.
 * Dato: ARRE[1..N] (1 ≤ N ≤ 100). Usaremos índices 0..N-1 en Java.
 *
 * Requisitos mínimos:
 *  - Insertar un número manteniendo el orden ascendente.
 *  - Eliminar por valor (primera ocurrencia).
 *  - Mostrar el arreglo.
 */
public class Ps410 {

    /** Inserta x en a[0..n-1] manteniendo orden ascendente y devuelve el NUEVO tamaño. */
    public static int insertarOrdenado(int[] a, int n, int x) {
        // TODO: si n == a.length -> no insertar. Encontrar posición, desplazar y colocar x.
        return n; // temporal
    }

    /** Elimina la primera ocurrencia de x en a[0..n-1]; devuelve el NUEVO tamaño. */
    public static int eliminarValor(int[] a, int n, int x) {
        // TODO: buscar x; si existe, desplazar a la izquierda desde su posición.
        return n; // temporal
    }

    /** Muestra a[0..n-1]. */
    public static void mostrar(int[] a, int n) {
        // TODO: imprimir con Arrays.copyOfRange(a,0,n)
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 4.10 ==");
        System.out.print("N (1..100): ");
        int N = 0; // TODO: leer y validar
        // N = sc.nextInt();
        // if (N < 1 || N > 100) { System.out.println("Error en N"); sc.close(); return; }

        int[] arre = new int[100];
        // TODO: leer N enteros YA ORDENADOS ascendente en arre[0..N-1]

        int opcion;
        do {
            System.out.println("\n1) Insertar  2) Eliminar  3) Mostrar  4) Salir");
            System.out.print("Opción: ");
            opcion = 4; // TODO: sc.nextInt()
            switch (opcion) {
                case 1 -> {
                    // TODO: leer x y N = insertarOrdenado(arre, N, x);
                }
                case 2 -> {
                    // TODO: leer x y N = eliminarValor(arre, N, x);
                }
                case 3 -> {
                    // TODO: mostrar(arre, N);
                }
                case 4 -> System.out.println("Fin.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
