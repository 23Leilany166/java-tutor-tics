package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para Problema 3.2 — SerieSuma
 * Programación estructurada en Java 21.
 */
public class SerieSumaTest {

    public long calcularSumaSerie() {
        int I = 2;
        long SUMSER = 0L;
        char BAND = 'T';

        while (I <= 1800) {
            SUMSER += I;
            if (BAND == 'T') {
                BAND = 'F';
                I += 3;
            } else {
                BAND = 'T';
                I += 2;
            }
        }
        return SUMSER;
    }

    @Test
    public void testSumaPositiva() {
        assertTrue(calcularSumaSerie() > 0, "La suma debe ser positiva.");
    }

    @Test
    public void testUltimoTerminoEs1800() {
        int I = 2;
        char BAND = 'T';
        int ultimo = 0;
        while (I <= 1800) {
            ultimo = I;
            if (BAND == 'T') {
                BAND = 'F';
                I += 3;
            } else {
                BAND = 'T';
                I += 2;
            }
        }
        assertEquals(1800, ultimo);
    }
}
