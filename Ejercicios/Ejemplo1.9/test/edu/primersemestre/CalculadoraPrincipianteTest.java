package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests sencillos para Ejemplo 1.9 — Java 21
 */
public class CalculadoraPrincipianteTest {

    private int cuadrado(int n) { return n * n; }
    private int cubo(int n) { return n * n * n; }

    @Test
    public void pruebaTablaEjemplo_7() {
        assertEquals(49, cuadrado(7));
        assertEquals(343, cubo(7));
    }

    @Test
    public void pruebaTablaEjemplo_15() {
        assertEquals(225, cuadrado(15));
        assertEquals(3375, cubo(15));
    }

    @Test
    public void pruebaTablaEjemplo_8() {
        assertEquals(64, cuadrado(8));
        assertEquals(512, cubo(8));
    }

    @Test
    public void pruebaTablaEjemplo_12_y_30() {
        assertEquals(144, cuadrado(12));
        assertEquals(1728, cubo(12));

        assertEquals(900, cuadrado(30));
        assertEquals(27000, cubo(30));
    }
}
