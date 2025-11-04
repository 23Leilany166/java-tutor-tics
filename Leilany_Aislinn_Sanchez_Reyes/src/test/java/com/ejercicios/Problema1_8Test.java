package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Problema1_8Test {
  @Test
  void distanciaClasica() {
    assertEquals(5.0, Problema1_8.distancia(0,0,3,4), 1e-9);
    assertEquals(0.0, Problema1_8.distancia(2,2,2,2), 1e-9);
  }
}
