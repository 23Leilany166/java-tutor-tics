package com.ejercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Asumiendo que Ejemplo_5_4 está en el package correcto
// import programas.Ejemplo_5_4;

public class Ejemplo_5_4Test {

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
    }

    private String normalize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "\n");
    }

    @Test
    public void testSalidaMain() {
        Ejemplo_5_4.main(null);

        String expectedOutput = "Datos del empleado 1:\n" +
                "Número: 1\n" +
                "Nombre: Juan Pérez\n" +
                "Departamento: Ventas\n" +
                "Nivel: 2\n" +
                "Sueldo: 2500.5\n" + // El .50 se simplifica a .5
                "\nDatos del empleado 2:\n" +
                "Número: 2\n" +
                "Nombre: María López\n" +
                "Departamento: Recursos Humanos\n" +
                "Nivel: 3\n" +
                "Sueldo: 3000.75\n";

        assertEquals(normalize(expectedOutput), normalize(outContent.toString()));
    }
}