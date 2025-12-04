import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestProcesadorFunciones {

    @Test
    public void testProcesadorFunciones() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        ProcesadorFunciones.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // El ejercicio procesa 4 casos:
        // Opción 1, V=8 -> 100*8 = 800.0
        // Opción 7, V=6 -> 0.0 (default)
        // Opción 3, V=4 -> 100/4 = 25.0
        // Opción 2, V=3 -> 100^3 = 1000000.0
        assertTrue(salida.contains("800.0"), "Debe contener 800.0");
        assertTrue(salida.contains("0.0"), "Debe contener 0.0");
        assertTrue(salida.contains("25.0"), "Debe contener 25.0");
        assertTrue(salida.contains("1000000.0"), "Debe contener 1000000.0");
    }
}
