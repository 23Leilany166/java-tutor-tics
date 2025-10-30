package com.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Asumiendo que SumaSerie está en el package correcto
// import com.ITSOEH.programasjava.Problema_3_9.SumaSerie;

public class SumaSerieTest {

    @Test
    public void testN1() {
        // 1^1 = 1
        assertEquals(1.0, SumaSerie.calcularSumaSerie(1), 0.001);
    }

    @Test
    public void testN3() {
        // 1^1 + 2^2 + 3^3 = 1 + 4 + 27 = 32
        assertEquals(32.0, SumaSerie.calcularSumaSerie(3), 0.001);
    }
}