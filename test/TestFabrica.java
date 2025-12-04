import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestFabrica {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Fabrica.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Verificar valores esperados:
        // a) Producto 0: 3300.0, Producto 1: 3600.0
        // b) Costo Total: 6900.00
        // c) Producto más vendido: 0
        boolean ok1 = salida.contains("3300.0") && salida.contains("3600.0");
        boolean ok2 = salida.contains("6900.00");
        boolean ok3 = salida.contains("índice): 0");
        
        if (ok1 && ok2 && ok3) {
            System.out.println("✅ Test Fabrica PASÓ");
        } else {
            System.out.println("❌ Test Fabrica FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}