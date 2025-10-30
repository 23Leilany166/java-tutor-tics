package com.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Asumiendo que Capital está en el package correcto
// import ...Capital;

public class CapitalTest {

    @Test
    public void testCalculoInteresSimple() {
        double capIni = 100.0;
        // Interés del 10% (0.1) por 2 meses
        double[] tasas = { 0.1, 0.1 };

        // Mes 1: 100 + (100 * 0.1) = 110
        // Mes 2: 110 + (110 * 0.1) = 110 + 11 = 121

        assertEquals(121.0, Capital.calcularMonto(capIni, tasas), 0.001);
    }

    @Test
    public void testCalculoInteresVariable() {
        double capIni = 1000.0;
        // Mes 1: 10% (0.1), Mes 2: 5% (0.05)
        double[] tasas = { 0.1, 0.05 };

        // Mes 1: 1000 + (1000 * 0.1) = 1100
        // Mes 2: 1100 + (1100 * 0.05) = 1100 + 55 = 1155

        assertEquals(1155.0, Capital.calcularMonto(capIni, tasas), 0.001);
    }
}