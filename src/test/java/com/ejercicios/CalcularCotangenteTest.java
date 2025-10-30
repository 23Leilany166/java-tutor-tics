package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalcularCotangenteTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba cotangente normal (cos/sen)")
    public void testCotangenteNormal() {
        // cos = 0.5, sen = 0.866 -> cot = 0.5 / 0.866 = 0.577...
        // El formato es %.4f, así que esperamos 0.5774
        provideInput("0.866\n0.5\n");
        CalcularCotangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La cotangente es: 0.5774"));
    }

    @Test
    @DisplayName("Prueba cotangente indefinida (seno = 0)")
    public void testCotangenteIndefinida() {
        provideInput("0\n1\n"); // seno=0, coseno=1
        CalcularCotangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La cotangente es indefinida (seno es cero)."));
    }

    @Test
    @DisplayName("Prueba cotangente cero (coseno = 0)")
    public void testCotangenteCero() {
        provideInput("1\n0\n"); // seno=1, coseno=0
        CalcularCotangente.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("La cotangente es: 0.0000"));
    }
}