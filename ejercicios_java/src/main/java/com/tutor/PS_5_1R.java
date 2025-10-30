package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código gestiona un inventario de productos.
 * La lógica está separada en métodos que devuelven resultados,
 * haciéndolos testeables.
 */
public class PS_5_1R { // El nombre del archivo debe ser PS_5_1R.java

    // Definición de la estructura del registro Producto
    // Es 'static' para que 'main' y los tests puedan acceder a ella
    static class Producto {
        int clave;
        String descripcion;
        int existencia;
        int minExistencia;
        double precioUnitario;
    }

    /**
     * Busca un producto por su clave.
     * @param productos El arreglo de productos.
     * @param clave La clave a buscar.
     * @return El objeto Producto si se encuentra, o null si no.
     */
    public Producto buscarProducto(Producto[] productos, int clave) {
        for (Producto producto : productos) {
            if (producto.clave == clave) {
                return producto;
            }
        }
        return null; // No se encontró
    }

    /**
     * MÉTODO REFACTORIZADO (a): Venta de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String venderProducto(Producto[] productos, int clave, int cantidad) {
        Producto producto = buscarProducto(productos, clave);
        
        if (producto == null) {
            return "Producto no encontrado.";
        }
        
        if (producto.existencia < cantidad) {
            return "No hay suficiente existencia para realizar la venta.";
        }
        
        producto.existencia -= cantidad;
        
        if (producto.existencia < producto.minExistencia) {
            return "Venta realizada correctamente. ¡Atención! La existencia del producto está por debajo del mínimo.";
        }
        
        return "Venta realizada correctamente.";
    }

    /**
     * MÉTODO REFACTORIZADO (b): Reabastecimiento de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String reabastecerProducto(Producto[] productos, int clave, int cantidad) {
        Producto producto = buscarProducto(productos, clave);
        
        if (producto == null) {
            return "Producto no encontrado.";
        }

        if (cantidad <= 0) {
            return "La cantidad a reabastecer debe ser positiva.";
        }
        
        producto.existencia += cantidad;
        return "Reabastecimiento realizado correctamente.";
    }

    /**
     * MÉTODO REFACTORIZADO (c): Actualizar el precio de un producto.
     * @return Un String con el mensaje de resultado.
     */
    public String actualizarPrecioProducto(Producto[] productos, int clave, double porcentaje) {
        Producto producto = buscarProducto(productos, clave);
        
        if (producto == null) {
            return "Producto no encontrado.";
        }
        
        if (porcentaje <= -100) {
            return "El porcentaje de aumento no puede ser -100% o menor.";
        }

        producto.precioUnitario *= (1 + porcentaje / 100.0);
        return "Precio actualizado correctamente.";
    }

    /**
     * MÉTODO REFACTORIZADO (d): Informar sobre un producto.
     * @return El objeto Producto si se encuentra, o null.
     */
    public Producto informarProducto(Producto[] productos, int clave) {
        return buscarProducto(productos, clave);
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama a los métodos de lógica.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS_5_1R gestion = new PS_5_1R(); // Instancia de la clase

        System.out.print("Ingrese la cantidad de productos a gestionar (N): ");
        int N = sc.nextInt();

        Producto[] productos = new Producto[N];

        // Inicialización de los productos
        for (int i = 0; i < N; i++) {
            productos[i] = new Producto(); // Importante: crear el objeto
            System.out.println("\nIngrese los datos del producto " + (i + 1) + ":");
            System.out.print("Clave: ");
            productos[i].clave = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            System.out.print("Descripción: ");
            productos[i].descripcion = sc.nextLine();
            System.out.print("Existencia: ");
            productos[i].existencia = sc.nextInt();
            System.out.print("Mínimo a mantener en existencia: ");
            productos[i].minExistencia = sc.nextInt();
            System.out.print("Precio unitario: ");
            productos[i].precioUnitario = sc.nextDouble();
        }

        // Menú de operaciones
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("a) Venta de un producto");
            System.out.println("b) Reabastecimiento de un producto");
            System.out.println("c) Actualizar el precio de un producto");
            System.out.println("d) Informar sobre un producto");
            System.out.println("e) Salir");
            System.out.print("Opción: ");
            char opcion = sc.next().charAt(0);
            
            int clave, cantidad;
            double porcentaje;
            String resultadoStr;

            switch (opcion) {
                case 'a':
                    System.out.print("Ingrese la clave del producto: "); clave = sc.nextInt();
                    System.out.print("Ingrese la cantidad vendida: "); cantidad = sc.nextInt();
                    // Llama al método lógico y luego imprime el resultado
                    resultadoStr = gestion.venderProducto(productos, clave, cantidad);
                    System.out.println(resultadoStr);
                    break;
                case 'b':
                    System.out.print("Ingrese la clave del producto: "); clave = sc.nextInt();
                    System.out.print("Ingrese la cantidad comprada: "); cantidad = sc.nextInt();
                    resultadoStr = gestion.reabastecerProducto(productos, clave, cantidad);
                    System.out.println(resultadoStr);
                    break;
                case 'c':
                    System.out.print("Ingrese la clave del producto: "); clave = sc.nextInt();
                    System.out.print("Ingrese el porcentaje de aumento: "); porcentaje = sc.nextDouble();
                    resultadoStr = gestion.actualizarPrecioProducto(productos, clave, porcentaje);
                    System.out.println(resultadoStr);
                    break;
                case 'd':
                    System.out.print("Ingrese la clave del producto: "); clave = sc.nextInt();
                    // Llama al método lógico
                    Producto p = gestion.informarProducto(productos, clave);
                    // El main se encarga de imprimir
                    if (p != null) {
                        System.out.println("Información del producto:");
                        System.out.println("Clave: " + p.clave);
                        System.out.println("Descripción: " + p.descripcion);
                        System.out.println("Existencia: " + p.existencia);
                        System.out.println("Mínimo a mantener: " + p.minExistencia);
                        System.out.println("Precio unitario: " + p.precioUnitario);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 'e':
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}