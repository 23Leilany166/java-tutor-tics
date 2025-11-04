package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Problema4_16Test {
  @Test
  void construyeB() {
    int M = 2, N = 3;
    long[][] A = new long[M+1][N+1];
    A[1][1]=1; A[1][2]=2; A[1][3]=3;
    A[2][1]=4; A[2][2]=5; A[2][3]=6;
    long[] B = Problema4_16.construirB(A, M, N);
    assertEquals(6, B[1]);
    assertEquals(32, B[2]);
  }
}
