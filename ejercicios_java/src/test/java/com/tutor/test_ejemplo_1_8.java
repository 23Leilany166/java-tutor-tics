package com.tutor; // Mismo paquete que el otro archivo

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase prueba la clase Ejemplo_1_8R.
 * El nombre debe coincidir con el archivo de test.
 */
public class test_ejemplo_1_8 { // Asumiendo que tu archivo se llama Ejemplo_1_8RTest.java

    @Test
    void testPromedioSimple() {
        // 1. Preparación: Creamos una instancia de la clase que queremos probar.
        Ejemplo_1_8_R ejercicio = new Ejemplo_1_8_R();
        
        // 2. Ejecución: Llamamos al método lógico con datos de prueba.
        double resultado = ejercicio.calcularPromedio(10.0, 8.0, 6.0, 10.0, 8.0);
        
        // 3. Verificación: Comprobamos si el resultado es el esperado (8.4).
        assertEquals(8.4, resultado, 0.001);
    }

    @Test
    void testPromedioConDecimales() {
        Ejemplo_1_8_R ejercicio = new Ejemplo_1_8_R();
        double resultado = ejercicio.calcularPromedio(8.5, 9.5, 7.0, 10.0, 8.0);
        assertEquals(8.6, resultado, 0.001);
    }

    @Test
    void testPromedioTodosCeros() {
        Ejemplo_1_8_R ejercicio = new Ejemplo_1_8_R();
        double resultado = ejercicio.calcularPromedio(0.0, 0.0, 0.0, 0.0, 0.0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void testPromedioLanzaExcepcionConNegativos() {
        Ejemplo_1_8_R ejercicio = new Ejemplo_1_8_R();
        
        // Verificamos que el método lance la excepción que definimos
        // si le pasamos un número negativo.
        assertThrows(IllegalArgumentException.class, () -> {
            ejercicio.calcularPromedio(10.0, -2.0, 8.0, 9.0, 10.0);
        });
    }
}