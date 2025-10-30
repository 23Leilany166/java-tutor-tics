package com.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// Asumiendo que PS_4_14 está en el package correcto
// import c.PS_4_14.PS_4_14;

public class PS_4_14Test {

    @Test
    public void testEsBisiesto() {
        // Divisible por 400
        assertTrue(PS_4_14.esBisiesto(2000));
        // Divisible por 4, no por 100
        assertTrue(PS_4_14.esBisiesto(2020));
        // Divisible por 100, no por 400
        assertFalse(PS_4_14.esBisiesto(1900));
        // No divisible por 4
        assertFalse(PS_4_14.esBisiesto(2021));
    }

    @Test
    public void testEsPerfecto() {
        // 6 = 1 + 2 + 3
        assertTrue(PS_4_14.esPerfecto(6));
        // 28 = 1 + 2 + 4 + 7 + 14
        assertTrue(PS_4_14.esPerfecto(28));
        // No es perfecto
        assertFalse(PS_4_14.esPerfecto(10));
        // Número primo no puede ser perfecto
        assertFalse(PS_4_14.esPerfecto(7));
    }
}