package com.ejercicios.test_EjerciciosNoResueltos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ejercicios.noresueltos.esqueleto2_3;

import java.util.Optional;

public class Problema2_3_TestNoResuelto {

    @Test
    void testRaicesRealesOrden1() {
        // x^2 - 3x + 2 = 0  → 1 y 2
        Optional<double[]> op = esqueleto2_3.raices(1, -3, 2);
        assertTrue(op.isPresent());
        double[] r = op.get();
        assertEquals(2.0, r[0], 1e-9);
        assertEquals(1.0, r[1], 1e-9);
    }

    @Test
    void testSinRaicesCuandoDiscriminanteNegativo() {
        Optional<double[]> op = esqueleto2_3.raices(1, 0, 1);
        assertTrue(op.isEmpty());
    }

    @Test
    void testSinRaicesCuandoANulo() {
        Optional<double[]> op = esqueleto2_3.raices(0, 2, 3);
        assertTrue(op.isEmpty());
    }
}

