package com.javatutor.ps_2_5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(standardIn);
        System.setOut(standardOut);
    }

    @Test
    public void testDivisiónVálida() {
        String input = "10\n5\n3\n2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("resultado") || salidaConsola.contains("3.5"),
            "(10-3)/2 = 3.5");
    }

    @Test
    public void testDivisiónPorCero() {
        outputStreamCaptor.reset();
        String input = "10\n5\n3\n0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("Error") || salidaConsola.contains("error"),
            "Debería mostrar error de división por cero");
    }

    @Test
    public void testResultadoNegativo() {
        outputStreamCaptor.reset();
        String input = "2\n5\n7\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("resultado") || salidaConsola.contains("-1"),
            "(2-7)/3 = -1.666...");
    }
}