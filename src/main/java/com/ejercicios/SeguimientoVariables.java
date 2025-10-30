package com.ejercicios;

import java.lang.Math; // Necesario para Math.pow

public class SeguimientoVariables {
    public static void main(String[] args) {
        int i = 0, acum = 0, j = 0; // int para enteros
        double rea = 0.0, sum = 0.0; // double para reales
        char car = ' '; // char para caracter
        boolean band = false; // boolean para lógico

        System.out.println("--- Seguimiento de Variables ---");

        // 1. i = 0 (ya inicializado)
        System.out.println("Paso 1: i = " + i);

        // 2. i = i + 1
        i = i + 1;
        System.out.println("Paso 2: i = " + i);

        // 3. acum = 0 (ya inicializado)
        System.out.println("Paso 3: acum = " + acum);

        // 4. j = 5^2 / 3 (División entera en Java para int)
        j = (int) Math.pow(5, 2) / 3; // O j = (5 * 5) / 3;
        System.out.println("Paso 4: j = " + j + " (resultado de 25 / 3 división entera)");

        // 5. car = 'a'
        car = 'a';
        System.out.println("Paso 5: car = " + car);

        // 6. acum = j / i
        if (i != 0) { // Evitar división por cero
            acum = j / i; // División entera
            System.out.println("Paso 6: acum = " + acum + " (resultado de " + j + " / " + i + ")");
        } else {
            System.out.println("Paso 6: Error - División por cero.");
        }

        // 7. rea = acum / 3.0 (Usar 3.0 para asegurar división flotante)
        rea = acum / 3.0;
        System.out.println("Paso 7: rea = " + rea + " (resultado de " + acum + " / 3.0)");

        // 8. band = (8 > 5) && (15 < Math.pow(2, 3))
        // Math.pow(2, 3) es 8.0. La condición es (true && (15 < 8.0)) -> (true &&
        // false) -> false
        band = (8 > 5) && (15 < Math.pow(2, 3));
        System.out.println("Paso 8: band = " + band);

        // 9. sum = acum * 5.0 / Math.pow(j, 2) (Usar 5.0 para asegurar division
        // flotante)
        if (j != 0) {
            sum = acum * 5.0 / Math.pow(j, 2);
            System.out.println("Paso 9: sum = " + sum + " (resultado de " + acum + " * 5.0 / " + Math.pow(j, 2) + ")");
        } else {
            System.out.println("Paso 9: Error - División por cero (j=0).");
        }

        // 10. i = i * 3
        i = i * 3;
        System.out.println("Paso 10: i = " + i);

        // 11. rea = rea / 5.0
        rea = rea / 5.0;
        System.out.println("Paso 11: rea = " + rea);

        // 12. band = band || (i == j)
        band = band || (i == j);
        System.out.println("Paso 12: band = " + band + " (evaluando " + (band) + " || (" + i + " == " + j + "))");

        // 13. i = rea; // Error de tipo: double no puede asignarse a int sin cast
        System.out.println("Paso 13: Causa error de compilación (asignar double a int). Valor de rea: " + rea);
        // int i_cast = (int) rea; // Así funcionaría (con posible pérdida de precisión)
        // System.out.println("Paso 13 (con cast): i_cast = " + i_cast);

        // 14. car = j; // Error de tipo: int no puede asignarse a char sin cast
        System.out.println("Paso 14: Causa error de compilación (asignar int a char). Valor de j: " + j);
        // char car_cast = (char) j; // Así funcionaría (convierte el valor numérico a
        // un char)
        // System.out.println("Paso 14 (con cast): car_cast = " + car_cast + " (char con
        // valor ASCII " + j + ")");

        System.out.println("\n--- Valores finales ---");
        System.out.println("i: " + i);
        System.out.println("acum: " + acum);
        System.out.println("j: " + j);
        System.out.println("rea: " + rea);
        System.out.println("sum: " + sum);
        System.out.println("car: " + car);
        System.out.println("band: " + band);
    }
}