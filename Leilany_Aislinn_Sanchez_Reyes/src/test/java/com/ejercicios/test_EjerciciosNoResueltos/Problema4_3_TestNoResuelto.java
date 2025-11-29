package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueleto4_3;


public class Problema4_3_TestNoResuelto {

    @Test
    void testContarVotosYGanador() {
        List<Integer> votos = Arrays.asList(1,1,2,11,11,5,5,5);
        int[] V = esqueleto4_3.contarVotos(votos);

        assertEquals(2, V[1]);
        assertEquals(1, V[2]);
        assertEquals(3, V[5]);
        assertEquals(2, V[11]);

        assertEquals(5, esqueleto4_3.ganador(V));
    }

    @Test
    void testPorcentajeGanador() {
        List<Integer> votos = Arrays.asList(1,1,2,11,11,5,5,5);
        int[] V = esqueleto4_3.contarVotos(votos);
        double p = esqueleto4_3.porcentajeGanador(V); // 3 de 8 → 37.5
        assertEquals(37.5, p, 1e-9);
    }

    @Test
    void testSinVotos() {
        int[] V = new int[12];
        assertEquals(0.0, esqueleto4_3.porcentajeGanador(V), 1e-9);
    }
}

