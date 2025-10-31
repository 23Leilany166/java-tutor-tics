package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Clase de prueba para P14_4_pro_3_7.
 */
public class P14_4_pro_3_7Test {

    private final P14_4_pro_3_7 clasificador = new P14_4_pro_3_7();

    @Test
    void testMezclaDeVentas() {
        double[] ventas = {150.0, 200.0, 250.5, 399.99, 400.0, 1000.0, 50.0};
        // Esperado: 3 chicas (150, 200, 50), 2 medianas (250.5, 399.99), 2 grandes (400, 1000)
        int[] expected = {3, 2, 2};
        assertArrayEquals(expected, clasificador.clasificarVentas(ventas), "Debería clasificar correctamente una mezcla de ventas");
    }

    @Test
    void testValoresLimite() {
        // Límite chica <= 200
        // Límite mediana < 400
        // Límite grande >= 400
        double[] ventas = {200.0, 200.01, 399.99, 400.0};
        // Esperado: 1 chica (200.0), 2 medianas (200.01, 399.99), 1 grande (400.0)
        int[] expected = {1, 2, 1};
        assertArrayEquals(expected, clasificador.clasificarVentas(ventas), "Debería clasificar correctamente los valores límite");
    }

    @Test
    void testSoloVentasMedianas() {
        double[] ventas = {201.0, 350.0, 399.0};
        int[] expected = {0, 3, 0};
        assertArrayEquals(expected, clasificador.clasificarVentas(ventas), "Debería manejar correctamente solo ventas medianas");
    }

    @Test
    void testSinVentas() {
        double[] ventas = {}; // Arreglo vacío
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, clasificador.clasificarVentas(ventas), "Debería devolver [0,0,0] para una lista vacía de ventas");
    }
}