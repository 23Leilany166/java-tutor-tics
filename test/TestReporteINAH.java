import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestReporteINAH {
    public static void main(String[] args) {
        // Capturar salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main del ejercicio
        ReporteINAH.main(new String[]{});

        // Restaurar salida
        System.setOut(originalOut);

        // Verificar resultado
        String salida = outContent.toString();
        
        // Verificar valores esperados según los datos de prueba:
        // a) Año con más visitas (Centro 43): 1998
        // b) Centro con más visitas (1994): 10
        // c) Mes con más visitas (1995): 8
        boolean ok1 = salida.contains("1998");
        boolean ok2 = salida.contains(": 10");
        boolean ok3 = salida.contains(": 8");
        
        if (ok1 && ok2 && ok3) {
            System.out.println("✅ Test ReporteINAH PASÓ");
        } else {
            System.out.println("❌ Test ReporteINAH FALLÓ");
            System.out.println("Salida: " + salida);
        }
    }
}
