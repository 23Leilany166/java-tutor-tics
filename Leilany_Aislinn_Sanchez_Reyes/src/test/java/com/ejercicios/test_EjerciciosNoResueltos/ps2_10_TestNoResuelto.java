package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops2_10;

public class ps2_10_TestNoResuelto{ 

    @Test
    void testIdentidadValida() {
        assertTrue(esqueletops2_10.identidad(4.0, 2.0, 3, 1e-9)); // (4/2)^3 vs 4^3/2^3
    }

    @Test
    void testBNoPuedeSerCero() {
        assertFalse(esqueletops2_10.identidad(4.0, 0.0, 2, 1e-9));
    }

    @Test
    void testANoPuedeSer0ConNNegativo() {
        assertFalse(esqueletops2_10.identidad(0.0, 2.0, -1, 1e-9));
    }
}

