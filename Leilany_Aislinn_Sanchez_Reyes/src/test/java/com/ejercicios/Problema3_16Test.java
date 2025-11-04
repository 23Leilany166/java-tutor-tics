package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Problema3_16Test {
  @Test
  void calculaTotalesYMaxYZeros() {
    int N = 2;
    int[][] V = new int[N+1][6];
    V[1] = new int[]{0,10,20,0,5,3};
    V[2] = new int[]{0, 2,50,7,0,1};
    Map<String,Object> r = Problema3_16.resolver(V, N);
    int[] tipo = (int[]) r.get("tipo");
    int[] tot = (int[]) r.get("tot");
    assertEquals(12, tipo[1]);
    assertEquals(70, tipo[2]);
    assertEquals(7, tipo[3]);
    assertEquals(38, tot[1]);
    assertEquals(60, tot[2]);
    assertEquals(2, (int) r.get("anioMaxTipo2"));
    assertEquals(50, (int) r.get("maxTipo2"));
    assertEquals(java.util.List.of(1), r.get("sinTipo3"));
  }
}
