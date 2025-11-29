package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.ejercicios.noresueltos.esqueletops4_21;
import java.util.*;

public class ps4_21_TestNoResuelto {

    @Test
    void testResolverConTemperaturasSimples() {
        int[] DIAS = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        double[][] TEMP = new double[13][32];

        // Para cada mes, pon todas las temperaturas iguales al número del mes
        for (int m = 1; m <= 12; m++) {
            for (int d = 1; d <= DIAS[m]; d++) {
                TEMP[m][d] = m;
            }
        }

        // AQUÍ estaba el error: "esqueletops4_21ps4_21"
        esqueletops4_21.Res r = esqueletops4_21.resolver(TEMP, false);

        assertEquals(12.0, r.max, 1e-9);
        assertEquals(1, r.diaMax);
        assertEquals(12, r.mesMax);

        for (int m = 1; m <= 12; m++) {
            assertEquals(m, r.promMes[m], 1e-9);
        }

        assertEquals(12, r.mesPromMax);
        assertEquals(12.0, r.valPromMax, 1e-9);
    }
}
