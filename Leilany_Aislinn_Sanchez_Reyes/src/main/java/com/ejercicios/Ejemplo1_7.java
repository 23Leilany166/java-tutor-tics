package com.ejercicios;
import java.util.*;

public class Ejemplo1_7 {
    public static double resolver(int A, int B) {
        return ((A + B) * (A + B)) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(resolver(A, B));
        sc.close();
    }
}



