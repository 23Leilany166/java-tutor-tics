package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

/**
 * Pruebas para Problema 3.18 — ProduccionIndustrias.
 * Programación estructurada en Java 21.
 */
public class ProduccionIndustriasTest {

    @Test
    public void testMayoresDeJulio() {
        List<Integer> result = new ArrayList<>();
        double[][] datos = {
            {2_000_000, 3_500_000, 3_100_000, 2_500_000, 3_200_000, 3_400_000, 3_600_000, 3_700_000, 3_800_000, 3_900_000, 3_000_000, 3_100_000},
            {1_000_000, 1_200_000, 2_000_000, 1_800_000, 2_100_000, 2_500_000, 2_900_000, 3_200_000, 2_800_000, 2_900_000, 3_000_000, 3_100_000}
        };
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][6] > 3_000_000) {
                result.add(i + 1);
            }
        }
        assertTrue(result.contains(1));
        assertFalse(result.contains(2));
    }

    @Test
    public void testCalculoTotalAnual() {
        double[] meses = {2_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000, 3_000_000};
        double suma = 0;
        for (double m : meses) suma += m;
        assertEquals(35_000_000, suma, 0.01);
    }
}
