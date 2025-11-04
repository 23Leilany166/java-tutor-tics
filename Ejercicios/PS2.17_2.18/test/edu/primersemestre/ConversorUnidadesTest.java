package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Pruebas unitarias para el conversor de unidades */
public class ConversorUnidadesTest {

    @Test
    public void testConversiones() {
        double pulg = 2.0 * 25.40; // pulgadas a mm
        double yard = 3.0 * 0.9144; // yardas a m
        double mill = 4.0 * 1.6093; // millas a km

        assertEquals(50.8, pulg, 0.0001);
        assertEquals(2.7432, yard, 0.0001);
        assertEquals(6.4372, mill, 0.0001);
    }
}
