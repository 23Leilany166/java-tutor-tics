package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops4_5;

public class ps4_5_TestNoResuelto {

    @Test
    void testFrecuenciasBasico() {
        int[] datos = {0, 1, 1, 3, 3, 3, 10, 10};
        int[] F = esqueletops4_5.frecuencias(datos);

        assertEquals(1, F[0]);
        assertEquals(2, F[1]);
        assertEquals(3, F[3]);
        assertEquals(2, F[10]);
    }

    @Test
    void testValoresFueraDeRangoIgnorados() {
        int[] datos = {-1, 11, 100};
        int[] F = esqueletops4_5.frecuencias(datos);

        for (int i = 0; i <= 10; i++) {
            assertEquals(0, F[i]);
        }
    }
}
