package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_2_14R.
 */
public class PS_2_14RTest { // El nombre del archivo debe ser PS_2_14RTest.java

    @Test
    void testCasoModCero() {
        PS_2_14R ejercicio = new PS_2_14R();
        // x = 4 (4 % 4 = 0). Resultado = 4^2 = 16
        assertEquals(16.0, ejercicio.calcularFuncion(4), 0.001, "f(4) debe ser 16.0");
        // x = 0 (0 % 4 = 0). Resultado = 0^2 = 0
        assertEquals(0.0, ejercicio.calcularFuncion(0), 0.001, "f(0) debe ser 0.0");
    }

    @Test
    void testCasoModUno() {
        PS_2_14R ejercicio = new PS_2_14R();
        // x = 5 (5 % 4 = 1). Resultado = 5 / 6.0 = 0.833...
        assertEquals(5.0 / 6.0, ejercicio.calcularFuncion(5), 0.001, "f(5) debe ser 5/6");
        // x = 1 (1 % 4 = 1). Resultado = 1 / 6.0 = 0.166...
        assertEquals(1.0 / 6.0, ejercicio.calcularFuncion(1), 0.001, "f(1) debe ser 1/6");
    }

    @Test
    void testCasoModDos() {
        PS_2_14R ejercicio = new PS_2_14R();
        // x = 6 (6 % 4 = 2). Resultado = sqrt(6)
        assertEquals(Math.sqrt(6), ejercicio.calcularFuncion(6), 0.001, "f(6) debe ser sqrt(6)");
        // x = 2 (2 % 4 = 2). Resultado = sqrt(2)
        assertEquals(Math.sqrt(2), ejercicio.calcularFuncion(2), 0.001, "f(2) debe ser sqrt(2)");
    }

    @Test
    void testCasoModTres() {
        PS_2_14R ejercicio = new PS_2_14R();
        // x = 7 (7 % 4 = 3). Resultado = 7^3 + 5 = 343 + 5 = 348
        assertEquals(348.0, ejercicio.calcularFuncion(7), 0.001, "f(7) debe ser 348.0");
        // x = 3 (3 % 4 = 3). Resultado = 3^3 + 5 = 27 + 5 = 32
        assertEquals(32.0, ejercicio.calcularFuncion(3), 0.001, "f(3) debe ser 32.0");
    }

    @Test
    void testNumerosNegativos() {
        // Prueba el manejo de módulo negativo en Java
        PS_2_14R ejercicio = new PS_2_14R();
        
        // x = -1 (-1 % 4 = -1). Corregido a mod 3. f(-1) = (-1)^3 + 5 = -1 + 5 = 4
        assertEquals(4.0, ejercicio.calcularFuncion(-1), 0.001, "f(-1) debe ser 4.0 (mod 3)");

        // x = -2 (-2 % 4 = -2). Corregido a mod 2. f(-2) = sqrt(-2) = NaN (Not a Number)
        // Usamos assertThrows si esperamos una excepción, o assertEquals con Double.NaN si el método lo maneja
        assertEquals(Double.NaN, ejercicio.calcularFuncion(-2), 0.001, "f(-2) debe ser NaN (sqrt de negativo)");

        // x = -3 (-3 % 4 = -3). Corregido a mod 1. f(-3) = -3 / 6.0 = -0.5
        assertEquals(-0.5, ejercicio.calcularFuncion(-3), 0.001, "f(-3) debe ser -0.5 (mod 1)");

        // x = -4 (-4 % 4 = 0). f(-4) = (-4)^2 = 16
        assertEquals(16.0, ejercicio.calcularFuncion(-4), 0.001, "f(-4) debe ser 16.0 (mod 0)");
    }
}