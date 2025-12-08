package com.javatutor.problema_3_15;

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
    public void testLlamadaInternacional() {
        String input = "I\n3\nX";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("Costo") || salidaConsola.contains("costo"),
            "Debería calcular el costo de la llamada internacional");
    }

    @Test
    public void testLlamadaNacional() {
        outputStreamCaptor.reset();
        String input = "N\n5\nX";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("Costo") || salidaConsola.contains("costo"),
            "Debería calcular el costo de la llamada nacional");
    }

    @Test
    public void testLlamadaLocal() {
        outputStreamCaptor.reset();
        String input = "L\n2\nX";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("Costo") || salidaConsola.contains("costo"),
            "Debería calcular el costo de la llamada local");
    }

    @Test
    public void testMultiplesLlamadas() {
        outputStreamCaptor.reset();
        String input = "I\n2\nN\n3\nL\n1\nX";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("Costo") || salidaConsola.contains("costo"),
            "Debería calcular costos múltiples");
    }
}