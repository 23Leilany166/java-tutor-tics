package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.ejercicios.noresueltos.esqueleto3_5;
import java.util.*;


public class Ejemplo3_5_TestNoResuelto {

    @Test
    void testCuboPositivo() {
        assertEquals(8L, esqueleto3_5.cubo(2));
        assertEquals(27L, esqueleto3_5.cubo(3));
    }

    @Test
    void testCuboCero() {
        assertEquals(0L, esqueleto3_5.cubo(0));
    }
}
