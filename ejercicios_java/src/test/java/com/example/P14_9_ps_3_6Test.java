package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Clase de prueba para P14_9_ps_3_6.
 */
public class P14_9_ps_3_6Test {

    private final P14_9_ps_3_6 programa = new P14_9_ps_3_6();
    private final double DELTA = 0.01; // Margen de error para comparar doubles

    @Test
    void testAumentoConSueldosMixtos() {
        double[] sueldos = {500.0, 800.0, 1000.0, 799.99};
        double[] expected = {575.0, 800.0, 1000.0, 919.98}; // 500*1.15=575, 799.99*1.15=~919.98
        
        programa.aplicarAumento(sueldos);
        assertArrayEquals(expected, sueldos, DELTA, "Debería aumentar solo los sueldos menores a 800");
    }

    @Test
    void testSinAumento() {
        // Prueba el caso límite donde un sueldo es exactamente 800
        double[] sueldos = {800.0, 950.0, 1200.0};
        double[] expected = {800.0, 950.0, 1200.0}; // Ningún sueldo debe cambiar
        
        programa.aplicarAumento(sueldos);
        assertArrayEquals(expected, sueldos, DELTA, "No debería haber aumento si todos los sueldos son >= 800");
    }

    @Test
    void testAumentoParaTodos() {
        double[] sueldos = {100.0, 250.50, 700.0};
        double[] expected = {115.0, 288.08, 805.0};
        
        programa.aplicarAumento(sueldos);
        assertArrayEquals(expected, sueldos, DELTA, "Todos los sueldos deberían aumentar");
    }

    @Test
    void testArregloVacio() {
        double[] sueldos = {};
        double[] expected = {};
        
        programa.aplicarAumento(sueldos);
        assertArrayEquals(expected, sueldos, DELTA, "No debería fallar con un arreglo vacío");
    }
}