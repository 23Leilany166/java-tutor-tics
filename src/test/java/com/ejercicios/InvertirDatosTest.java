package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertirDatosTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba la inversión de cuatro números")
    public void testInversionSimple() {
        // Proporciona 4 números en una sola línea
        final String input = "10 20 30 40\n";
        provideInput(input);

        InvertirDatos.main(new String[0]);
        String output = getOutput();

        // Construimos la salida esperada.
        // El \n al final es importante porque println() lo añade.
        String expectedOutput = "Los números en orden inverso son:\n" +
                "40\n" +
                "30\n" +
                "20\n" +
                "10\n";

        // Verificamos que la salida termine con el resultado esperado
        assertTrue(output.endsWith(expectedOutput),
                "La salida no muestra los números en el orden inverso esperado.");
    }
}