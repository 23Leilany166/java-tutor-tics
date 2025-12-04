import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestCalculadoraAumento {

    @Test
    public void testCalculadoraAumento() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        CalculadoraAumento.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Verificar que contenga los valores esperados
        // Sueldo 840.50 -> 966.57 (15% aumento)
        // Sueldo 1200.00 -> 1344.00 (12% aumento)
        // Sueldo 1000.00 -> 1120.00 (12% aumento)
        assertTrue(salida.contains("966.57") || salida.contains("966.58"), "Debe mostrar 966.57 o 966.58");
        assertTrue(salida.contains("1344.00"), "Debe mostrar 1344.00");
        assertTrue(salida.contains("1120.00"), "Debe mostrar 1120.00");
    }
}
