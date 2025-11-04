package com.ejercicios;
import java.util.*;

public class Ejemplo3_5 {
   public static long cubo(long n){ return n*n*n; }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    while (x != -1){
      if (x > 0) System.out.println(cubo(x));
      x = sc.nextLong();
    }
  }
}
  

