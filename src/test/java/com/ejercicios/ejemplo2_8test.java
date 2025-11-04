package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ejemplo2_8test {

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
        String input = "1\n1000\n"; // Categoria 1, Sueldo 1000
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ejemplo_2_8.main(null);
        String output = normalize(outContent.toString());

        // 1000 * 0.15 = 150. Nuevo sueldo = 1150.0
        assertTrue(output.contains("Nuevo sueldo: $1150.0"));
        assertTrue(output.contains("Categoría del trabajador: 1"));
    }

    @Test
    public void testCalculoCategoria3() {
        String input = "3\n2000\n"; // Categoria 3, Sueldo 2000
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ejemplo_2_8.main(null);
        String output = normalize(outContent.toString());

        // 2000 * 0.08 = 160. Nuevo sueldo = 2160.0
        assertTrue(output.contains("Nuevo sueldo: $2160.0"));
        assertTrue(output.contains("Categoría del trabajador: 3"));
    }

    @Test
    public void testCategoriaInvalida() {
        String input = "5\n1000\n"; // Categoria 5 (invalida)
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ejemplo_2_8.main(null);
        String output = normalize(outContent.toString());

        assertTrue(output.contains("Categoría inválida. Debe ser entre 1 y 4."));
    }
}