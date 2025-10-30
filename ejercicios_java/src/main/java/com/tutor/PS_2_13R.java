package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código identifica el mayor de tres números.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_2_13R { // El nombre del archivo debe ser PS_2_13R.java

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Identifica el número mayor entre A, B y C.
     * Asume que los números son diferentes.
     *
     * @param A Primer número real.
     * @param B Segundo número real.
     * @param C Tercer número real.
     * @return El número mayor de los tres.
     */
    public double encontrarMayor(double A, double B, double C) {
        double mayor;
        
        // Asumiendo que son diferentes (como decía el problema original)
        if (A > B && A > C) {
            mayor = A;
        } else if (B > C) { // Si A no es el mayor, solo comparamos B y C
            mayor = B;
        } else {
            mayor = C;
        }
        return mayor;
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PS_2_13R ejercicio = new PS_2_13R(); // Instancia de la clase

        System.out.print("Ingrese el numero A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el numero B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el numero C: ");
        double C = scanner.nextDouble();
        
        // Llamar al método de lógica
        double mayor = ejercicio.encontrarMayor(A, B, C);
        
        // Imprimir el resultado
        System.out.println("El numero mayor es: " + mayor);
        
        scanner.close();
    }
}