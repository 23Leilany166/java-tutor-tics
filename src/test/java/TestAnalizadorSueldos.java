import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestAnalizadorSueldos {

    @Test
    public void testAnalizadorSueldos() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        AnalizadorSueldos.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // El ejercicio usa {1200.00, 3950.00, 7575.00, 980.00, 1050.70}
        // Promedio = 2951.14
        // Sueldos sobre promedio: 2 (3950.00 y 7575.00)
        assertTrue(salida.contains("2951.14"), "Debe mostrar el promedio 2951.14");
        assertTrue(salida.contains("2"), "Debe mostrar 2 sueldos sobre promedio");
    }
}
