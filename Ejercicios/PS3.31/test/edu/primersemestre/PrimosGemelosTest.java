package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimosGemelosTest {

    @Test
    public void testEsPrimo() {
        assertTrue(PrimosGemelos.esPrimo(3));
        assertTrue(PrimosGemelos.esPrimo(5));
        assertFalse(PrimosGemelos.esPrimo(4));
        assertTrue(PrimosGemelos.esPrimo(13));
        assertFalse(PrimosGemelos.esPrimo(1));
    }
}
