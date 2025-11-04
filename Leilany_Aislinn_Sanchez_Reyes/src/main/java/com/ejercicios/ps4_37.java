// ps4_37.java
package com.ejercicios;

public class ps4_37 {
  public static int indiceCentroPorNombre(String[] CT,int N,String nombre){
    int izq=1,der=N;
    while(izq<=der){
      int mid=(izq+der)/2, c=CT[mid].compareToIgnoreCase(nombre);
      if(c==0) return mid; if(c>0) der=mid-1; else izq=mid+1;
    }
    return -1;
  }
  public static void listar(String[] CT,int N){ for(int i=1;i<=N;i++) System.out.println(CT[i]); }
  public static String reporte(String[] CT,int N,int[] HAB,String nom){
    int p=indiceCentroPorNombre(CT,N,nom); if(p==-1) return "Centro no encontrado";
    int s=HAB[2*p-1], d=HAB[2*p]; return "Simples: "+s+" Dobles: "+d+" Total: "+(s+d);
  }
  public static int insertar(String[] CT,int N,int[] HAB,String nom,int simples,int dobles){
    int k=1; while(k<=N && CT[k].compareToIgnoreCase(nom)<0) k++;
    for(int i=N;i>=k;i--) CT[i+1]=CT[i];
    for(int i=2*N;i>=2*k;i--) HAB[i+2]=HAB[i];
    CT[k]=nom; HAB[2*k-1]=simples; HAB[2*k]=dobles; return N+1;
  }
  public static String mayor(String[] CT,int N,int[] HAB){
    int best=1, bt=HAB[1]+HAB[2];
    for(int i=2;i<=N;i++){ int t=HAB[2*i-1]+HAB[2*i]; if(t>bt){bt=t; best=i;} }
    return CT[best]+" Total: "+bt;
  }
  public static void main(String[] args){}
}
