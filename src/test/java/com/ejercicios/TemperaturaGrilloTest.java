package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemperaturaGrilloTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba un cálculo de temperatura válido")
    public void testCalculoValido() {
        // T = 60 / 4.0 + 40 = 15.0 + 40 = 55.0
        final String input = "60\n";
        provideInput(input);

        TemperaturaGrillo.main(new String[0]);
        String output = getOutput();

        // El formato es %.2f
        assertTrue(output.contains("Temperatura calculada: 55.00 grados Fahrenheit"));
    }

    @Test
    @DisplayName("Prueba con N=0 (no positivo)")
    public void testCalculoConCero() {
        final String input = "0\n";
        provideInput(input);

        TemperaturaGrillo.main(new String[0]);
        String output = getOutput();

        assertTrue(output.contains("El número de sonidos debe ser un entero positivo."));
    }

    @Test
    @DisplayName("Prueba con N negativo (no positivo)")
    public void testCalculoConNegativo() {
        final String input = "-10\n";
        provideInput(input);

        TemperaturaGrillo.main(new String[0]);
        String output = getOutput();

        assertTrue(output.contains("El número de sonidos debe ser un entero positivo."));
    }
}