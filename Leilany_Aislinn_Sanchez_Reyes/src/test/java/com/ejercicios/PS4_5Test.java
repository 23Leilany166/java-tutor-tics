package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS4_5Test {
  @Test
  void frecuenciasBasicas() {
    int[] ALU = {10,10,9,8,8,8};
    int[] F = ps4_5.frecuencias(ALU);
    int[] esper = new int[11];
    esper[8]=3; esper[9]=1; esper[10]=2;
    assertArrayEquals(esper, F);
  }
}
