// Archivo: Empresa.java
// Este archivo consolida toda la funcionalidad de Empresa, Empleado y Departamento

public class Empresa {
    public static void main(String[] args) {
        // ===== DATOS DE DEPARTAMENTOS (Arreglos paralelos) =====
        int[] deptoClave = new int[10]; // Clave del departamento
        String[] deptoNombre = new String[10]; // Nombre del departamento
        String[] deptoJefe = new String[10]; // Nombre del jefe
        int[] deptoNumEmpleados = new int[10]; // Número de empleados
        int numDeptos = 0; // Contador de departamentos

        // Cargar Departamento 1: Ventas
        deptoClave[numDeptos] = 10;
        deptoNombre[numDeptos] = "Ventas";
        deptoJefe[numDeptos] = "Jefe Ventas";
        deptoNumEmpleados[numDeptos] = 0;
        numDeptos++;

        // Cargar Departamento 2: Sistemas
        deptoClave[numDeptos] = 20;
        deptoNombre[numDeptos] = "Sistemas";
        deptoJefe[numDeptos] = "Jefe Sistemas";
        deptoNumEmpleados[numDeptos] = 0;
        numDeptos++;

        // ===== DATOS DE EMPLEADOS (Arreglos paralelos) =====
        String[] empNombre = new String[50]; // Nombre del empleado
        int[] empClaveDept = new int[50]; // Clave del departamento
        int[] empAntiguedad = new int[50]; // Años de antigüedad
        double[] empSueldo = new double[50]; // Sueldo
        int numEmpleados = 0; // Contador de empleados

        // Cargar Empleado 1: Ana
        empNombre[numEmpleados] = "Ana";
        empClaveDept[numEmpleados] = 10;
        empAntiguedad[numEmpleados] = 5;
        empSueldo[numEmpleados] = 20000;
        numEmpleados++;

        // Cargar Empleado 2: Luis
        empNombre[numEmpleados] = "Luis";
        empClaveDept[numEmpleados] = 20;
        empAntiguedad[numEmpleados] = 2;
        empSueldo[numEmpleados] = 30000;
        numEmpleados++;

        // Cargar Empleado 3: Pedro
        empNombre[numEmpleados] = "Pedro";
        empClaveDept[numEmpleados] = 10;
        empAntiguedad[numEmpleados] = 8;
        empSueldo[numEmpleados] = 25000;
        numEmpleados++;

        // ===== ESTADO INICIAL =====
        System.out.println("--- Estado Inicial ---");
        System.out.println("\nLISTA EMPLEADOS:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.printf("Empleado[Nombre: %s, Dept: %d, Sueldo: %.2f]\n",
                    empNombre[i], empClaveDept[i], empSueldo[i]);
        }
        System.out.println("\nLISTA DEPARTAMENTOS:");
        for (int i = 0; i < numDeptos; i++) {
            System.out.printf("Depto[Clave: %d, Nombre: %s, Jefe: %s]\n",
                    deptoClave[i], deptoNombre[i], deptoJefe[i]);
        }

        // ===== INCISO A) Buscar a 'Luis' =====
        System.out.println("\n--- Inciso a) Buscar a 'Luis' ---");
        String nombreBuscar = "Luis";
        int idxEmpleado = -1;

        // Buscar empleado por nombre
        for (int i = 0; i < numEmpleados; i++) {
            if (empNombre[i].equalsIgnoreCase(nombreBuscar)) {
                idxEmpleado = i;
                break;
            }
        }

