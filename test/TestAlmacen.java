import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestAlmacen {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        Almacen.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Al final debe quedar [30, 10] después de eliminar el primer 10 y el 20
        boolean ok = salida.contains("[30, 10]");
        
        if (ok) {
            System.out.println("✅ Test Almacen PASÓ");
        } else {
            System.out.println("❌ Test Almacen FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}