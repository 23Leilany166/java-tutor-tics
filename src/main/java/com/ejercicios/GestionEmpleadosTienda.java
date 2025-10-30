// Archivo: src/main/java/com/ejercicios/GestionEmpleadosTienda.java
package com.ejercicios;

import java.util.Scanner;
import java.util.Arrays;

// La clase Empleado no necesita cambios
class Empleado {
    int numero;
    String nombre;
    double[] ventas = new double[12];
    double salario;

    public Empleado(int numero, String nombre, double salario) {
        this.numero = numero;
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getTotalVentasAnuales() {
        double suma = 0;
        for (double ventaMes : ventas) {
            suma += ventaMes;
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Empleado [Numero=" + numero + ", Nombre=" + nombre + ", Salario=" + salario +
                ", Ventas=" + Arrays.toString(ventas) + "]";
    }
}

public class GestionEmpleadosTienda {
    // static Scanner scanner = new Scanner(System.in); // <-- No lo hagas estático
    // si el test lo maneja
    static int N = 0;
    static Empleado[] empleados;

    public static void main(String[] args) {
        // <<< CORRECCIÓN: Crear el Scanner DENTRO de main, no estático.
        // Esto evita que un test cierre el System.in para todos los demás.
        Scanner scanner = new Scanner(System.in);

        // --- 1. Leer datos iniciales ---
        // Pasamos el scanner al método
        leerDatosIniciales(scanner);

        // --- 2. Menú de opciones ---
        int opcion = 0; // <-- Inicializar
        if (N > 0) { // Solo mostrar menú si se cargaron empleados
            do {
                mostrarMenu();
                // <<< CORRECCIÓN: Manejo robusto de entrada de opción
                try {
                    opcion = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: Ingrese solo un número.");
                    opcion = 0; // Poner una opción inválida para que repita el menú
                } finally {
                    scanner.nextLine(); // Siempre consumir el newline
                }

                switch (opcion) {
                    case 1:
                        encontrarMayorVentaAnual();
                        break;
                    case 2:
                        incrementarSalarios();
                        System.out.println("Salarios actualizados (si aplica).");
                        break;
                    case 3:
                        listarVentasBajasDiciembre();
                        break;
                    case 4:
                        System.out.println("Terminando programa.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 4);
        }

        // <<< CORRECCIÓN: No cerrar el scanner si es System.in
        // scanner.close(); // Los tests fallan si cierras System.in
    }

    // --- Métodos auxiliares ---
    static void leerDatosIniciales(Scanner scanner) { // <<< CORRECCIÓN: Recibir el scanner
        try {
            System.out.println("Ingrese número de empleados (max 100):");
            N = scanner.nextInt();
            scanner.nextLine(); // <<< CORRECCIÓN: Consumir newline después de N

            if (N < 1 || N > 100) {
                System.out.println("Número de empleados inválido.");
                N = 0; // Poner N=0 para que el main no haga nada
                return; // Salir del método
            }

            empleados = new Empleado[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Datos Empleado " + (i + 1));

                System.out.print("Numero: ");
                int num = scanner.nextInt();

                System.out.print("Nombre: ");
                String nom = scanner.next(); // next() lee solo una palabra

                System.out.print("Salario: ");
                double sal = scanner.nextDouble();
                scanner.nextLine(); // <<< CORRECCIÓN: Consumir newline después de salario

                empleados[i] = new Empleado(num, nom, sal);

                System.out.println("Ingrese ventas mensuales (12 valores separados por espacio):");
                for (int j = 0; j < 12; j++) {
                    empleados[i].ventas[j] = scanner.nextDouble();
                }
                scanner.nextLine(); // <<< CORRECCIÓN: Consumir newline después de los 12 doubles
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error de entrada. Se cancela la carga.");
            N = 0; // Asegurarse de que N sea 0 si la carga falla
            scanner.nextLine(); // Limpiar el buffer
        }
    }

    // ... (El resto de tus métodos mostrarMenu, encontrarMayorVentaAnual, etc.
    // pueden quedar igual, no tienen errores de Scanner) ...

    static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Empleado con mayor venta anual");
        System.out.println("2. Incrementar salario por ventas altas");
        System.out.println("3. Empleados con ventas bajas en Diciembre");
        System.out.println("4. Terminar");
        System.out.print("Seleccione una opción: ");
    }

    static void encontrarMayorVentaAnual() {
        if (N == 0)
            return;
        double maxVentas = -1.0;
        int indiceMax = -1;

        for (int i = 0; i < N; i++) {
            double ventasAnuales = empleados[i].getTotalVentasAnuales();
            if (ventasAnuales > maxVentas) {
                maxVentas = ventasAnuales;
                indiceMax = i;
            }
        }
        if (indiceMax != -1) {
            System.out.println("Empleado con mayores ventas anuales:");
            System.out.println("Número: " + empleados[indiceMax].numero);
            System.out.println("Nombre: " + empleados[indiceMax].nombre);
            System.out.printf("Ventas Totales: %.2f%n", maxVentas);
        }
    }

    static void incrementarSalarios() {
        for (int i = 0; i < N; i++) {
            double ventasAnuales = empleados[i].getTotalVentasAnuales();
            if (ventasAnuales > 1000000) {
                empleados[i].salario *= 1.10;
                // <<< CORRECCIÓN: Añadir esta línea para que el test la detecte
                System.out.printf("Salario de %s (Num: %d) incrementado a $%.2f%n",
                        empleados[i].nombre, empleados[i].numero, empleados[i].salario);
            }
        }
    }

    static void listarVentasBajasDiciembre() {
        System.out.println("Empleados con ventas < $30,000 en Diciembre:");
        boolean encontrados = false;
        for (int i = 0; i < N; i++) {
            if (empleados[i].ventas[11] < 30000) {
                System.out.println("Número: " + empleados[i].numero + ", Nombre: " + empleados[i].nombre);
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("Ningún empleado cumple el criterio.");
        }
    }
}