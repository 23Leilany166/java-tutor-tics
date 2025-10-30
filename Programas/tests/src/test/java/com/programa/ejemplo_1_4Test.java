package com.programa;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ejemplo_1_4Test {

    private ejemplo_1_4 ee = new ejemplo_1_4();

    @Test
    void testCasoA() {
        // Esperado: FALSO O VERDADERO -> VERDADERO
        assertTrue(ee.evaluarCasoA());
    }

    @Test
    void testCasoB() {
        // Esperado: FALSO O VERDADERO -> VERDADERO
        assertTrue(ee.evaluarCasoB());
    }
}