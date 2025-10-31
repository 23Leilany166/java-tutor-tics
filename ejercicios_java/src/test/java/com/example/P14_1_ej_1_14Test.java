package com.example;
// Importaciones necesarias para JUnit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para P14_1_ej_1_14.
 */
public class P14_1_ej_1_14Test {

    // Se crea una instancia de la clase que queremos probar.
    private final P14_1_ej_1_14 calculadora = new P14_1_ej_1_14();

    @Test
    void testCalcularCuadrado() {
        // Caso de prueba 1: número positivo
        assertEquals(25.0, calculadora.calcularCuadrado(5), "El cuadrado de 5 debería ser 25.0");

        // Caso de prueba 2: número cero
        assertEquals(0.0, calculadora.calcularCuadrado(0), "El cuadrado de 0 debería ser 0.0");

        // Caso de prueba 3: número negativo
        assertEquals(16.0, calculadora.calcularCuadrado(-4), "El cuadrado de -4 debería ser 16.0");
    }

    @Test
    void testCalcularCubo() {
        // Caso de prueba 1: número positivo
        assertEquals(27.0, calculadora.calcularCubo(3), "El cubo de 3 debería ser 27.0");

        // Caso de prueba 2: número cero
        assertEquals(0.0, calculadora.calcularCubo(0), "El cubo de 0 debería ser 0.0");

        // Caso de prueba 3: número negativo
        assertEquals(-8.0, calculadora.calcularCubo(-2), "El cubo de -2 debería ser -8.0");
    }
}