import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para verificar el funcionamiento de CuadradoCubo.
 */
public class CuadradoCuboTest {

    // Streams para capturar la salida de la consola
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    /**
     * Este método se ejecuta antes de cada prueba.
     * Redirige la salida estándar (System.out) para poder capturarla.
     */
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Este método se ejecuta después de cada prueba.
     * Restaura los streams originales de entrada y salida.
     */
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    /**
     * Simula la ejecución del programa con la entrada proporcionada.
     * @param input El texto que simula la entrada del usuario.
     */
    private void runMain(String input) {
        // Preparamos un stream de entrada con el dato que queremos probar
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Redirigimos la entrada estándar para que lea de nuestro stream
        CuadradoCubo.main(null); // Ejecutamos el método main del programa
    }


    @Test
    @DisplayName("Prueba con un número entero positivo")
    void testCalculoConNumeroPositivo() {
        // 1. Preparación (Arrange)
        String input = "5"; // Simulamos que el usuario teclea "5"
        String separador = System.lineSeparator(); // Para asegurar que los saltos de línea son correctos en cualquier S.O.
        String expectedOutput = "Introduce un número entero: " +
                                "El cuadrado de 5 es: 25.0" + separador +
                                "El cubo de 5 es: 125.0" + separador;

        // 2. Actuación (Act)
        runMain(input);

        // 3. Verificación (Assert)
        // Comparamos si la salida capturada es igual a la que esperábamos.
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n").replace("\r", "\n"));
    }

    @Test
    @DisplayName("Prueba con el número cero")
    void testCalculoConCero() {
        // Arrange
        String input = "0";
        String separador = System.lineSeparator();
        String expectedOutput = "Introduce un número entero: " +
                                "El cuadrado de 0 es: 0.0" + separador +
                                "El cubo de 0 es: 0.0" + separador;

        // Act
        runMain(input);

        // Assert
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n").replace("\r", "\n"));
    }

    @Test
    @DisplayName("Prueba con un número entero negativo")
    void testCalculoConNumeroNegativo() {
        // Arrange
        String input = "-4";
        String separador = System.lineSeparator();
        String expectedOutput = "Introduce un número entero: " +
                                "El cuadrado de -4 es: 16.0" + separador +
                                "El cubo de -4 es: -64.0" + separador;

        // Act
        runMain(input);

        // Assert
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n").replace("\r", "\n"));
    }
}