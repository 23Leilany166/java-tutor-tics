package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Asumiendo que PS_3_42 está en el package correcto
// import ps_3_42.PS_3_42;

public class PS_3_42Test {

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

    private String normalize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "\n");
    }

    @Test
    public void testInvertirNumero() {
        String input = "123\n"; // Número a invertir
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        PS_3_42.main(null);

        String output = normalize(outContent.toString());

        // El diagrama 6.1 del libro solo imprimiría 'x'
        // Tu código imprime el estado final de las variables
        assertTrue(output.contains("x -> x * 10 + k = 321"));
        assertTrue(output.contains("n -> n / 10= 0"));
    }
}