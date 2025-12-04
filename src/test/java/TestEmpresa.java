import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestEmpresa {

    @Test
    public void testEmpresaOperations() {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Empresa.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Verificar los 3 incisos:
        // a) Buscar a 'Luis' - debe mostrar sueldo 30000
        // b) Empleado que más gana en Ventas - debe ser Pedro con 25000
        // c) Alta de Carlos - debe ser exitosa
        assertTrue(salida.contains("Luis") && salida.contains("30000"), "Debe mostrar a Luis con sueldo 30000");
        assertTrue(salida.contains("Pedro") && salida.contains("25000"), "Debe mostrar a Pedro con sueldo 25000");
        assertTrue(salida.contains("Alta exitosa: Carlos") || salida.contains("Carlos"),
                "Debe registrar alta de Carlos");
    }
}
