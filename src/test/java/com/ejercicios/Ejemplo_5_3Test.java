package com.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Asumiendo que Domicilio está en el package correcto
// import Ejercicios_Libros.Domicilio;

public class Ejemplo_5_3Test {

    @Test
    public void testConstructorDomicilio() {
        // Crea una instancia de Domicilio
        Domicilio dom = new Domicilio("Calle Falsa", 123, "Ciudad Capital", "México");

        // Verifica que los campos (atributos) se hayan asignado correctamente
        assertEquals("Calle Falsa", dom.calle);
        assertEquals(123, dom.numero);
        assertEquals("Ciudad Capital", dom.ciudad);
        assertEquals("México", dom.pais);
    }
}