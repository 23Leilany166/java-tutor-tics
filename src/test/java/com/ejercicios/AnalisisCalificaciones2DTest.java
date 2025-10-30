package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnalisisCalificaciones2DTest extends BaseConsoleTest {

    @Test
    @DisplayName("Prueba de cálculo completo con 5 alumnos y 3 exámenes")
    public void testCalculoCompleto() {
        // Datos de entrada: 5 alumnos, 3 exámenes por alumno
        // Alumno 1: 10, 8, 9 (Prom: 9.0)
        // Alumno 2: 7, 7, 7 (Prom: 7.0)
        // Alumno 3: 5, 6, 7 (Prom: 6.0)
        // Alumno 4: 8, 8, 8 (Prom: 8.0)
        // Alumno 5: 10, 10, 10 (Prom: 10.0)
        // ---------------------------------
        // Prom Examen 1: (10+7+5+8+10)/5 = 40/5 = 8.0
        // Prom Examen 2: (8+7+6+8+10)/5 = 39/5 = 7.8
        // Prom Examen 3: (9+7+7+8+10)/5 = 41/5 = 8.2 <- MAX PROMEDIO
        final String input = "10\n8\n9\n" + // Alumno 1
                "7\n7\n7\n" + // Alumno 2
                "5\n6\n7\n" + // Alumno 3
                "8\n8\n8\n" + // Alumno 4
                "10\n10\n10\n"; // Alumno 5

        provideInput(input);
        AnalisisCalificaciones2D.main(new String[0]);
        String output = getOutput();

        // Verificar promedios por examen
        assertTrue(output.contains("Promedio Examen 1: 8.00"), "Falla Promedio Examen 1");
        assertTrue(output.contains("Promedio Examen 2: 7.80"), "Falla Promedio Examen 2");
        assertTrue(output.contains("Promedio Examen 3: 8.20"), "Falla Promedio Examen 3");

        // Verificar promedios por alumno
        assertTrue(output.contains("Promedio Alumno 1: 9.00"), "Falla Promedio Alumno 1");
        assertTrue(output.contains("Promedio Alumno 2: 7.00"), "Falla Promedio Alumno 2");
        assertTrue(output.contains("Promedio Alumno 3: 6.00"), "Falla Promedio Alumno 3");
        assertTrue(output.contains("Promedio Alumno 4: 8.00"), "Falla Promedio Alumno 4");
        assertTrue(output.contains("Promedio Alumno 5: 10.00"), "Falla Promedio Alumno 5");

        // Verificar examen con mayor promedio
        assertTrue(output.contains("Examen número 3 tuvo el mayor promedio: 8.20"), "Falla Examen Max Promedio");
    }
}