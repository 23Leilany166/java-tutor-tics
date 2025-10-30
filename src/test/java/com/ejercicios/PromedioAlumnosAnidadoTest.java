package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PromedioAlumnosAnidadoTest extends BaseConsoleTest {

        @Test
        @DisplayName("Prueba de promedios para 2 alumnos")
        // NOTA: Este test asume NUM_ALUMNOS = 2 y NUM_CALIFICACIONES = 3
        // en el archivo PromedioAlumnosAnidado.java
        public void testDosAlumnos() {
                // Alumno 1 (101): 10, 9, 8 -> Promedio 9.0
                // Alumno 2 (102): 5, 6, 7 -> Promedio 6.0
                final String input = "101\n" + // Matrícula Alumno 1
                                "10 9 8\n" + // Califs Alumno 1
                                "102\n" + // Matrícula Alumno 2
                                "5 6 7\n"; // Califs Alumno 2

                provideInput(input);
                PromedioAlumnosAnidado.main(new String[0]);
                String output = getOutput();

                // Verificar ambos promedios
                assertTrue(output.contains("Matrícula: 101, Promedio: 9.00"),
                                "Error en el promedio del Alumno 1");
                assertTrue(output.contains("Matrícula: 102, Promedio: 6.00"),
                                "Error en el promedio del Alumno 2");
        }
}