import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestAnalizadorSueldos {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        AnalizadorSueldos.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // El ejercicio usa {1200.00, 3950.00, 7575.00, 980.00, 1050.70}
        // Promedio = 2951.14
        // Sueldos sobre promedio: 2 (3950.00 y 7575.00)
        boolean ok1 = salida.contains("2951.14");
        boolean ok2 = salida.contains("2");
        
        if (ok1 && ok2) {
            System.out.println("✅ Test AnalizadorSueldos PASÓ");
        } else {
            System.out.println("❌ Test AnalizadorSueldos FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}