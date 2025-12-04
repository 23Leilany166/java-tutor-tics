import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestFabrica {

    @Test
    public void testFabrica() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Fabrica.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Verificar valores esperados:
        // a) Producto 0: 3300.0, Producto 1: 3600.0
        // b) Costo Total: 6900.00
        // c) Producto más vendido: 0
        assertTrue(salida.contains("3300.0") && salida.contains("3600.0"), "Debe mostrar costos de productos");
        assertTrue(salida.contains("6900.00"), "Debe mostrar costo total 6900.00");
        assertTrue(salida.contains("índice): 0"), "Debe mostrar producto más vendido (índice 0)");
    }
}
