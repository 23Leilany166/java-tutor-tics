/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
    import java.util.Scanner;
/**
 *
 * @author Arantza
 */
public class PS_4_36 {

    public static void main(String[] args) {
        final int MAX_PRODUCTOS = 100;
        int[] clavesProductos = new int[MAX_PRODUCTOS];
        int[] cantidadesProductos = new int[MAX_PRODUCTOS];
        int numProductos;

        Scanner scanner = new Scanner(System.in);

        // Paso 1: Leer el número actual de productos en existencia
        System.out.print("Ingrese el número actual de productos en existencia: ");
        numProductos = scanner.nextInt();

        // Paso 2: Leer los arreglos
        System.out.println("Ingrese las claves de los productos:");
        for (int i = 0; i < numProductos; i++) {
            clavesProductos[i] = scanner.nextInt();
        }

        System.out.println("Ingrese las cantidades de los productos:");
        for (int i = 0; i < numProductos; i++) {
            cantidadesProductos[i] = scanner.nextInt();
        }

        // Paso 3: Actualizar los arreglos según las transacciones
        boolean finDatos = false;
        while (!finDatos) {
            System.out.println("Ingrese el tipo de operación (C o V), la clave del producto y la cantidad (X, 0, 0 para terminar):");
            char tipoOperacion = scanner.next().charAt(0);
            int claveProducto = scanner.nextInt();
            int cantidad = scanner.nextInt();

            switch (tipoOperacion) {
                case 'C':
                    // Compra
                    int indiceCompra = buscarProducto(clavesProductos, numProductos, claveProducto);
                    if (indiceCompra != -1) {
                        cantidadesProductos[indiceCompra] += cantidad;
                    } else {
                        // El producto no existe, se debe incorporar
                        if (numProductos < MAX_PRODUCTOS) {
                            clavesProductos[numProductos] = claveProducto;
                            cantidadesProductos[numProductos] = cantidad;
                            numProductos++;
                        } else {
                            System.out.println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
                        }
                    }
                    break;

                case 'V':
                    // Venta
                    int indiceVenta = buscarProducto(clavesProductos, numProductos, claveProducto);
                    if (indiceVenta != -1) {
                        if (cantidadesProductos[indiceVenta] >= cantidad) {
                            cantidadesProductos[indiceVenta] -= cantidad;
                        } else {
                            System.out.println("No hay suficiente cantidad del producto.");
                        }
                    } else {
                        System.out.println("El producto no existe.");
                    }
                    break;

                case 'X':
                    // Fin de datos
                    finDatos = true;
                    break;

                default:
                    System.out.println("Operación inválida.");
                    break;
            }
        }

        // Mostrar los productos y sus cantidades actualizadas
        System.out.println("\nInventario actualizado:");
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Producto " + clavesProductos[i] + ": " + cantidadesProductos[i] + " unidades");
        }

        scanner.close();
    }

    private static int buscarProducto(int[] clavesProductos, int numProductos, int claveProducto) {
        for (int i = 0; i < numProductos; i++) {
            if (clavesProductos[i] == claveProducto) {
                return i; // Se encontró el producto, retorna su índice en el arreglo
            }
        }
        return -1; // El producto no existe
    }
}
