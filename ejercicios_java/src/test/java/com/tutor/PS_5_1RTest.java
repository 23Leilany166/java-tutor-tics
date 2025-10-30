package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; // Importante para la configuración
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase PS_5_1R.
 */
public class PS_5_1RTest { // El nombre del archivo debe ser PS_5_1RTest.java

    // Declaramos las variables de prueba como campos de la clase
    private PS_5_1R gestion;
    private PS_5_1R.Producto[] productos;

    /**
     * Este método se ejecuta ANTES de CADA prueba (@Test).
     * Asegura que cada prueba comience con datos "limpios".
     */
    @BeforeEach
    void setUp() {
        // 1. Inicializar la clase de lógica
        gestion = new PS_5_1R();
        
        // 2. Crear el arreglo de productos de prueba
        productos = new PS_5_1R.Producto[2];
        
        // Producto 1 (Martillo)
        productos[0] = new PS_5_1R.Producto();
        productos[0].clave = 101;
        productos[0].descripcion = "Martillo";
        productos[0].existencia = 20;
        productos[0].minExistencia = 5;
        productos[0].precioUnitario = 150.0;
        
        // Producto 2 (Clavos)
        productos[1] = new PS_5_1R.Producto();
        productos[1].clave = 102;
        productos[1].descripcion = "Clavos (caja)";
        productos[1].existencia = 100;
        productos[1].minExistencia = 20;
        productos[1].precioUnitario = 5.0;
    }

    // --- Pruebas para Venta (a) ---
    
    @Test
    void testVenderProductoExitoso() {
        String msg = gestion.venderProducto(productos, 101, 5);
        assertEquals("Venta realizada correctamente.", msg);
        assertEquals(15, productos[0].existencia, "La existencia debe reducirse a 15");
    }

    @Test
    void testVenderProductoYActivarAlertaMinimo() {
        String msg = gestion.venderProducto(productos, 101, 16); // Existencia baja a 4 (min es 5)
        assertEquals("Venta realizada correctamente. ¡Atención! La existencia del producto está por debajo del mínimo.", msg);
        assertEquals(4, productos[0].existencia, "La existencia debe reducirse a 4");
    }

    @Test
    void testVenderProductoSinExistencia() {
        String msg = gestion.venderProducto(productos, 101, 21); // Intenta vender más de lo que hay
        assertEquals("No hay suficiente existencia para realizar la venta.", msg);
        assertEquals(20, productos[0].existencia, "La existencia no debe cambiar si la venta falla");
    }

    // --- Pruebas para Reabastecer (b) ---
    
    @Test
    void testReabastecerProductoExitoso() {
        String msg = gestion.reabastecerProducto(productos, 102, 50);
        assertEquals("Reabastecimiento realizado correctamente.", msg);
        assertEquals(150, productos[1].existencia, "La existencia debe aumentar a 150");
    }

    @Test
    void testReabastecerProductoNoEncontrado() {
        String msg = gestion.reabastecerProducto(productos, 999, 50); // Clave incorrecta
        assertEquals("Producto no encontrado.", msg);
    }
    
    @Test
    void testReabastecerCantidadInvalida() {
        String msg = gestion.reabastecerProducto(productos, 102, 0); // Cantidad 0
        assertEquals("La cantidad a reabastecer debe ser positiva.", msg);
        assertEquals(100, productos[1].existencia, "La existencia no debe cambiar");
    }

    // --- Pruebas para Actualizar Precio (c) ---

    @Test
    void testActualizarPrecioAumento() {
        String msg = gestion.actualizarPrecioProducto(productos, 101, 10.0); // Aumento del 10%
        assertEquals("Precio actualizado correctamente.", msg);
        assertEquals(165.0, productos[0].precioUnitario, 0.001, "El precio (150) debe aumentar 10% a 165.0");
    }
    
    @Test
    void testActualizarPrecioReduccion() {
        String msg = gestion.actualizarPrecioProducto(productos, 102, -20.0); // Descuento del 20%
        assertEquals("Precio actualizado correctamente.", msg);
        assertEquals(4.0, productos[1].precioUnitario, 0.001, "El precio (5.0) debe reducirse 20% a 4.0");
    }
    
    // --- Pruebas para Informar (d) ---
    
    @Test
    void testInformarProductoEncontrado() {
        PS_5_1R.Producto p = gestion.informarProducto(productos, 101);
        assertNotNull(p, "Debe encontrar el producto 101");
        assertEquals("Martillo", p.descripcion, "La descripción debe ser 'Martillo'");
    }

    @Test
    void testInformarProductoNoEncontrado() {
        PS_5_1R.Producto p = gestion.informarProducto(productos, 999);
        assertNull(p, "No debe encontrar el producto 999");
    }
}