package com.ejercicios;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// Asumiendo que Teatro está en el package correcto
// import com.ITSOEH.programasjava.PS_4_30.Teatro;

public class TeatroTest {

    @Test
    public void testTeatroNoLleno() {
        String[][] teatro = new String[26][10];
        // Inicializa todos como vacíos
        for (String[] fila : teatro) {
            Arrays.fill(fila, "");
        }

        // Ocupa un asiento
        teatro[5][5] = "Cliente";

        assertFalse(Teatro.verificarTeatroLleno(teatro));
    }

    @Test
    public void testTeatroLleno() {
        String[][] teatro = new String[26][10];
        // Inicializa todos como ocupados
        for (String[] fila : teatro) {
            Arrays.fill(fila, "Ocupado");
        }

        assertTrue(Teatro.verificarTeatroLleno(teatro));
    }

    @Test
    public void testTeatroVacio() {
        String[][] teatro = new String[26][10];
        // Inicializa todos como vacíos
        for (String[] fila : teatro) {
            Arrays.fill(fila, "");
        }

        assertFalse(Teatro.verificarTeatroLleno(teatro));
    }
}