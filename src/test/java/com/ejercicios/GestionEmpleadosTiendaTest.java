// Archivo: src/test/java/com/ejercicios/GestionEmpleadosTiendaTest.java
package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse; // Importar

// Asumo que tienes un BaseConsoleTest que maneja el I/O
public class GestionEmpleadosTiendaTest extends BaseConsoleTest {

        @AfterEach
        public void resetGestion() {
                GestionEmpleadosTienda.N = 0;
                GestionEmpleadosTienda.empleados = null;
        }

        @Test
        @DisplayName("Flujo completo: Carga, Mayor Venta, Ventas Bajas y Salir")
        public void testFlujoCompleto() {
                String nEmpleados = "2\n";

                // Empleado 1: Ana (Ventas bajas en Dic)
                String emp1_datos = "101\nAna\n50000\n"; // Num, Nom, Sal
                String emp1_ventas = "10000 10000 10000 10000 10000 10000 " +
                                "10000 10000 10000 10000 10000 5000\n"; // 12 ventas

                // Empleado 2: Beto (Mayor venta anual, > 1M)
                String emp2_datos = "102\nBeto\n60000\n"; // Num, Nom, Sal
                String emp2_ventas = "100000 100000 100000 100000 100000 100000 " +
                                "100000 100000 100000 100000 100000 50000\n"; // 12 ventas

                String menuOpciones = "1\n" + "3\n" + "4\n";

                final String input = nEmpleados + emp1_datos + emp1_ventas +
                                emp2_datos + emp2_ventas + menuOpciones;

                provideInput(input);
                GestionEmpleadosTienda.main(new String[0]);
                String output = getOutput();

                // Verificar Opción 1 (Mayor Venta)
                assertTrue(output.contains("Nombre: Beto") &&
                                output.contains("Ventas Totales: 1150000.00"), // <<< CORRECCIÓN: Asegurar formato
                                "Error en la Opcion 1 (Mayor Venta Anual)");

                // Verificar Opción 3 (Ventas Bajas Diciembre)
                assertTrue(output.contains("Número: 101, Nombre: Ana"),
                                "Error en la Opcion 3 (Ventas Bajas Diciembre)");
                assertFalse(output.contains("Ningún empleado cumple el criterio."), // <<< CORRECIÓN: Usar assertFalse
                                "Error en Opcion 3, no debería mostrar 'Ningún empleado'");
        }

        @Test
        @DisplayName("Prueba el incremento de salario")
        public void testIncrementoSalario() {
                String nEmpleados = "1\n";
                String emp1_datos = "103\nCarlos\n1000.0\n"; // Num, Nom, Sal

                // <<< CORRECCIÓN: Faltaba un número. Ahora hay 12. (Total 1,000,001)
                String emp1_ventas = "1000000 1 0 0 0 0 0 0 0 0 0 0\n";

                String menuOpciones = "2\n4\n";
                final String input = nEmpleados + emp1_datos + emp1_ventas + menuOpciones;

                provideInput(input);
                GestionEmpleadosTienda.main(new String[0]);
                String output = getOutput();

                // Verificar que el main imprimió el mensaje de incremento
                assertTrue(output.contains("Salario de Carlos (Num: 103) incrementado"),
                                "No se mostró el mensaje de actualización de salarios.");

                // Verificar el estado estático
                assertEquals(1100.0, GestionEmpleadosTienda.empleados[0].salario, 0.01,
                                "El salario del empleado no se incrementó correctamente en el array.");
        }
}