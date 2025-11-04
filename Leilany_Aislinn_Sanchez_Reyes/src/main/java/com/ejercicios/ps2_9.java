// ps2_9.java  (si lo vas a usar en tu HTML)
package com.ejercicios;
import java.util.*;

public class ps2_9 {
  public static boolean identidad(double A,int N,double eps){
    if(A==0) return false;
    double izq=Math.pow(A,-N), der=1.0/Math.pow(A,N);
    return Math.abs(izq-der)<eps;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double A=sc.nextDouble(); int N=sc.nextInt();
    System.out.println(A==0? "A no puede ser 0" : (identidad(A,N,1e-9)?"Iguales":"Diferentes"));
  }
}

