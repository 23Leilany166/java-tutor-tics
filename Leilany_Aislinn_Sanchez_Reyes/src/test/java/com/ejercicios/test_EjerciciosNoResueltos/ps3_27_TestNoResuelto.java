package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops3_27;

public class ps3_27_TestNoResuelto {

    @Test
    void testResolverBasico() {
        int N = 4;
        List<String> MAT = Arrays.asList("A1", "B2", "C3", "D4");
        List<Integer> SEX = Arrays.asList(0, 1, 0, 1);  // 0=F,1=M
        List<Integer> SEM = Arrays.asList(1, 3, 5, 7);
        List<Double> PRO = Arrays.asList(90.0, 80.0, 95.0, 70.0);

        esqueletops3_27.Res r = esqueletops3_27.resolver(N, MAT, SEX, SEM, PRO);

        assertEquals("C3", r.matF);
        assertEquals(95.0, r.maxF, 1e-9);
        assertEquals("B2", r.matM);
        assertEquals(80.0, r.maxM, 1e-9);

        assertEquals(90.0, r.prom1, 1e-9);
        assertEquals(80.0, r.prom3, 1e-9);
        assertEquals(95.0, r.prom5, 1e-9);
        assertEquals(70.0, r.prom7, 1e-9);
    }
}

