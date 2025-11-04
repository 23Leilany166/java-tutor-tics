// ps2_8.java
package com.ejercicios;
import java.util.*;

public class ps2_8 {
  public static String resolver(int num1,int num2){
    if(num1==0) return "Indefinido";
    return (num2%num1==0) ? "Sí es divisor" : "No es divisor";
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(), b=sc.nextInt();
    System.out.println(resolver(a,b));
  }
}
