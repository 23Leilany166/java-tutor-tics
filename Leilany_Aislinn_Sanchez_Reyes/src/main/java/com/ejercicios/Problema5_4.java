// Problema5_4.java
package com.ejercicios;
import java.util.*;

public class Problema5_4 {
  static class Emp { String nom; int cladep; int anti; double sue; }
  static class Dep { int cladep; String nomdep; int numemp; String nomjef; }

  static int cmp(String a,String b){ return a.compareToIgnoreCase(b); }

  static int binNom(Emp[] e,int ne,String nom){
    int lo=0,hi=ne-1;
    while(lo<=hi){ int m=(lo+hi)>>>1; int c=cmp(e[m].nom,nom);
      if(c==0) return m; if(c<0) lo=m+1; else hi=m-1; }
    return -1;
  }
  static int posIns(Emp[] e,int ne,String nom){
    int lo=0,hi=ne; while(lo<hi){ int m=(lo+hi)>>>1;
      if(cmp(e[m].nom,nom)<0) lo=m+1; else hi=m; }
    return lo;
  }
  static int binDep(Dep[] d,int nd,int clave){
    int lo=0,hi=nd-1;
    while(lo<=hi){ int m=(lo+hi)>>>1;
      if(d[m].cladep==clave) return m;
      if(d[m].cladep<clave) lo=m+1; else hi=m-1; }
    return -1;
  }
  static int buscarDeptoPorNombre(Dep[] d,int nd,String nom){
    for(int i=0;i<nd;i++) if(d[i].nomdep.equalsIgnoreCase(nom)) return i;
    return -1;
  }

  public static String consultaEmpleado(Emp[] E,int ne,Dep[] D,int nd,String nom){
    int p=binNom(E,ne,nom); if(p==-1) return "No existe";
    int k=binDep(D,nd,E[p].cladep); if(k==-1) return "Depto no encontrado";
    return "Sueldo: "+E[p].sue+" | Departamento: "+D[k].nomdep+" | Jefe: "+D[k].nomjef;
  }
  public static String mejorPagadoPorDepto(Emp[] E,int ne,Dep[] D,int nd,String nomDep){
    int id=buscarDeptoPorNombre(D,nd,nomDep); if(id==-1) return "Depto no existe";
    int clave=D[id].cladep; double max=-1; String n="";
    for(int i=0;i<ne;i++) if(E[i].cladep==clave && E[i].sue>max){max=E[i].sue; n=E[i].nom;}
    return n.isEmpty()? "Sin empleados": ("Mejor pagado: "+n+" | Sueldo: "+max);
  }
  public static int insertar(Emp[] E,int ne,Dep[] D,int nd,Emp nuevo){
    int k=posIns(E,ne,nuevo.nom);
    for(int i=ne-1;i>=k;i--) E[i+1]=E[i];
    E[k]=nuevo; ne++;
    int idx=binDep(D,nd,nuevo.cladep); if(idx!=-1) D[idx].numemp++;
    return ne;
  }

  // Main simple de demostración (ajusta a tus datos de prueba)
  public static void main(String[] args){
    // Ejemplo mínimo: sin I/O complejo para que lo modifiques a tu gusto
    Emp[] E = new Emp[100]; Dep[] D = new Dep[20];
    int ne=0, nd=0;

    // Agrega algunos departamentos
    D[nd]=new Dep(); D[nd].cladep=10; D[nd].nomdep="Sistemas"; D[nd].nomjef="Ana"; D[nd].numemp=0; nd++;
    D[nd]=new Dep(); D[nd].cladep=20; D[nd].nomdep="Ventas";  D[nd].nomjef="Luis"; D[nd].numemp=0; nd++;

    // Inserta empleados de ejemplo (ordenados por nom)
    Emp a=new Emp(); a.nom="Carlos"; a.cladep=10; a.anti=2; a.sue=18000; ne=insertar(E,ne,D,nd,a);
    Emp b=new Emp(); b.nom="Beatriz"; b.cladep=20; b.anti=5; b.sue=22000; ne=insertar(E,ne,D,nd,b);

    System.out.println(consultaEmpleado(E,ne,D,nd,"Beatriz"));
    System.out.println(mejorPagadoPorDepto(E,ne,D,nd,"Ventas"));
  }
}
