// Problema2_3.java
package com.ejercicios;
import java.util.*;

public class Problema2_3 {
  public static Optional<double[]> raices(double a, double b, double c){
    if (a == 0) return Optional.empty();
    double dis = b*b - 4*a*c;
    if (dis < 0) return Optional.empty();
    double r = Math.sqrt(dis);
    return Optional.of(new double[]{(-b + r)/(2*a), (-b - r)/(2*a)});
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
    var op = raices(a,b,c);
    if (op.isEmpty()) System.out.println("No hay raíces reales");
    else System.out.println(op.get()[0] + " " + op.get()[1]);
  }
}
