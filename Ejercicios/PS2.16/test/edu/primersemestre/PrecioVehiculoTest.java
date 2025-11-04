package edu.primersemestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Pruebas unitarias del cálculo de descuento por modelo */
public class PrecioVehiculoTest {

    @Test
    public void testPorcentajePorModelo() {
        assertEquals(0.08, PrecioVehiculo.porcentajePorModelo("Blazer-Trail"), 0.0001);
        assertEquals(0.05, PrecioVehiculo.porcentajePorModelo("Cavalier"), 0.0001);
        assertEquals(0.06, PrecioVehiculo.porcentajePorModelo("Chevy"), 0.0001);
        assertEquals(0.09, PrecioVehiculo.porcentajePorModelo("Opel-Astra"), 0.0001);
        assertEquals(0.0, PrecioVehiculo.porcentajePorModelo("Otro"), 0.0001);
    }
}
