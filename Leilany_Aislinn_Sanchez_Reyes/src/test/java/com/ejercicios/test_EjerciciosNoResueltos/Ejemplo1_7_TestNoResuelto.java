package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.ejercicios.noresueltos.esqueleto1_7;
import java.util.*;


public class Ejemplo1_7_TestNoResuelto {

    @Test
    void testSumaCuadradoBasico() {
        // (A + B)^2 / 3
        double r = esqueleto1_7.resolver(1, 2); // (3^2)/3 = 9/3 = 3
        assertEquals(3.0, r, 1e-9);
    }

    @Test
    void testConCeros() {
        double r = esqueleto1_7.resolver(0, 0);
        assertEquals(0.0, r, 1e-9);
    }
}
