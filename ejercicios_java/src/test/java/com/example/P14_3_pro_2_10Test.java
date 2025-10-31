package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para P14_3_pro_2_10.
 */
public class P14_3_pro_2_10Test {

    private final P14_3_pro_2_10 comparador = new P14_3_pro_2_10();

    @Test
    void testA_EsElMayor() {
        assertEquals("A es el mayor.", comparador.encontrarMayor(10, 5, 0), "A debería ser el mayor");
    }

    @Test
    void testB_EsElMayor() {
        assertEquals("B es el mayor.", comparador.encontrarMayor(5, 10, 0), "B debería ser el mayor");
    }

    @Test
    void testC_EsElMayor() {
        assertEquals("C es el mayor.", comparador.encontrarMayor(0, 5, 10), "C debería ser el mayor");
        // Prueba una rama lógica diferente que también lleva a que C sea mayor
        assertEquals("C es el mayor.", comparador.encontrarMayor(5, 5, 10), "C debería ser mayor que A y B iguales");
    }

    @Test
    void testA_y_B_SonMayores() {
        assertEquals("A y B son los mayores.", comparador.encontrarMayor(10, 10, 5), "A y B deberían ser los mayores");
    }

    @Test
    void testA_y_C_SonMayores() {
        assertEquals("A y C son los mayores.", comparador.encontrarMayor(10, 5, 10), "A y C deberían ser los mayores");
    }

    @Test
    void testB_y_C_SonMayores() {
        assertEquals("B y C son los mayores.", comparador.encontrarMayor(5, 10, 10), "B y C deberían ser los mayores");
    }

    @Test
    void testTodosSonIguales() {
        assertEquals("A, B y C son los mayores.", comparador.encontrarMayor(10, 10, 10), "A, B y C deberían ser iguales y los mayores");
    }
    
    @Test
    void testConNumerosNegativos() {
        assertEquals("C es el mayor.", comparador.encontrarMayor(-10, -5, -2), "Con negativos, -2 es el mayor");
        assertEquals("A y B son los mayores.", comparador.encontrarMayor(-1, -1, -5), "Con negativos, A y B son los mayores");
    }
}