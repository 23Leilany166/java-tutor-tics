package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContarCerosTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba con varios ceros")
    public void testVariosCeros() {
        provideInput("5\n10\n0\n-5\n0\n33\n"); // n=5, con dos ceros
        ContarCeros.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("Cantidad de ceros ingresados: 2"));
    }

    @Test
    @DisplayName("Prueba sin ningun cero")
    public void testNingunCero() {
        provideInput("3\n1\n2\n3\n"); // n=3, sin ceros
        ContarCeros.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("Cantidad de ceros ingresados: 0"));
    }

    @Test
    @DisplayName("Prueba con N=0 (caso límite)")
    public void testConNCero() {
        provideInput("0\n"); // n=0
        ContarCeros.main(new String[0]);
        String output = getOutput();
        assertTrue(output.contains("Cantidad de ceros ingresados: 0"));
    }
}