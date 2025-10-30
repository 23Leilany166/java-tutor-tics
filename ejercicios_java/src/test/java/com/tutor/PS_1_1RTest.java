package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_1_1R.
 */
public class PS_1_1RTest { // El nombre del archivo debe ser PS_1_1RTest.java

    @Test
    void testNumerosPositivos() {
        // 1. Preparación
        PS_1_1R ejercicio = new PS_1_1R();
        
        // 2. Ejecución
        PS_1_1R.ResultadosOperaciones resultados = ejercicio.realizarOperaciones(10.0, 5.0);
        
        // 3. Verificación
        assertEquals(15.0, resultados.suma, 0.001, "La suma (10+5) debe ser 15.0");
        assertEquals(5.0, resultados.resta, 0.001, "La resta (10-5) debe ser 5.0");
        assertEquals(50.0, resultados.multiplicacion, 0.001, "La multiplicación (10*5) debe ser 50.0");
    }

    @Test
    void testConNegativo() {
        PS_1_1R ejercicio = new PS_1_1R();
        PS_1_1R.ResultadosOperaciones resultados = ejercicio.realizarOperaciones(10.0, -5.0);
        
        assertEquals(5.0, resultados.suma, 0.001, "La suma (10 + -5) debe ser 5.0");
        assertEquals(15.0, resultados.resta, 0.001, "La resta (10 - -5) debe ser 15.0");
        assertEquals(-50.0, resultados.multiplicacion, 0.001, "La multiplicación (10 * -5) debe ser -50.0");
    }

    @Test
    void testConCero() {
        PS_1_1R ejercicio = new PS_1_1R();
        PS_1_1R.ResultadosOperaciones resultados = ejercicio.realizarOperaciones(7.5, 0.0);
        
        assertEquals(7.5, resultados.suma, 0.001, "La suma (7.5 + 0) debe ser 7.5");
        assertEquals(7.5, resultados.resta, 0.001, "La resta (7.5 - 0) debe ser 7.5");
        assertEquals(0.0, resultados.multiplicacion, 0.001, "La multiplicación (7.5 * 0) debe ser 0.0");
    }

    @Test
    void testConDecimales() {
        PS_1_1R ejercicio = new PS_1_1R();
        PS_1_1R.ResultadosOperaciones resultados = ejercicio.realizarOperaciones(0.5, 0.5);
        
        assertEquals(1.0, resultados.suma, 0.001, "La suma (0.5 + 0.5) debe ser 1.0");
        assertEquals(0.0, resultados.resta, 0.001, "La resta (0.5 - 0.5) debe ser 0.0");
        assertEquals(0.25, resultados.multiplicacion, 0.001, "La multiplicación (0.5 * 0.5) debe ser 0.25");
    }
}