package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueletops3_29;

public class ps3_29_TestNoResuelto {

    @Test
    void testResolverPorcentajeYGrupos() {
        int N = 4;
        String[] EST = {"CDMX", "Puebla", "Estado de México", "Texas"};
        double[] EDAD = {0.5, 2.0, 4.5, 10.0};

        esqueletops3_29.Res r = esqueletops3_29.resolver(N, EST, EDAD);

        assertEquals(50.0, r.porcentaje, 1e-9); // 2 de 4 son CDMX/Edo Méx
        assertEquals(1, r.g1);
        assertEquals(1, r.g2);
        assertEquals(1, r.g3);
        assertEquals(1, r.g4);
        assertEquals("G1", r.grupoMax); // empate, se queda el primero
    }

    @Test
    void testUnicefGrupoMasGrande() {
        double[] edades = {0.5, 4.0, 4.5, 4.8};
        int idx = esqueletops3_29.unicef(edades);
        assertEquals(3, idx); // G3 es el que tiene más
    }
}
