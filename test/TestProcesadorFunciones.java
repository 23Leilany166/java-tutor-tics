import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestProcesadorFunciones {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        ProcesadorFunciones.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // El ejercicio procesa 4 casos:
        // Opción 1, V=8 -> 100*8 = 800.0
        // Opción 7, V=6 -> 0.0 (default)
        // Opción 3, V=4 -> 100/4 = 25.0
        // Opción 2, V=3 -> 100^3 = 1000000.0
        boolean ok1 = salida.contains("800.0");
        boolean ok2 = salida.contains("0.0");
        boolean ok3 = salida.contains("25.0");
        boolean ok4 = salida.contains("1000000.0");
        
        if (ok1 && ok2 && ok3 && ok4) {
            System.out.println("✅ Test ProcesadorFunciones PASÓ");
        } else {
            System.out.println("❌ Test ProcesadorFunciones FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}