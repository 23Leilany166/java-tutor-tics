package edu.primersemestre;

import java.util.*;

/**
 * PS 3.31 — Primos Gemelos entre A y B
 * Dado un rango [A, B], imprime todas las parejas de números primos gemelos.
 */
public class PrimosGemelos {

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        int limite = (int)Math.sqrt(n);
        for (int d = 3; d <= limite; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa A (entero positivo): ");
        int A = sc.nextInt();
        System.out.print("Ingresa B (entero positivo): ");
        int B = sc.nextInt();

        if (A < 1 || B < 1 || A >= B) {
            System.out.println("Error: A y B deben ser positivos y A < B.");
            sc.close();
            return;
        }

        int inicio = Math.max(A, 3);
        if (inicio % 2 == 0) inicio++;

        boolean encontrado = false;
        for (int p = inicio; p <= B - 2; p += 2) {
            if (esPrimo(p) && esPrimo(p + 2) && p + 2 <= B) {
                System.out.printf("(%d, %d)%n", p, p + 2);
                encontrado = true;
            }
        }

        if (!encontrado) System.out.println("No hay primos gemelos en el rango.");
        sc.close();
    }
}
