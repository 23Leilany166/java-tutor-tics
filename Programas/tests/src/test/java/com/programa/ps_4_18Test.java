package com.programa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class ps_4_18Test {

    private ps_4_18 mi = new ps_4_18();

    @Test
    void testIdentidadN3() {
        int[][] esperado = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        int[][] real = mi.generarIdentidad(3);
        assertArrayEquals(esperado, real);
    }

    @Test
    void testIdentidadN1() {
        int[][] esperado = {
            {1}
        };
        int[][] real = mi.generarIdentidad(1);
        assertArrayEquals(esperado, real);
    }

    @Test
    void testIdentidadN0() {
        int[][] esperado = new int[0][0];
        int[][] real = mi.generarIdentidad(0);
        assertArrayEquals(esperado, real);
    }
}