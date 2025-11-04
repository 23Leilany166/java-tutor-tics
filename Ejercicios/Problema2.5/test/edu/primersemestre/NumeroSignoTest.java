package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para Problema 2.5 — Determinar signo del número.
 * Programación estructurada — Java 21.
 */
public class NumeroSignoTest {

    public String determinarSigno(int num) {
        if (num > 0) {
            return "POSITIVO";
        } else if (num == 0) {
            return "NULO";
        } else {
            return "NEGATIVO";
        }
    }

    @Test
    public void pruebaPositivos() {
        assertEquals("POSITIVO", determinarSigno(5));
        assertEquals("POSITIVO", determinarSigno(2));
    }

    @Test
    public void pruebaNulo() {
        assertEquals("NULO", determinarSigno(0));
    }

    @Test
    public void pruebaNegativos() {
        assertEquals("NEGATIVO", determinarSigno(-7));
        assertEquals("NEGATIVO", determinarSigno(-15));
    }
}
