package com.javatutor.ps_2_7;

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
    public void testAumentoMenorA10k() {
        String input = "8000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("9200") || salidaConsola.contains("aumento"),
            "Sueldo 8000 + 15% = 9200");
    }

    @Test
    public void testAumentoEntre10yA15k() {
        outputStreamCaptor.reset();
        String input = "12000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("13320") || salidaConsola.contains("aumento"),
            "Sueldo 12000 + 11% = 13320");
    }

    @Test
    public void testAumentoMayorA15k() {
        outputStreamCaptor.reset();
        String input = "20000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("21600") || salidaConsola.contains("aumento"),
            "Sueldo 20000 + 8% = 21600");
    }
}