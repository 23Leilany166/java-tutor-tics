import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
    // Listas ordenadas
    private List<Empleado> empleados;
    private List<Departamento> departamentos;

    public Empresa() {
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }
    
    // Métodos para cargar datos iniciales (ordenados)
    public void addEmpleado(Empleado e) {
        empleados.add(e);
        Collections.sort(empleados);
    }
    public void addDepto(Departamento d) {
        departamentos.add(d);
        Collections.sort(departamentos);
    }

    /**
     * a) Dado el nombre de un empleado, proporciona su info.
     * (Usamos búsqueda lineal simple por claridad, aunque B-Search sería más eficiente)
     */
    public void buscarInfoEmpleado(String nombre) {
        Empleado emp = null;
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                emp = e;
                break;
            }
        }

        if (emp == null) {
            System.out.println("Empleado '" + nombre + "' no encontrado.");
            return;
        }

        Departamento dep = null;
        for (Departamento d : departamentos) {
            if (d.getClaveDept() == emp.getClaveDept()) {
                dep = d;
                break;
            }
        }
        
        System.out.println("--- Info Empleado ---");
        System.out.println("Nombre: " + emp.getNombre());
        System.out.printf("Sueldo: $%.2f\n", emp.getSueldo());
        if (dep != null) {
            System.out.println("Depto: " + dep.getNomDept());
            System.out.println("Jefe: " + dep.getNomJefe());
        } else {
            System.out.println("Depto: Clave " + emp.getClaveDept() + " (No encontrado)");
        }
    }

    /**
     * b) Dado el nombre de un departamento, obtiene el empleado que más gana.
     */
    public void getEmpleadoQueMasGana(String nomDepto) {
        // 1. Encontrar la clave del depto
        int claveDepto = -1;
        for (Departamento d : departamentos) {
            if (d.getNomDept().equalsIgnoreCase(nomDepto)) {
                claveDepto = d.getClaveDept();
                break;
            }
        }
        if (claveDepto == -1) {
            System.out.println("Departamento '" + nomDepto + "' no encontrado.");
            return;
        }

        // 2. Buscar al empleado con mayor sueldo en ese depto
        Empleado empleadoMax = null;
        double maxSueldo = -1;
        
        for (Empleado e : empleados) {
            if (e.getClaveDept() == claveDepto) {
                if (e.getSueldo() > maxSueldo) {
                    maxSueldo = e.getSueldo();
                    empleadoMax = e;
                }
            }
        }
        
        System.out.println("--- Empleado con Mayor Sueldo en " + nomDepto + " ---");
        if (empleadoMax != null) {
            System.out.printf("%s, con sueldo $%.2f\n", empleadoMax.getNombre(), empleadoMax.getSueldo());
        } else {
            System.out.println("No hay empleados registrados en ese depto.");
        }
    }
    
    /**
     * c) Da de alta un nuevo empleado (inserción ordenada) y actualiza depto.
     */
    public void altaEmpleado(Empleado nuevo) {
        // (Búsqueda binaria para ver si ya existe)
        int idx = Collections.binarySearch(empleados, nuevo);
        if (idx >= 0) {
            System.out.println("Error: El empleado '" + nuevo.getNombre() + "' ya existe.");
            return;
        }
        
        // Se inserta en la posición correcta para mantener el orden
        empleados.add(-(idx + 1), nuevo);
        System.out.println("Alta exitosa: " + nuevo.getNombre());

        // Actualizar contador en Departamento
        for (Departamento d : departamentos) {
            if (d.getClaveDept() == nuevo.getClaveDept()) {
                d.incrementarEmpleados();
                return;
            }
        }
    }

    public void imprimirListas() {
        System.out.println("\nLISTA EMPLEADOS:");
        empleados.forEach(System.out::println);
        System.out.println("\nLISTA DEPARTAMENTOS:");
        departamentos.forEach(System.out::println);
    }
    

    // --- Main para probar la clase Empresa ---
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();
        
        // Cargar Deptos
        miEmpresa.addDepto(new Departamento(10, "Ventas", 0, "Jefe Ventas"));
        miEmpresa.addDepto(new Departamento(20, "Sistemas", 0, "Jefe Sistemas"));

        // Cargar Empleados (El método los ordena por nombre)
        miEmpresa.addEmpleado(new Empleado("Ana", 10, 5, 20000));
        miEmpresa.addEmpleado(new Empleado("Luis", 20, 2, 30000));
        miEmpresa.addEmpleado(new Empleado("Pedro", 10, 8, 25000));

        System.out.println("--- Estado Inicial ---");
        miEmpresa.imprimirListas();

        System.out.println("\n--- Inciso a) Buscar a 'Luis' ---");
        miEmpresa.buscarInfoEmpleado("Luis");

        System.out.println("\n--- Inciso b) Empleado que más gana en 'Ventas' ---");
        miEmpresa.getEmpleadoQueMasGana("Ventas"); // Debe ser Pedro

        System.out.println("\n--- Inciso c) Alta de 'Carlos' ---");
        miEmpresa.altaEmpleado(new Empleado("Carlos", 20, 1, 28000));
        
        System.out.println("\n--- Estado Final ---");
        miEmpresa.imprimirListas();
    }
}