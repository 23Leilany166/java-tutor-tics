package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ps3_29Test {
  @Test
  void unicef() {
    int N = 6;
    String[] EST = {"CDMX","JALISCO","DF","PUEBLA","MÉXICO","SONORA"};
    double[] EDAD = {0.5, 2.0, 4.5, 6.2, 1.0, 7.0};
    ps3_29.Res r = ps3_29.resolver(N, EST, EDAD);
    assertEquals(50.0, r.porcentaje, 1e-9);
    assertEquals(1, r.g1);
    assertEquals(2, r.g2);
    assertEquals(2, r.g3);
    assertEquals(1, r.g4);
    assertEquals("G2", r.grupoMax);
  }
}
