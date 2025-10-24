/*
Una compañía distribuye N productos a distintos comercios de la ciudad. Para ello almacena en un arreglo toda la información relacionada a su mercancía:
• Clave.
• Descripción.
• Existencia.
• Mínimo a mantener en existencia.
• Precio unitario.
*/
package c.PS_5_1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PS_5_1 {

    // Definición de la estructura del registro Producto
    static class Producto {
        int clave;
        String descripcion;
        int existencia;
        int minExistencia;
        double precioUnitario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos a gestionar (N): ");
        int N = sc.nextInt();

        Producto[] productos = new Producto[N];

        // Inicialización de los productos
        for (int i = 0; i < N; i++) {
            productos[i] = new Producto();
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

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("a) Venta de un producto");
            System.out.println("b) Reabastecimiento de un producto");
            System.out.println("c) Actualizar el precio de un producto");
            System.out.println("d) Informar sobre un producto");
            System.out.println("e) Salir");
            System.out.print("Opción: ");
            char opcion = sc.next().charAt(0);
            int clave;
            int cantidad;
            double porcentaje;

            switch (opcion) {
                case 'a':
                    System.out.print("Ingrese la clave del producto: ");
                    clave = sc.nextInt();
                    System.out.print("Ingrese la cantidad vendida: ");
                    cantidad = sc.nextInt();
                    venderProducto(productos, clave, cantidad);
                    break;
                case 'b':
                    System.out.print("Ingrese la clave del producto: ");
                    clave = sc.nextInt();
                    System.out.print("Ingrese la cantidad comprada: ");
                    cantidad = sc.nextInt();
                    reabastecerProducto(productos, clave, cantidad);
                    break;
                case 'c':
                    System.out.print("Ingrese la clave del producto: ");
                    clave = sc.nextInt();
                    System.out.print("Ingrese el porcentaje de aumento: ");
                    porcentaje = sc.nextDouble();
                    actualizarPrecioProducto(productos, clave, porcentaje);
                    break;
                case 'd':
                    System.out.print("Ingrese la clave del producto: ");
                    clave = sc.nextInt();
                    informarProducto(productos, clave);
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

    // Operación para vender un producto
    static void venderProducto(Producto[] productos, int clave, int cantidad) {
        for (Producto producto : productos) {
            if (producto.clave == clave) {
                if (producto.existencia >= cantidad) {
                    producto.existencia -= cantidad;
                    System.out.println("Venta realizada correctamente.");
                    if (producto.existencia < producto.minExistencia) {
                        System.out.println("¡Atención! La existencia del producto está por debajo del mínimo.");
                    }
                    return;
                } else {
                    System.out.println("No hay suficiente existencia para realizar la venta.");
                    return;
                }
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Operación para reabastecer un producto
    static void reabastecerProducto(Producto[] productos, int clave, int cantidad) {
        for (Producto producto : productos) {
            if (producto.clave == clave) {
                producto.existencia += cantidad;
                System.out.println("Reabastecimiento realizado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Operación para actualizar el precio de un producto
    static void actualizarPrecioProducto(Producto[] productos, int clave, double porcentaje) {
        for (Producto producto : productos) {
            if (producto.clave == clave) {
                producto.precioUnitario *= (1 + porcentaje / 100);
                System.out.println("Precio actualizado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Operación para informar sobre un producto
    static void informarProducto(Producto[] productos, int clave) {
        for (Producto producto : productos) {
            if (producto.clave == clave) {
                System.out.println("Información del producto:");
                System.out.println("Clave: " + producto.clave);
                System.out.println("Descripción: " + producto.descripcion);
                System.out.println("Existencia: " + producto.existencia);
                System.out.println("Mínimo a mantener en existencia: " + producto.minExistencia);
                System.out.println("Precio unitario: " + producto.precioUnitario);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    
}
