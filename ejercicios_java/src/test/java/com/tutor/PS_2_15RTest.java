package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_2_15R.
 */
public class PS_2_15RTest { // El nombre del archivo debe ser PS_2_15RTest.java

    @Test
    void testSuma() {
        PS_2_15R ejercicio = new PS_2_15R();
        double resultado = ejercicio.calcular(20.5, 10.5, '+');
        assertEquals(31.0, resultado, 0.001, "La suma (20.5 + 10.5) debe ser 31.0");
    }

    @Test
    void testResta() {
        PS_2_15R ejercicio = new PS_2_15R();
        double resultado = ejercicio.calcular(10, 5.5, '-');
        assertEquals(4.5, resultado, 0.001, "La resta (10 - 5.5) debe ser 4.5");
    }

    @Test
    void testMultiplicacion() {
        PS_2_15R ejercicio = new PS_2_15R();
        double resultado = ejercicio.calcular(10, 0.5, '*');
        assertEquals(5.0, resultado, 0.001, "La multiplicación (10 * 0.5) debe ser 5.0");
    }

    @Test
    void testDivision() {
        PS_2_15R ejercicio = new PS_2_15R();
        double resultado = ejercicio.calcular(10, 4, '/');
        assertEquals(2.5, resultado, 0.001, "La división (10 / 4) debe ser 2.5");
    }

    @Test
    void testDivisionPorCeroLanzaExcepcion() {
        PS_2_15R ejercicio = new PS_2_15R();
        
        // Verificamos que se lance la excepción correcta al dividir por cero
        assertThrows(ArithmeticException.class, () -> {
            ejercicio.calcular(10, 0, '/');
        }, "Debe lanzarse ArithmeticException al dividir por cero");
    }

    @Test
    void testClaveInvalidaLanzaExcepcion() {
        PS_2_15R ejercicio = new PS_2_15R();
        
        // Verificamos que se lance la excepción correcta con una clave inválida
        assertThrows(IllegalArgumentException.class, () -> {
            ejercicio.calcular(10, 5, 'x');
        }, "Debe lanzarse IllegalArgumentException con una clave inválida");
    }

    @Test
    void testRestaConNegativo() {
        PS_2_15R ejercicio = new PS_2_15R();
        double resultado = ejercicio.calcular(10, -5, '-');
        assertEquals(15.0, resultado, 0.001, "La resta (10 - (-5)) debe ser 15.0");
    }
}