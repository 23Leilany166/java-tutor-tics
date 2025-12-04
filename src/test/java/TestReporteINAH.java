import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestReporteINAH {

    @Test
    public void testReporteINAH() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        ReporteINAH.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Verificar valores esperados según los datos de prueba:
        // a) Año con más visitas (Centro 43): 1998
        // b) Centro con más visitas (1994): 10
        // c) Mes con más visitas (1995): 8
        assertTrue(salida.contains("1998"), "Debe mostrar el año 1998");
        assertTrue(salida.contains(": 10"), "Debe mostrar el centro 10");
        assertTrue(salida.contains(": 8"), "Debe mostrar el mes 8");
    }
}
