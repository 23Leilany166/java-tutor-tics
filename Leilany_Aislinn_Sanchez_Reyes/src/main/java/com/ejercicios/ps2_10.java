// ps2_10.java
package com.ejercicios;
import java.util.*;

public class ps2_10 {
  public static boolean identidad(double A,double B,int N,double eps){
    if(B==0) return false;
    if(N<0 && A==0) return false;
    double izq=Math.pow(A/B,N);
    double der=Math.pow(A,N)/Math.pow(B,N);
    return Math.abs(izq-der)<eps;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double A=sc.nextDouble(), B=sc.nextDouble(); int N=sc.nextInt();
    if(B==0) System.out.println("Entrada no válida (B no puede ser 0)");
    else if(N<0 && A==0) System.out.println("Entrada no válida (A=0 con exponente negativo)");
    else System.out.println(identidad(A,B,N,1e-9)?"Iguales":"Diferentes");
  }
}
