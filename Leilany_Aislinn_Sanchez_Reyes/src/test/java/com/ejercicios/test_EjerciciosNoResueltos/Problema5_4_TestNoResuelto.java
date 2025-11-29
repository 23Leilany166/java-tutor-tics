package com.ejercicios.test_EjerciciosNoResueltos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.ejercicios.noresueltos.esqueleto5_4;

public class Problema5_4_TestNoResuelto {

    @Test
    void testInsertarYConsultaYMejorPagado() {
        esqueleto5_4.Emp[] E = new esqueleto5_4.Emp[10];
        esqueleto5_4.Dep[] D = new esqueleto5_4.Dep[5];
        int ne = 0, nd = 0;

        // Departamentos
        D[nd] = new esqueleto5_4.Dep();
        D[nd].cladep = 10;
        D[nd].nomdep = "Sistemas";
        D[nd].nomjef = "Ana";
        D[nd].numemp = 0;
        nd++;

        D[nd] = new esqueleto5_4.Dep();
        D[nd].cladep = 20;
        D[nd].nomdep = "Ventas";
        D[nd].nomjef = "Luis";
        D[nd].numemp = 0;
        nd++;

        // Empleados (se insertan usando el método del problema)
        esqueleto5_4.Emp a = new esqueleto5_4.Emp();
        a.nom = "Carlos"; a.cladep = 10; a.anti = 2; a.sue = 18000;
        ne = esqueleto5_4.insertar(E, ne, D, nd, a);

        esqueleto5_4.Emp b = new esqueleto5_4.Emp();
        b.nom = "Beatriz"; b.cladep = 10; b.anti = 1; b.sue = 25000;
        ne = esqueleto5_4.insertar(E, ne, D, nd, b);

        String info = esqueleto5_4.consultaEmpleado(E, ne, D, nd, "Beatriz");
        assertTrue(info.contains("Sueldo: 25000.0"));
        assertTrue(info.contains("Sistemas"));

        String mejor = esqueleto5_4.mejorPagadoPorDepto(E, ne, D, nd, "Sistemas");
        assertTrue(mejor.contains("Beatriz"));
    }
}

