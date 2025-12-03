// Archivo: ConversorUnidades.java
import java.util.Scanner;

public class ConversorUnidades {

    // Constantes de conversión
    private static final double METROS_CUADRADOS_POR_ACRE = 4047.0;
    private static final double METROS_CUADRADOS_POR_HECTAREA = 10000.0;

    /**
     * Constructor privado para prevenir que esta clase utilitaria
     * sea instanciada.
     */
    private ConversorUnidades() {}

    /**
     * Convierte un valor de acres a hectáreas.
     */
    public static double acresAhectareas(double acres) {
        double metrosCuadrados = acres * METROS_CUADRADOS_POR_ACRE;
        return metrosCuadrados / METROS_CUADRADOS_POR_HECTAREA;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la extensión del campo en acres: ");
        double acres = scanner.nextDouble();
        
        double hectareas = ConversorUnidades.acresAhectareas(acres);
        
        System.out.printf("%.2f acres equivalen a %.4f hectáreas.\n", acres, hectareas);
        
        scanner.close();
    }
}