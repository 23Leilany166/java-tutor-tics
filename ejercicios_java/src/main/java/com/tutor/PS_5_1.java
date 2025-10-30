package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_5_1 { // El nombre del archivo debe ser PS_5_1.java

    // Definición del registro Producto (No modificar)
    static class Producto {
        int clave;
        String descripcion;
        int existencia;
        int minExistencia;
        double precioUnitario;
    }

    /**
     * TAREA: Busca un producto por su clave.
     * @param productos El arreglo de productos.
     * @param clave La clave a buscar.
     * @return El objeto Producto si se encuentra, o null si no.
     */
    public Producto buscarProducto(Producto[] productos, int clave) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (Búsqueda) -----
        
        // Escribe un bucle 'for' que itere sobre 'productos'
        // Si 'producto.clave == clave', devuelve 'producto'
        
        return null; // Devuelve null si no se encuentra
        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (Búsqueda) -----
    }

    /**
     * TAREA (a): Venta de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String venderProducto(Producto[] productos, int clave, int cantidad) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (Venta) -----
        
        // 1. Usa 'buscarProducto' para encontrar el producto
        Producto producto = buscarProducto(productos, clave);
        
        // 2. Si es null, devuelve "Producto no encontrado."
        
        // 3. Si la existencia es menor a la cantidad, devuelve "No hay suficiente..."
        
        // 4. Resta la cantidad a la existencia
        
        // 5. Comprueba si la nueva existencia está bajo el mínimo
        //    Si lo está, devuelve "Venta realizada... ¡Atención!..."
        
        // 6. Si no, devuelve "Venta realizada correctamente."
        
        return "PENDIENTE"; // Valor provisional
        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (Venta) -----
    }

    /**
     * TAREA (b): Reabastecimiento de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String reabastecerProducto(Producto[] productos, int clave, int cantidad) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (Reabastecer) -----
        
        // 1. Busca el producto
        // 2. Si no se encuentra, devuelve "Producto no encontrado."
        // 3. Si la cantidad es <= 0, devuelve un mensaje de error
        // 4. Suma la cantidad a la existencia
        // 5. Devuelve "Reabastecimiento realizado correctamente."
        
        return "PENDIENTE"; // Valor provisional
        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (Reabastecer) -----
    }

    /**
     * TAREA (c): Actualizar el precio de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String actualizarPrecioProducto(Producto[] productos, int clave, double porcentaje) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (Actualizar Precio) -----
        
        // 1. Busca el producto
        // 2. Si no se encuentra, devuelve "Producto no encontrado."
        // 3. Calcula el nuevo precio ( precio = precio * (1 + porcentaje / 100.0) )
        // 4. Asigna el nuevo precio al producto
        // 5. Devuelve "Precio actualizado correctamente."

        return "PENDIENTE"; // Valor provisional
        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (Actualizar Precio) -----
    }

    /**
     * TAREA (d): Informar sobre un producto.
     * @return El objeto Producto si se encuentra, o null.
     */
    public Producto informarProducto(Producto[] productos, int clave) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE (Informar) -----
        
        // 1. Llama a 'buscarProducto' y devuelve el resultado
        
        return null; // Valor provisional
        // ----- TERMINA CÓDIGO DEL ESTUDIANTE (Informar) -----
    }

    /**
     * MÉTODO MAIN (SOLO PARA PRUEBAS MANUALES DEL ESTUDIANTE)
     * El test automático IGNORARÁ este método.
     */
    public static void main(String[] args) {
        // (El método main es idéntico al del archivo refactorizado)
        // (Se omite por brevedad, pero debe incluirse aquí)
    }
}