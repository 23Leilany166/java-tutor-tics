package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para la clase de modelo P14_7_ej_5_1 (Alumno).
 */
public class P14_7_ej_5_1Test {

    private P14_7_ej_5_1 alumno;

    // El método con @BeforeEach se ejecuta antes de cada prueba.
    // Es perfecto para inicializar un objeto limpio para cada test.
    @BeforeEach
    void setUp() {
        alumno = new P14_7_ej_5_1("Juan Perez", "Calle Principal 123", 123456, "Ingeniería Informática");
    }

    @Test
    void testConstructorYGetters() {
        // Esta prueba verifica que el constructor y los getters funcionen correctamente.
        assertEquals("Juan Perez", alumno.getNombre(), "El nombre no fue inicializado correctamente");
        assertEquals("Calle Principal 123", alumno.getDireccion(), "La dirección no fue inicializada correctamente");
        assertEquals(123456, alumno.getMatricula(), "La matrícula no fue inicializada correctamente");
        assertEquals("Ingeniería Informática", alumno.getCarrera(), "La carrera no fue inicializada correctamente");
    }

    @Test
    void testSetNombre() {
        // Prueba el método setNombre
        alumno.setNombre("Carlos Sanchez");
        assertEquals("Carlos Sanchez", alumno.getNombre(), "El nombre no fue actualizado por el setter");
    }

    @Test
    void testSetDireccion() {
        // Prueba el método setDireccion
        alumno.setDireccion("Avenida Central 456");
        assertEquals("Avenida Central 456", alumno.getDireccion(), "La dirección no fue actualizada por el setter");
    }

    @Test
    void testSetMatricula() {
        // Prueba el método setMatricula
        alumno.setMatricula(987654);
        assertEquals(987654, alumno.getMatricula(), "La matrícula no fue actualizada por el setter");
    }

    @Test
    void testSetCarrera() {
        // Prueba el método setCarrera
        alumno.setCarrera("Arquitectura");
        assertEquals("Arquitectura", alumno.getCarrera(), "La carrera no fue actualizada por el setter");
    }
}