package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops2_9;

public class ps2_9_TestNoResuelto{ 

    @Test
    void testIdentidadValida() {
        // A^{-N} y 1/(A^N) deben ser casi iguales
        assertTrue(esqueletops2_9.identidad(2.0, 3, 1e-9));
    }

    @Test
    void testIdentidadConA0EsFalse() {
        assertFalse(esqueletops2_9.identidad(0.0, 2, 1e-9));
    }
}

