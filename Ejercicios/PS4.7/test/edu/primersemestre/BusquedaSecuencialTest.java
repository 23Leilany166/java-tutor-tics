package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusquedaSecuencialTest {

    @Test
    public void testElementoEncontrado() {
        int[] v = {2, 4, 6, 8, 10};
        assertEquals(2, BusquedaSecuencial.buscarSecuencial(v, 6));
    }

    @Test
    public void testElementoNoEncontrado() {
        int[] v = {1, 3, 5};
        assertEquals(-1, BusquedaSecuencial.buscarSecuencial(v, 10));
    }
}
