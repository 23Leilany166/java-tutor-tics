package com.ejercicios;

import java.util.Scanner;

public class ContarCeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números va a ingresar? ");
        int n = scanner.nextInt(); // Leer N

        int cuecer = 0; // Inicializar contador

        System.out.println("Ingrese los " + n + " números:");
        for (int i = 1; i <= n; i++) { // Bucle de 1 a N
            int num = scanner.nextInt(); // Leer NUM
            if (num == 0) { // Si NUM es 0
                cuecer++; // Incrementar contador
            }
        }

        System.out.println("Cantidad de ceros ingresados: " + cuecer); // Imprimir resultado

        scanner.close();
    }
}