package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Problema_4_17R.
 */
public class Problema_4_17RTest { // El nombre del archivo debe ser Problema_4_17RTest.java

    // Prueba para la lógica principal de transposición
    @Test
    void testCalcularTranspuesta() {
        // 1. Preparación
        Problema_4_17R ejercicio = new Problema_4_17R();
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        }; // Una matriz de 2x3
        
        int[][] matrizEsperada = {
            {1, 4},
            {2, 5},
            {3, 6}
        }; // La transpuesta esperada de 3x2
        
        // 2. Ejecución
        int[][] resultado = ejercicio.calcularTranspuesta(matrizOriginal);
        
        // 3. Verificación
        // assertArrayEquals funciona para arreglos multidimensionales en JUnit 5
        assertArrayEquals(matrizEsperada, resultado, "La matriz transpuesta no es correcta");
    }

    // Prueba con una matriz cuadrada
    @Test
    void testTranspuestaMatrizCuadrada() {
        Problema_4_17R ejercicio = new Problema_4_17R();
        int[][] matrizOriginal = {
            {1, 2},
            {3, 4}
        }; // Matriz 2x2
        
        int[][] matrizEsperada = {
            {1, 3},
            {2, 4}
        }; // Transpuesta 2x2
        
        int[][] resultado = ejercicio.calcularTranspuesta(matrizOriginal);
        
        assertArrayEquals(matrizEsperada, resultado, "La transpuesta de una matriz cuadrada falló");
    }

    // Prueba con una matriz de una sola fila (vector fila)
    @Test
    void testTranspuestaVectorFila() {
        Problema_4_17R ejercicio = new Problema_4_17R();
        int[][] matrizOriginal = {
            {10, 20, 30}
        }; // Matriz 1x3
        
        int[][] matrizEsperada = {
            {10},
            {20},
            {30}
        }; // Transpuesta 3x1 (vector columna)
        
        int[][] resultado = ejercicio.calcularTranspuesta(matrizOriginal);
        
        assertArrayEquals(matrizEsperada, resultado, "La transpuesta de un vector fila falló");
    }

    // Pruebas para la validación de dimensiones
    @Test
    void testValidarDimensionesCorrectas() {
        Problema_4_17R ejercicio = new Problema_4_17R();
        assertTrue(ejercicio.validarDimensiones(1, 1), "Dimensiones mínimas (1,1) deben ser válidas");
        assertTrue(ejercicio.validarDimensiones(50, 30), "Dimensiones máximas (50,30) deben ser válidas");
        assertTrue(ejercicio.validarDimensiones(25, 15), "Dimensiones intermedias deben ser válidas");
    }

    @Test
    void testValidarDimensionesIncorrectas() {
        Problema_4_17R ejercicio = new Problema_4_17R();
        assertFalse(ejercicio.validarDimensiones(0, 5), "Filas (M) no pueden ser 0");
        assertFalse(ejercicio.validarDimensiones(5, 0), "Columnas (N) no pueden ser 0");
        assertFalse(ejercicio.validarDimensiones(51, 10), "Filas (M) no pueden ser > 50");
        assertFalse(ejercicio.validarDimensiones(10, 31), "Columnas (N) no pueden ser > 30");
    }
}