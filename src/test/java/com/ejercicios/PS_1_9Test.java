package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Asumiendo que PS_1_9 está en el package correcto
// import programas.PS_1_9;

public class PS_1_9Test {

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
    public void testRadio10() {
        // Radio = 10
        // Area = 4 * PI * 100 = 1256.63...
        // Vol = (4/3) * PI * 1000 = 4188.79...
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        PS_1_9.main(null);

        String output = normalize(outContent.toString());

        assertTrue(output.contains("Área de la esfera: 1256.63"));
        assertTrue(output.contains("Volumen de la esfera: 4188.79"));
    }
}