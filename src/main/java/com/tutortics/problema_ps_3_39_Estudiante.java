package com.tutortics;

/**
 * Ejercicio PS 3.39 - Función Matemática Compleja
 * 
 * INSTRUCCIONES PARA EL ESTUDIANTE:
 * Complete los métodos marcados con // TODO
 * 
 * La función F(X,Y,Z) tiene tres condiciones:
 * 1. Si X > 0, Y > 0 y Z > 0: F = Z! / Y!
 * 2. Si solo X > 0: F = X! (producto de i=1 hasta X)
 * 3. En cualquier otro caso: F = 1
 */
public class problema_ps_3_39_Estudiante {

    /**
     * TODO: Implementa el cálculo del factorial.
     * 
     * PISTA:
     * - Si n es 0 o 1, retorna 1
     * - Si n es negativo, retorna 0
     * - Usa un ciclo for desde i=2 hasta n
     * - Multiplica resultado *= i en cada iteración
     * 
     * @param n El número del cual se calculará el factorial
     * @return El factorial de n
     */
    public static long factorial(int n) {
        // TODO: Completa este método
        // Casos base:
        // - Si n < 0, retorna 0
        // - Si n == 0 o n == 1, retorna 1
        // Ciclo:
        // - Declara long resultado = 1
        // - for (int i = 2; i <= n; i++)
        //   - resultado *= i
        // - Retorna resultado
        
        return 0; // Reemplaza esta línea con tu implementación
    }

    /**
     * TODO: Implementa el cálculo de F(X,Y,Z) según las tres condiciones.
     * 
     * PISTA:
     * - Evalúa primero la condición más específica: x > 0 && y > 0 && z > 0
     *   Si se cumple: retorna (double) factorial(z) / factorial(y)
     * - Luego evalúa: x > 0
     *   Si se cumple: retorna (double) factorial(x)
     * - De lo contrario: retorna 1.0
     * 
     * @param x Primera variable
     * @param y Segunda variable
     * @param z Tercera variable
     * @return El resultado de F(X,Y,Z)
     */
    public static double calcularF(int x, int y, int z) {
        // TODO: Completa este método con la estructura if-else
        // Condición 1: if (x > 0 && y > 0 && z > 0)
        //     return (double) factorial(z) / factorial(y);
        // Condición 2: else if (x > 0)
        //     return (double) factorial(x);
        // Condición 3: else
        //     return 1.0;
        
        return 0.0; // Reemplaza esta línea con tu implementación
    }

    public static void main(String[] args) {
        // Prueba tu implementación con estos casos:
        System.out.println("=== Pruebas de F(X,Y,Z) ===\n");
        
        // Caso 1: X > 0, Y > 0, Z > 0
        System.out.println("Caso 1: F(5, 3, 6) = " + calcularF(5, 3, 6));
        System.out.println("Esperado: 120.0\n");
        
        // Caso 2: Solo X > 0
        System.out.println("Caso 2: F(4, 0, 0) = " + calcularF(4, 0, 0));
        System.out.println("Esperado: 24.0\n");
        
        // Caso 3: Otro caso
        System.out.println("Caso 3: F(0, 5, 3) = " + calcularF(0, 5, 3));
        System.out.println("Esperado: 1.0\n");
        
        // Caso 4: Negativos
        System.out.println("Caso 4: F(-2, 3, 4) = " + calcularF(-2, 3, 4));
        System.out.println("Esperado: 1.0\n");
    }
}
