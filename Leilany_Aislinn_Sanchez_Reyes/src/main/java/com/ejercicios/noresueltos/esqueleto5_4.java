package com.ejercicios.noresueltos;
import java.util.*;

public class esqueleto5_4 {

    // Clase para empleados
    public static class Emp {
        public String nom;   // nombre del empleado
        public int cladep;   // clave del departamento
        public int anti;     // antigüedad
        public double sue;   // sueldo
    }

    // Clase para departamentos
    public static class Dep {
        public int cladep;    // clave del departamento
        public String nomdep; // nombre del departamento
        public int numemp;    // número de empleados
        public String nomjef; // nombre del jefe
    }

    // Comparar dos nombres ignorando mayúsculas/minúsculas
    static int cmp(String a, String b) {
        // return a.compareToIgnoreCase(b);
        return 0; // temporal
    }

    // Búsqueda binaria de empleado por nombre (en arreglo ordenado)
    static int binNom(Emp[] e, int ne, String nom) {
        // ...
        return -1; // temporal
    }

    // Posición donde se debe insertar un empleado para mantener orden por nombre
    static int posIns(Emp[] e, int ne, String nom) {
        // ...
        return 0; // temporal
    }

    // Búsqueda binaria de un departamento por clave
    static int binDep(Dep[] d, int nd, int clave) {
        // ...
        return -1; // temporal
    }

    // Buscar un departamento por nombre, recorriendo el arreglo
    static int buscarDeptoPorNombre(Dep[] d, int nd, String nom) {
        // ...
        return -1; // temporal
    }

    // Consulta de datos de un empleado por nombre
    public static String consultaEmpleado(Emp[] E, int ne, Dep[] D, int nd, String nom) {
        // ...
        return ""; // temporal
    }

    // Empleado mejor pagado por departamento
    public static String mejorPagadoPorDepto(Emp[] E, int ne, Dep[] D, int nd, String nomDep) {
        // ...
        return ""; // temporal
    }

    // Insertar empleado en arreglo ordenado por nombre
    public static int insertar(Emp[] E, int ne, Dep[] D, int nd, Emp nuevo) {
        // ...
        return ne; // temporal
    }

    public static void main(String[] args) {
        // ...
    }
}
