package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculoAumentoSueldoTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    // Normaliza los saltos de línea para que el test funcione en Windows, Mac y
    // Linux
    private String normalize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "\n");
    }

    @Test
    public void testCalculoCategoria1() {
        String input = "1\n1000\n"; // Simula la entrada del usuario
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Llama al método main
        CalculoAumentoSueldo.main(null);

        String expectedOutput = "Ingrese la categoría del trabajador (1-4): " +
                "Ingrese el sueldo del trabajador: " +
                "Categoría del trabajador: 1" + System.lineSeparator() +
                "Nuevo sueldo: 1150.0" + System.lineSeparator();

        // Compara la salida de la consola con el resultado esperado
        assertTrue(normalize(outContent.toString()).contains(normalize(expectedOutput)));
    }
}