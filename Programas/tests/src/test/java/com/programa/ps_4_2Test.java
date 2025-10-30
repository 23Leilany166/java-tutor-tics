package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ps_4_2Test {
    
    private ps_4_2 c = new ps_4_2();
    private int[] arregloDePrueba = {5, 10, 15, 5, 20, 5, 10, 5};

    @Test
    void testContarMultiplesOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 5);
        assertEquals(4, total);
    }

    @Test
    void testContarDosOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 10);
        assertEquals(2, total);
    }

    @Test
    void testContarCeroOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 99);
        assertEquals(0, total);
    }
    
    @Test
    void testArregloVacio() {
        int[] vacio = {};
        int total = c.contarOcurrencias(vacio, 5);
        assertEquals(0, total);
    }

    @Test
    void testArregloNulo() {
        int total = c.contarOcurrencias(null, 5);
        assertEquals(0, total);
    }
}