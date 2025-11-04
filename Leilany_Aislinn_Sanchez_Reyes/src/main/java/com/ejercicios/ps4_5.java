// ps4_5.java
package com.ejercicios;
import java.util.*;

public class ps4_5 {
  public static int[] frecuencias(int[] ALU){
    int[] F=new int[11];
    for(int x: ALU) if(x>=0 && x<=10) F[x]++;
    return F;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] ALU=new int[250];
    for(int i=0;i<250;i++) ALU[i]=sc.nextInt();
    int[] F=frecuencias(ALU);
    for(int i=0;i<=10;i++) System.out.println(i+" "+F[i]);
  }
}
