package com.ejercicios;

import java.util.Scanner;

public class InvertirDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuatro números enteros, separados por espacio:");
        int a = scanner.nextInt(); // Leer A [cite: 708]
        int b = scanner.nextInt(); // Leer B
        int c = scanner.nextInt(); // Leer C
        int d = scanner.nextInt(); // Leer D

        System.out.println("Los números en orden inverso son:");
        System.out.println(d); // Escribir D [cite: 708]
        System.out.println(c); // Escribir C [cite: 708]
        System.out.println(b); // Escribir B [cite: 708]
        System.out.println(a); // Escribir A [cite: 708]

        // Opcional: imprimir en una sola línea
        // System.out.printf("%d, %d, %d, %d%n", d, c, b, a);

        scanner.close(); // Buena práctica cerrar el Scanner
    }
}
