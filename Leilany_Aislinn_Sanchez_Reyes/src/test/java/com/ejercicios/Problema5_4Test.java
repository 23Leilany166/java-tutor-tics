package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Problema5_4Test {

  @Test
  void insertaYConsulta() {
    Problema5_4.Emp e1 = new Problema5_4.Emp(); e1.nom="Ana"; e1.cladep=10; e1.anti=3; e1.sue=12000;
    Problema5_4.Emp e2 = new Problema5_4.Emp(); e2.nom="Luis"; e2.cladep=20; e2.anti=5; e2.sue=18000;
    Problema5_4.Emp[] emple = new Problema5_4.Emp[10];
    emple[0]=e1; emple[1]=e2;
    int ne = 2;

    Problema5_4.Dep d1 = new Problema5_4.Dep(); d1.cladep=10; d1.nomdep="Ventas"; d1.numemp=1; d1.nomjef="Carla";
    Problema5_4.Dep d2 = new Problema5_4.Dep(); d2.cladep=20; d2.nomdep="TI"; d2.numemp=1; d2.nomjef="Rogelio";
    Problema5_4.Dep[] depa = new Problema5_4.Dep[10];
    depa[0]=d1; depa[1]=d2;
    int nd = 2;

    Problema5_4.Emp nuevo = new Problema5_4.Emp(); nuevo.nom="Juan"; nuevo.cladep=10; nuevo.anti=1; nuevo.sue=15000;
    ne = Problema5_4.insertar(emple, ne, depa, nd, nuevo);
    assertEquals(3, ne);
    assertEquals(2, d1.numemp);

    String info = Problema5_4.consultaEmpleado(emple, ne, depa, nd, "Juan");
    assertTrue(info.contains("Sueldo: 15000"));
    assertTrue(info.contains("Departamento: Ventas"));
    assertTrue(info.contains("Jefe: Carla"));
  }

  @Test
  void mejorPagadoPorDepto() {
    Problema5_4.Emp e1 = new Problema5_4.Emp(); e1.nom="Ana"; e1.cladep=10; e1.anti=3; e1.sue=12000;
    Problema5_4.Emp e2 = new Problema5_4.Emp(); e2.nom="Luis"; e2.cladep=20; e2.anti=5; e2.sue=18000;
    Problema5_4.Emp e3 = new Problema5_4.Emp(); e3.nom="Juan"; e3.cladep=20; e3.anti=1; e3.sue=25000;
    Problema5_4.Emp[] emple = new Problema5_4.Emp[10];
    emple[0]=e1; emple[1]=e2; emple[2]=e3;
    int ne = 3;

    Problema5_4.Dep d1 = new Problema5_4.Dep(); d1.cladep=10; d1.nomdep="Ventas"; d1.numemp=1; d1.nomjef="Carla";
    Problema5_4.Dep d2 = new Problema5_4.Dep(); d2.cladep=20; d2.nomdep="TI"; d2.numemp=2; d2.nomjef="Rogelio";
    Problema5_4.Dep[] depa = new Problema5_4.Dep[10];
    depa[0]=d1; depa[1]=d2;
    int nd = 2;

    String r = Problema5_4.mejorPagadoPorDepto(emple, ne, depa, nd, "TI");
    assertTrue(r.contains("Juan"));
    assertTrue(r.contains("25000"));
  }
}