        if (idxEmpleado == -1) {
            System.out.println("Empleado '" + nombreBuscar + "' no encontrado.");
        } else {
            // Buscar departamento
            int idxDepto = -1;
            for (int i = 0; i < numDeptos; i++) {
                if (deptoClave[i] == empClaveDept[idxEmpleado]) {
                    idxDepto = i;
                    break;
                }
            }

            System.out.println("--- Info Empleado ---");
            System.out.println("Nombre: " + empNombre[idxEmpleado]);
            System.out.printf("Sueldo: $%.2f\n", empSueldo[idxEmpleado]);
            if (idxDepto != -1) {
                System.out.println("Depto: " + deptoNombre[idxDepto]);
                System.out.println("Jefe: " + deptoJefe[idxDepto]);
            } else {
                System.out.println("Depto: Clave " + empClaveDept[idxEmpleado] + " (No encontrado)");
            }
        }

        // ===== INCISO B) Empleado que más gana en 'Ventas' =====
        System.out.println("\n--- Inciso b) Empleado que más gana en 'Ventas' ---");
        String nombreDepto = "Ventas";

        // 1. Encontrar la clave del depto
        int claveDepto = -1;
        for (int i = 0; i < numDeptos; i++) {
            if (deptoNombre[i].equalsIgnoreCase(nombreDepto)) {
                claveDepto = deptoClave[i];
                break;
            }
        }

        if (claveDepto == -1) {
            System.out.println("Departamento '" + nombreDepto + "' no encontrado.");
        } else {
            // 2. Buscar al empleado con mayor sueldo en ese depto
            int idxEmpleadoMax = -1;
            double maxSueldo = -1;

            for (int i = 0; i < numEmpleados; i++) {
                if (empClaveDept[i] == claveDepto) {
                    if (empSueldo[i] > maxSueldo) {
                        maxSueldo = empSueldo[i];
                        idxEmpleadoMax = i;
                    }
                }
            }

            System.out.println("--- Empleado con Mayor Sueldo en " + nombreDepto + " ---");
            if (idxEmpleadoMax != -1) {
                System.out.printf("%s, con sueldo $%.2f\n",
                        empNombre[idxEmpleadoMax], empSueldo[idxEmpleadoMax]);
            } else {
                System.out.println("No hay empleados registrados en ese depto.");
            }
        }

        // ===== INCISO C) Alta de 'Carlos' =====
        System.out.println("\n--- Inciso c) Alta de 'Carlos' ---");
        String nuevoNombre = "Carlos";
        int nuevoClaveDept = 20;
        int nuevoAntiguedad = 1;
        double nuevoSueldo = 28000;

        // Verificar si ya existe
        boolean yaExiste = false;
        for (int i = 0; i < numEmpleados; i++) {
            if (empNombre[i].equalsIgnoreCase(nuevoNombre)) {
                yaExiste = true;
                break;
            }
        }

        if (yaExiste) {
            System.out.println("Error: El empleado '" + nuevoNombre + "' ya existe.");
        } else {
            // Agregar el nuevo empleado
            empNombre[numEmpleados] = nuevoNombre;
            empClaveDept[numEmpleados] = nuevoClaveDept;
            empAntiguedad[numEmpleados] = nuevoAntiguedad;
            empSueldo[numEmpleados] = nuevoSueldo;
            numEmpleados++;

            System.out.println("Alta exitosa: " + nuevoNombre);

            // Actualizar contador en Departamento
            for (int i = 0; i < numDeptos; i++) {
                if (deptoClave[i] == nuevoClaveDept) {
                    deptoNumEmpleados[i]++;
                    break;
                }
            }
        }

        // ===== ESTADO FINAL =====
        System.out.println("\n--- Estado Final ---");
        System.out.println("\nLISTA EMPLEADOS:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.printf("Empleado[Nombre: %s, Dept: %d, Sueldo: %.2f]\n",
                    empNombre[i], empClaveDept[i], empSueldo[i]);
        }
        System.out.println("\nLISTA DEPARTAMENTOS:");
        for (int i = 0; i < numDeptos; i++) {
            System.out.printf("Depto[Clave: %d, Nombre: %s, Jefe: %s]\n",
                    deptoClave[i], deptoNombre[i], deptoJefe[i]);
        }
    }
}