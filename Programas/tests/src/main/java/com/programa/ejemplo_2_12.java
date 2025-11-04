package com.programa;

import java.util.Scanner;

/**
 * Ejemplo 2.12 - Ordenamiento de tres números en orden descendente
 * 
 * OBJETIVO:
 * Implementar un algoritmo que ordene tres números enteros en orden descendente
 * (de mayor a menor) usando estructuras de control if-else anidadas.
 * 
 * CONTEXTO:
 * Este ejercicio implementa el Diagrama de Flujo 2.15 del libro, que muestra
 * cómo ordenar tres números usando comparaciones sucesivas.
 * 
 * INSTRUCCIONES:
 * 1. Implementa el método ordenar() que recibe tres números enteros.
 * 2. Usa estructuras if-else anidadas para comparar los números.
 * 3. Retorna un String con los números ordenados, separados por ", ".
 * 4. El formato debe ser exactamente: "X, Y, Z" (con espacios después de las comas).
 * 
 * EJEMPLO:
 * Entrada: a=5, b=10, c=1
 * Salida esperada: "10, 5, 1"
 */
public class ejemplo_2_12 {

    /**
     * Ordena tres números enteros en orden descendente.
     * 
     * @param a primer número
     * @param b segundo número
     * @param c tercer número
     * @return String con los números ordenados de mayor a menor, separados por ", "
     */
    public String ordenar(int a, int b, int c) {
        // TODO: Implementa la lógica del Diagrama de Flujo 2.15
        // 
        // Pasos sugeridos:
        // 1. Compara primero a con b
        // 2. Para cada caso, compara con c
        // 3. Determina el orden final
        //
        // IMPORTANTE: El formato debe ser "X, Y, Z" (con espacios después de las comas)
        // Ejemplo: return mayor + ", " + medio + ", " + menor;
        
        return "0, 0, 0"; // Reemplaza esta línea con tu implementación
    }

    // El main te permite probar tu implementación
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_2_12 ordenador = new ejemplo_2_12();

        System.out.print("Ingrese el número A: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el número B: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el número C: ");
        int c = scanner.nextInt();

        String resultado = ordenador.ordenar(a, b, c);
        System.out.println("Orden descendente: " + resultado);
        
        scanner.close();
    }
}