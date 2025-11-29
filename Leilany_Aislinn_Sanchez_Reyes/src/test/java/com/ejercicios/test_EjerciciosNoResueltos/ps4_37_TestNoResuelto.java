package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ejercicios.noresueltos.esqueletops3_27;
import com.ejercicios.noresueltos.esqueletops4_21;
import com.ejercicios.noresueltos.esqueletops4_37;

import java.util.*;

public class ps4_37_TestNoResuelto {

    @Test
    void testIndiceCentroPorNombreYReporteYMayor() {
        int N = 3;
        String[] CT = new String[N + 2];
        int[] HAB = new int[2 * (N + 2)];

        CT[1] = "Acapulco";  HAB[1] = 10; HAB[2] = 5;   // total 15
        CT[2] = "Cancún";    HAB[3] = 20; HAB[4] = 10;  // total 30
        CT[3] = "Mazatlán";  HAB[5] = 5;  HAB[6] = 5;   // total 10

        int idx = esqueletops4_37.indiceCentroPorNombre(CT, N, "cancún");
        assertEquals(2, idx);

        String rep = esqueletops4_37.reporte(CT, N, HAB, "Acapulco");
        assertEquals("Simples: 10 Dobles: 5 Total: 15", rep);

        String may = esqueletops4_37.mayor(CT, N, HAB);
        assertTrue(may.startsWith("Cancún"));
        assertTrue(may.contains("30"));
    }

    @Test
    void testInsertarMantieneOrden() {
        int N = 3;
        String[] CT = new String[10];
        int[] HAB = new int[20];

        CT[1] = "Acapulco";  HAB[1] = 10; HAB[2] = 5;
        CT[2] = "Cancún";    HAB[3] = 20; HAB[4] = 10;
        CT[3] = "Mazatlán";  HAB[5] = 5;  HAB[6] = 5;

        int nuevoN = esqueletops4_37.insertar(CT, N, HAB, "Bahía", 7, 3);

        assertEquals(4, nuevoN);
        assertEquals("Acapulco", CT[1]);
        assertEquals("Bahía", CT[2]); // quedó en medio
        assertEquals("Cancún", CT[3]);
    }
}
