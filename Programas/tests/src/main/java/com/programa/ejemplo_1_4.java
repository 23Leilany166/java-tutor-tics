package com.programa;

/**
 * Ejemplo 1.4 - Evaluación de Expresiones Lógicas
 * 
 * OBJETIVO:
 * Implementar la evaluación de expresiones lógicas complejas que involucran
 * operadores lógicos (Y, O, NO), operadores relacionales y operaciones aritméticas.
 * 
 * INSTRUCCIONES:
 * 1. Implementa los métodos evaluarCasoA() y evaluarCasoB() para que evalúen
 *    correctamente las expresiones dadas.
 * 2. Usa Math.pow(base, exponente) para calcular potencias
 * 3. La división entera en Java se hace automáticamente entre tipos int
 * 4. Los operadores lógicos en Java son:
 *    - Y (AND): &&
 *    - O (OR): ||
 *    - NO (NOT): !
 * 5. No modifiques los nombres ni las firmas de los métodos
 */
public class ejemplo_1_4 {
    
    /**
     * Caso A: NO(15 >= 7**2) O (43 - 8 * 2 div 4 <> 3 * 2 div 2)
     * donde:
     * - ** significa potencia (usa Math.pow)
     * - div significa división entera
     * - <> significa diferente (en Java: !=)
     * 
     * @return el resultado de evaluar la expresión
     */
    public boolean evaluarCasoA() {
        // TODO: Implementa la expresión del Caso A
        // Tip: Divide la expresión en partes más pequeñas si es necesario
        return false; // Reemplaza este return con tu implementación
    }

    /**
     * Caso B: (15 >= 7*3**2 Y 8 > 3 Y 15 > 6) O NO(7*3 < 5 + 12*2 div 3**2)
     * donde:
     * - ** significa potencia (usa Math.pow)
     * - div significa división entera
     * - Y significa AND (&&)
     * 
     * @return el resultado de evaluar la expresión
     */
    public boolean evaluarCasoB() {
        // TODO: Implementa la expresión del Caso B
        // Sugerencia: Usa variables intermedias para mayor claridad
        // Ejemplo: boolean parte1 = ..., parte2 = ...;
        return false; // Reemplaza este return con tu implementación
    }

    /**
     * Método principal para probar tus implementaciones
     */
    public static void main(String[] args) {
        ejemplo_1_4 ee = new ejemplo_1_4();
        
        System.out.println("--- Evaluación de Expresiones Lógicas (Ejemplo 1.4) ---");
        System.out.println("Caso a) Resultado: " + ee.evaluarCasoA());
        System.out.println("Caso b) Resultado: " + ee.evaluarCasoB());
        System.out.println("Nota: Para verificar si tu implementación es correcta,");
        System.out.println("      ejecuta los tests en ejemplo_1_4Test.java");
    }
}