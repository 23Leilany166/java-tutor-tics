package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueleto4_16;

public class Problema4_16_TestNoResuelto {

    @Test
    void testConstruirB() {
        int M = 3, N = 2;
        long[][] A = new long[M+1][N+1];

        // i=1: 1 2
        A[1][1] = 1; A[1][2] = 2;
        // i=2: 3 4
        A[2][1] = 3; A[2][2] = 4;
        // i=3: 5 6
        A[3][1] = 5; A[3][2] = 6;

        long[] B = esqueleto4_16.construirB(A, M, N);

        assertEquals(3L,  B[1]); // 1+2
        assertEquals(11L, B[2]); // 3*1 + 4*2 = 11
        assertEquals(11L, B[3]); // 5+6
    }
}

