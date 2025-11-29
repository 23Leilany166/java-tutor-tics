package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops3_28;

public class ps3_28_TestNoResuelto{ 

    @Test
    void testResolverBasico() {
        int N = 4;
        int[] CLAVE = {1,2,3,4}; // no se usa, pero lo llenamos
        int[] EDAD  = {30, 25, 60, 19};
        int[] SEXO  = {1, 0, 1, 0}; // 1=hombre, 0=mujer
        int[] SUELDO= {25000, 26000, 39000, 10000};

        int[] r = esqueletops3_28.resolver(N, CLAVE, EDAD, SEXO, SUELDO);

        assertArrayEquals(new int[]{2, 2, 1, 1, 1}, r);
        // hombres=2, mujeres=2, mujeres>=25k=1, hombres<40 con sueldo 20–40k=1, mayores50=1
    }
}

