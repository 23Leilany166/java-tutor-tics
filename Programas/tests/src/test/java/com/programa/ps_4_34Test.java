package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ps_4_34Test {

    private ps_4_34 pf = new ps_4_34();
    // [12 Mes][4 Año][3 Depto]
    private double[][][] fabricaTest = new double[12][4][3];

    @BeforeEach
    void setUp() {
        // a) Depto 0 (Dulces) = 100. Depto 1 (Conservas) = 50. Depto 2 (Bebidas) = 1000.
        fabricaTest[0][0][0] = 100;
        fabricaTest[0][0][1] = 50;
        fabricaTest[0][0][2] = 1000; // Mayor Depto: Bebidas

        // b) Mes 2do año (idx 1). Mes 1 = 10. Mes 2 = 50.
        fabricaTest[0][1][0] = 10;
        fabricaTest[1][1][0] = 50; // Mayor Mes: 2
        
        // c) Año 1 = 5. Año 2 = 10. Año 3 = 1000. Año 4 = 1.
        fabricaTest[0][0][0] = 5;
        fabricaTest[0][1][0] = 10;
        fabricaTest[0][2][0] = 1000; // Mayor Año: 3
        fabricaTest[0][3][0] = 1;

        // d) Max individual
        fabricaTest[5][2][1] = 9999; // Mes 6, Año 3, Depto 1 (Conservas)
    }

    @Test
    void testGetDeptoMayorProduccion() {
        assertEquals("Bebidas", pf.getDeptoMayorProduccion(fabricaTest));
    }

    @Test
    void testGetMesMayorProdAnio2() {
        assertEquals(2, pf.getMesMayorProdAnio2(fabricaTest));
    }

    @Test
    void testGetAnioMayorProduccion() {
        assertEquals(3, pf.getAnioMayorProduccion(fabricaTest));
    }

    @Test
    void testGetDetalleMaxIndividual() {
        assertEquals("Mes: 6, Año: 3, Depto: Conservas", pf.getDetalleMaxIndividual(fabricaTest));
    }
}