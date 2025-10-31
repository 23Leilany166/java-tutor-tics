package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Clase de prueba para P14_6_pro_4_8.
 */
public class P14_6_pro_4_8Test {

    private final P14_6_pro_4_8 programa = new P14_6_pro_4_8();
    private final double DELTA = 0.001; // Un pequeño margen de error para comparar doubles

    @Test
    void testMezclaDeCalificaciones() {
        int[] calificaciones = {10, 9, 7, 6, 5}; // 5 alumnos
        // Esperado: Prom=7.4, Aprob=3, Reprob=2, %A=60, %R=40, >8=2
        double[] expected = {7.4, 3.0, 2.0, 60.0, 40.0, 2.0};
        double[] actual = programa.calcularEstadisticas(calificaciones);
        assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    void testTodosAprobados() {
        int[] calificaciones = {7, 8, 9, 10}; // 4 alumnos
        // Esperado: Prom=8.5, Aprob=4, Reprob=0, %A=100, %R=0, >8=2
        double[] expected = {8.5, 4.0, 0.0, 100.0, 0.0, 2.0};
        double[] actual = programa.calcularEstadisticas(calificaciones);
        assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    void testTodosReprobados() {
        int[] calificaciones = {4, 5, 6}; // 3 alumnos
        // Esperado: Prom=5.0, Aprob=0, Reprob=3, %A=0, %R=100, >8=0
        double[] expected = {5.0, 0.0, 3.0, 0.0, 100.0, 0.0};
        double[] actual = programa.calcularEstadisticas(calificaciones);
        assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    void testValoresLimite() {
        // Prueba los límites >6 y >8
        int[] calificaciones = {6, 7, 8, 9}; // 4 alumnos
        // Esperado: Prom=7.5, Aprob=3, Reprob=1, %A=75, %R=25, >8=1
        double[] expected = {7.5, 3.0, 1.0, 75.0, 25.0, 1.0};
        double[] actual = programa.calcularEstadisticas(calificaciones);
        assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    void testSinCalificaciones() {
        int[] calificaciones = {};
        // Esperado: todo en ceros
        double[] expected = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double[] actual = programa.calcularEstadisticas(calificaciones);
        assertArrayEquals(expected, actual, DELTA);
    }
}