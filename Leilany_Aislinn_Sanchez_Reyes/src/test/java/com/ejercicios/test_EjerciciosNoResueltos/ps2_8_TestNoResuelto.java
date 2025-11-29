package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops2_8;

public class ps2_8_TestNoResuelto{

    @Test
    void testIndefinidoCuandoDivisorCero() {
        assertEquals("Indefinido", esqueletops2_8.resolver(0, 10));
    }

    @Test
    void testSiEsDivisor() {
        assertEquals("Sí es divisor", esqueletops2_8.resolver(2, 10));
    }

    @Test
    void testNoEsDivisor() {
        assertEquals("No es divisor", esqueletops2_8.resolver(3, 10));
    }
}
