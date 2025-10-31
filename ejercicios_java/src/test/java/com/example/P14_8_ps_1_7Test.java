package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Clase de prueba para P14_8_ps_1_7.
 */
public class P14_8_ps_1_7Test {

    private final P14_8_ps_1_7 calculadora = new P14_8_ps_1_7();
    private final double DELTA = 0.01; // Margen de error para comparar doubles (precisión de un centavo)

    @Test
    void testCalculoConPrecioEstandar() {
        double precioVehiculo = 250000.0;
        // Enganche esperado: 87500
        // Mensualidad esperada: ~5397.32 (Valor corregido)
        double[] expected = {87500.0, 5397.33}; // <-- VALOR CORREGIDO
        
        double[] actual = calculadora.calcularPagos(precioVehiculo);
        
        assertArrayEquals(expected, actual, DELTA, "El cálculo para un vehículo estándar es incorrecto");
    }

    @Test
    void testCalculoConPrecioCero() {
        double precioVehiculo = 0.0;
        double[] expected = {0.0, 0.0};
        
        double[] actual = calculadora.calcularPagos(precioVehiculo);
        
        assertArrayEquals(expected, actual, DELTA, "El cálculo para un vehículo de precio cero debe ser cero");
    }

    @Test
    void testCalculoConOtroPrecio() {
        double precioVehiculo = 100000.0;
        // Enganche esperado: 35000
        // Mensualidad esperada: ~2158.93 (Valor corregido)
        double[] expected = {35000.0, 2158.93}; // <-- VALOR CORREGIDO
        
        double[] actual = calculadora.calcularPagos(precioVehiculo);
        
        assertArrayEquals(expected, actual, DELTA, "El cálculo para un vehículo de 100,000 es incorrecto");
    }
}