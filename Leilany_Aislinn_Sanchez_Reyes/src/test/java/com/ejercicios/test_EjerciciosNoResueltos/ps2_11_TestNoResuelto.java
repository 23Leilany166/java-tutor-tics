package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops2_11;

public class ps2_11_TestNoResuelto{ 

    @Test
    void testYMenorIgualCero() {
        assertEquals(0L, esqueletops2_11.X(0));
        assertEquals(0L, esqueletops2_11.X(-5));
    }

    @Test
    void testTramo1a11() {
        long y = 5;
        long esperado = 3L * y + 36L; // 3*5 + 36 = 51
        assertEquals(esperado, esqueletops2_11.X((int) y));
    }

    @Test
    void testTramo12a33() {
        int y = 20;
        long esperado = (long) y * y - 10L; // 400 - 10 = 390
        assertEquals(esperado, esqueletops2_11.X(y));
    }

    @Test
    void testTramo34a64() {
        int y = 40;
        long esperado = (long) y * y * y + (long) y * y - 1L;
        assertEquals(esperado, esqueletops2_11.X(y));
    }
}
