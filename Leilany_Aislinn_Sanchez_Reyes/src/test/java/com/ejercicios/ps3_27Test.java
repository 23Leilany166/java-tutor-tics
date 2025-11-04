package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ps3_27Test {
  @Test
  void estadisticas() {
    int N = 5;
    List<String> MAT = Arrays.asList("A","B","C","D","E");
    List<Integer> SEX = Arrays.asList(0,1,0,1,0); // 0 mujer, 1 hombre
    List<Integer> SEM = Arrays.asList(1,3,5,7,1);
    List<Double> PRO = Arrays.asList(9.5, 8.0, 9.8, 7.2, 9.0);
    ps3_27.Res r = ps3_27.resolver(N, MAT, SEX, SEM, PRO);
    assertEquals("C", r.matF);
    assertEquals(9.8, r.maxF, 1e-9);
    assertEquals("B", r.matM);
    assertEquals(8.0, r.maxM, 1e-9);
    assertEquals((9.5+9.0)/2, r.prom1, 1e-9);
    assertEquals(8.0, r.prom3, 1e-9);
    assertEquals(9.8, r.prom5, 1e-9);
    assertEquals(7.2, r.prom7, 1e-9);
  }
}
