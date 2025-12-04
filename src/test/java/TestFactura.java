import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestFactura {

    @Test
    public void testFacturaCajaRegistradora() {
        // NOTA: CajaRegistradora es el archivo consolidado que incluye
        // la funcionalidad de Factura e ItemFactura

        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main de CajaRegistradora
        CajaRegistradora.main(new String[] {});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();

        // Verificar que se imprimen facturas y el reporte
        assertTrue(salida.contains("LA PROVIDENCIA"), "Debe contener el nombre del comercio");
        assertTrue(salida.contains("REPORTE DIARIO"), "Debe contener el reporte diario");
        assertTrue(salida.contains("Ramo con mayor venta"), "Debe mostrar el ramo con mayor venta");
    }
}
