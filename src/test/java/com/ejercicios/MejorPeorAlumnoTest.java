package com.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MejorPeorAlumnoTest extends BaseConsoleTest {

        @Test
        @DisplayName("Prueba de mejor y peor promedio con 3 alumnos")
        // NOTA: Este test asume NUM_ALUMNOS = 3 y NUM_CALIFICACIONES = 2
        // en el archivo MejorPeorAlumno.java
        public void testTresAlumnos() {
                // Alumno 1 (101): 10, 8 -> Promedio 9.0 (MEJOR)
                // Alumno 2 (102): 5, 6 -> Promedio 5.5 (PEOR)
                // Alumno 3 (103): 7, 7 -> Promedio 7.0
                final String input = "101\n" + // Matrícula Alumno 1
                                "10 8\n" + // Califs Alumno 1
                                "102\n" + // Matrícula Alumno 2
                                "5 6\n" + // Califs Alumno 2
                                "103\n" + // Matrícula Alumno 3
                                "7 7\n"; // Califs Alumno 3

                provideInput(input);
                MejorPeorAlumno.main(new String[0]);
                String output = getOutput();

                // Verificar resultados
                assertTrue(output.contains("Mejor Alumno - Matrícula: 101, Promedio: 9.00"),
                                "Error al identificar al mejor alumno");
                assertTrue(output.contains("Peor Alumno  - Matrícula: 102, Promedio: 5.50"),
                                "Error al identificar al peor alumno");
        }
}