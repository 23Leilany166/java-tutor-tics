package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ejemplo_3_2Test {

    private ejemplo_3_2 nr = new ejemplo_3_2();

    @Test
    void testSumaNomina() {
        double[] sueldos = {100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0, 900.0, 1000.0};
        double esperado = 5500.0;
        assertEquals(esperado, nr.calcularNomina(sueldos), 0.001);
    }

    @Test
    void testNominaConCeros() {
        double[] sueldos = {150.0, 0.0, 50.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double esperado = 200.0;
        assertEquals(esperado, nr.calcularNomina(sueldos), 0.001);
    }

    @Test
    void testNominaArregloVacio() {
        double[] sueldos = {};
        double esperado = 0.0;
        assertEquals(esperado, nr.calcularNomina(sueldos), 0.001);
    }
}