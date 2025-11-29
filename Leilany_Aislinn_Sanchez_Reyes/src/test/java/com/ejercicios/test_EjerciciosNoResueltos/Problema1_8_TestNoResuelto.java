package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.ejercicios.noresueltos.esqueleto1_8;
import java.util.*;


public class Problema1_8_TestNoResuelto {

    @Test
    void testDistanciaClasica3_4_5() {
        double d = esqueleto1_8.distancia(0, 0, 3, 4);
        assertEquals(5.0, d, 1e-9);
    }

    @Test
    void testDistanciaMismoPunto() {
        double d = esqueleto1_8.distancia(2, -1, 2, -1);
        assertEquals(0.0, d, 1e-9);
    }
}
