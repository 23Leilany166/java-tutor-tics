package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalcularTangenteTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba tangente normal (sen/cos)")
    public void testTangenteNormal() {
        // sen = 0.5, cos = 0.866 -> tan = 0.5 / 0.866 = 0.577...
        // El formato es %.4f, así que esperamos 0.5774
        provideInput("0.5\n0.866\n");
        CalcularTangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La tangente es: 0.5774"));
    }

    @Test
    @DisplayName("Prueba tangente indefinida (coseno = 0)")
    public void testTangenteIndefinida() {
        provideInput("1\n0\n"); // seno=1, coseno=0
        CalcularTangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La tangente es indefinida (coseno es cero)."));
    }

    @Test
    @DisplayName("Prueba tangente cero (seno = 0)")
    public void testTangenteCero() {
        provideInput("0\n1\n"); // seno=0, coseno=1
        CalcularTangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La tangente es: 0.0000"));
    }
}
