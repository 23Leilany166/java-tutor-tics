package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_2_13R.
 */
public class PS_2_13RTest { // El nombre del archivo debe ser PS_2_13RTest.java

    @Test
    void testAMayor() {
        // 1. Preparación
        PS_2_13R ejercicio = new PS_2_13R();
        
        // 2. Ejecución
        double resultado = ejercicio.encontrarMayor(100.5, 50.1, 10.9);
        
        // 3. Verificación
        assertEquals(100.5, resultado, "A (100.5) debe ser el mayor");
    }

    @Test
    void testBMayor() {
        PS_2_13R ejercicio = new PS_2_13R();
        double resultado = ejercicio.encontrarMayor(50.1, 100.5, 10.9);
        assertEquals(100.5, resultado, "B (100.5) debe ser el mayor");
    }

    @Test
    void testCMayor() {
        PS_2_13R ejercicio = new PS_2_13R();
        double resultado = ejercicio.encontrarMayor(10.9, 50.1, 100.5);
        assertEquals(100.5, resultado, "C (100.5) debe ser el mayor");
    }

    @Test
    void testConNegativos() {
        PS_2_13R ejercicio = new PS_2_13R();
        double resultado = ejercicio.encontrarMayor(-10.0, -5.0, -1.0);
        assertEquals(-1.0, resultado, "C (-1.0) debe ser el mayor entre negativos");
    }

    @Test
    void testConMixtos() {
        PS_2_13R ejercicio = new PS_2_13R();
        double resultado = ejercicio.encontrarMayor(5.0, -10.0, 2.5);
        assertEquals(5.0, resultado, "A (5.0) debe ser el mayor entre números mixtos");
    }

    @Test
    void testBMayorQueCYAMenor() {
        // Caso específico donde A no es el mayor, para probar el 'else if (B > C)'
        PS_2_13R ejercicio = new PS_2_13R();
        double resultado = ejercicio.encontrarMayor(1.0, 10.0, 5.0);
        assertEquals(10.0, resultado, "B (10.0) debe ser el mayor");
    }
}