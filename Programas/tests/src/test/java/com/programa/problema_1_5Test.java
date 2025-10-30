package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class problema_1_5Test {

    private problema_1_5 cilindro;

    @BeforeEach
    void setUp() {
        // Esto crea un objeto nuevo antes de cada test
        cilindro = new problema_1_5();
    }

    @Test
    void testCalculosRegulares() {
        double radio = 10.0;
        double altura = 5.0;
        double volEsperado = 1570.7963;
        double areaEsperada = 314.1592;

        assertEquals(volEsperado, cilindro.calcularVolumen(radio, altura), 0.0001);
        assertEquals(areaEsperada, cilindro.calcularArea(radio, altura), 0.0001);
    }

    @Test
    void testCalculosConCero() {
        assertEquals(0.0, cilindro.calcularVolumen(0, 10));
        assertEquals(0.0, cilindro.calcularArea(10, 0));
        assertEquals(0.0, cilindro.calcularVolumen(0, 0));
    }
}