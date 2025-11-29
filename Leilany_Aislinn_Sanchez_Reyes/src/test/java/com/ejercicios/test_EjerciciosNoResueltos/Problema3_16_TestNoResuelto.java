package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ejercicios.noresueltos.esqueleto3_16;

import java.util.*;

public class Problema3_16_TestNoResuelto {

    @Test
    void testResolverConMatrizPequena() {
        int N = 3;
        int[][] V = new int[N + 1][6];

        // i=1
        V[1][1] = 1; V[1][2] = 5; V[1][3] = 0; V[1][4] = 2; V[1][5] = 0;
        // i=2
        V[2][1] = 0; V[2][2] = 3; V[2][3] = 1; V[2][4] = 0; V[2][5] = 4;
        // i=3
        V[3][1] = 2; V[3][2] = 7; V[3][3] = 0; V[3][4] = 1; V[3][5] = 1;

        Map<String,Object> r = esqueleto3_16.resolver(V, N);

        int[] tipo = (int[]) r.get("tipo");
        int[] tot  = (int[]) r.get("tot");
        int anioMax = (int) r.get("anioMaxTipo2");
        int max2 = (int) r.get("maxTipo2");
        @SuppressWarnings("unchecked")
        List<Integer> sin3 = (List<Integer>) r.get("sinTipo3");

        assertArrayEquals(new int[]{0,3,15,1,3,5}, tipo); // índice 0 sin usar
        assertArrayEquals(new int[]{0,8,8,11}, tot);
        assertEquals(3, anioMax);
        assertEquals(7, max2);
        assertEquals(Arrays.asList(1,3), sin3);
    }
}
