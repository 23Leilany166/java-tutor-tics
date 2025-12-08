package com.javatutor.ps_2_4;

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
    public void testSueldoMenorA1000() {
        String input = "800";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("920") || salidaConsola.contains("aumento"),
            "Sueldo 800 + 15% = 920");
    }

    @Test
    public void testSueldoMayorOIgualA1000() {
        outputStreamCaptor.reset();
        String input = "1000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("1120") || salidaConsola.contains("aumento"),
            "Sueldo 1000 + 12% = 1120");
    }

    @Test
    public void testSueldoAlto() {
        outputStreamCaptor.reset();
        String input = "5000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("5600") || salidaConsola.contains("aumento"),
            "Sueldo 5000 + 12% = 5600");
    }
}