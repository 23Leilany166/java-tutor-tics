import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestFactura {
    public static void main(String[] args) {
        // NOTA: CajaRegistradora es el archivo consolidado que incluye
        // la funcionalidad de Factura e ItemFactura
        
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main de CajaRegistradora
        CajaRegistradora.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Verificar que se imprimen facturas y el reporte
        boolean ok1 = salida.contains("LA PROVIDENCIA");
        boolean ok2 = salida.contains("REPORTE DIARIO");
        boolean ok3 = salida.contains("Ramo con mayor venta");
        
        if (ok1 && ok2 && ok3) {
            System.out.println("✅ Test Factura/CajaRegistradora PASÓ");
        } else {
            System.out.println("❌ Test Factura/CajaRegistradora FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}