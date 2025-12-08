package com.javatutor.problema_1_7;

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
    public void testAreaTrianguloEquilatero() {
        String input = "4\n4\n4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("El área del triángulo es:"),
            "La consola debería mostrar el área del triángulo");
    }

    @Test
    public void testAreaTrianguloRectangulo() {
        outputStreamCaptor.reset();
        String input = "3\n4\n5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("El área del triángulo es:"),
            "La consola debería mostrar el área del triángulo rectángulo");
    }

    @Test
    public void testAreaTrianguloScaleno() {
        outputStreamCaptor.reset();
        String input = "5\n6\n7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        App.main(new String[]{});
        String salidaConsola = outputStreamCaptor.toString();
        assertTrue(salidaConsola.contains("El área del triángulo es:"),
            "La consola debería mostrar el área del triángulo escaleno");
    }
}
