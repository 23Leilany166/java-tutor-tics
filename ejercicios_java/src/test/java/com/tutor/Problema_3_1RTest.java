package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Problema_3_1R.
 */
public class Problema_3_1RTest { // El nombre del archivo debe ser Problema_3_1RTest.java

    @Test
    void testCalculoMixto() {
        // 1. Preparación: Instancia de la clase y datos de entrada
        Problema_3_1R ejercicio = new Problema_3_1R();
        int[] entrada = {5, 10, 3, 8, 2}; // Impares: 5, 3 (Suma=8). Pares: 10, 8, 2 (Suma=20, Prom=20/3)
        
        // 2. Ejecución: Llamar al método lógico
        Problema_3_1R.ResultadosCalculo resultados = ejercicio.procesarNumeros(entrada);

        // 3. Verificación
        assertEquals(8, resultados.sumaImpares, "La suma de impares (5+3) debe ser 8");
        assertEquals(20.0 / 3.0, resultados.promedioPares, 0.001, "El promedio de pares (10+8+2)/3 debe ser ~6.666");
    }

    @Test
    void testSoloPares() {
        Problema_3_1R ejercicio = new Problema_3_1R();
        int[] entrada = {2, 4, 10, 20}; // Impares: (Suma=0). Pares: 2, 4, 10, 20 (Suma=36, Prom=36/4=9)

        Problema_3_1R.ResultadosCalculo resultados = ejercicio.procesarNumeros(entrada);

        assertEquals(0, resultados.sumaImpares, "La suma de impares debe ser 0 si no hay impares");
        assertEquals(9.0, resultados.promedioPares, 0.001, "El promedio de pares (2+4+10+20)/4 debe ser 9.0");
    }

    @Test
    void testSoloImpares() {
        Problema_3_1R ejercicio = new Problema_3_1R();
        int[] entrada = {1, 3, 5, 7}; // Impares: 1, 3, 5, 7 (Suma=16). Pares: (Prom=0)

        Problema_3_1R.ResultadosCalculo resultados = ejercicio.procesarNumeros(entrada);

        assertEquals(16, resultados.sumaImpares, "La suma de impares (1+3+5+7) debe ser 16");
        assertEquals(0.0, resultados.promedioPares, 0.001, "El promedio de pares debe ser 0.0 si no hay pares (manejo de división por cero)");
    }

    @Test
    void testArregloVacio() {
        Problema_3_1R ejercicio = new Problema_3_1R();
        int[] entrada = {}; // Arreglo vacío

        Problema_3_1R.ResultadosCalculo resultados = ejercicio.procesarNumeros(entrada);

        assertEquals(0, resultados.sumaImpares, "La suma de impares debe ser 0 para un arreglo vacío");
        assertEquals(0.0, resultados.promedioPares, 0.001, "El promedio de pares debe ser 0.0 para un arreglo vacío");
    }

    @Test
    void testConCeros() {
        Problema_3_1R ejercicio = new Problema_3_1R();
        int[] entrada = {0, 3, 0, 5}; // El 0 es considerado par
        // Impares: 3, 5 (Suma=8). Pares: 0, 0 (Suma=0, Prom=0/2=0)

        Problema_3_1R.ResultadosCalculo resultados = ejercicio.procesarNumeros(entrada);

        assertEquals(8, resultados.sumaImpares, "La suma de impares (3+5) debe ser 8");
        assertEquals(0.0, resultados.promedioPares, 0.001, "El promedio de pares (0+0)/2 debe ser 0.0");
    }
}