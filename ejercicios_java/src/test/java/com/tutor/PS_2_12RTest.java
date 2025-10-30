package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_2_12R.
 */
public class PS_2_12RTest { // El nombre del archivo debe ser PS_2_12RTest.java

    @Test
    void testDeportesPorRango() {
        // 1. Preparación
        PS_2_12R ejercicio = new PS_2_12R();
        
        // 2. Ejecución y Verificación
        
        // Rango > 85 (Natación)
        assertEquals("Natación", ejercicio.determinarDeporte(90.0), "Con 90°F debe ser Natación");
        assertEquals("Natación", ejercicio.determinarDeporte(85.1), "Con 85.1°F debe ser Natación");

        // Rango > 70 y <= 85 (Tenis)
        assertEquals("Tenis", ejercicio.determinarDeporte(75.0), "Con 75°F debe ser Tenis");
        
        // Rango > 32 y <= 70 (Golf)
        assertEquals("Golf", ejercicio.determinarDeporte(50.0), "Con 50°F debe ser Golf");

        // Rango > 10 y <= 32 (Esquí)
        assertEquals("Esquí", ejercicio.determinarDeporte(20.0), "Con 20°F debe ser Esquí");

        // Rango <= 10 (Marcha)
        assertEquals("Marcha", ejercicio.determinarDeporte(5.0), "Con 5°F debe ser Marcha");
        assertEquals("Marcha", ejercicio.determinarDeporte(-10.0), "Con -10°F debe ser Marcha");
    }

    @Test
    void testDeportesEnLimites() {
        // Prueba de los valores límite exactos
        PS_2_12R ejercicio = new PS_2_12R();
        
        // Límite entre Natación y Tenis
        assertEquals("Tenis", ejercicio.determinarDeporte(85.0), "Con 85.0°F exactos debe ser Tenis");
        
        // Límite entre Tenis y Golf
        assertEquals("Golf", ejercicio.determinarDeporte(70.0), "Con 70.0°F exactos debe ser Golf");
        
        // Límite entre Golf y Esquí
        assertEquals("Esquí", ejercicio.determinarDeporte(32.0), "Con 32.0°F exactos debe ser Esquí");

        // Límite entre Esquí y Marcha
        assertEquals("Marcha", ejercicio.determinarDeporte(10.0), "Con 10.0°F exactos debe ser Marcha");
    }
}