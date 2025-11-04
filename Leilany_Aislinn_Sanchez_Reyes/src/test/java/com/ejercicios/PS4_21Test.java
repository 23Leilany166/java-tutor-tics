package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS4_21Test {
  @Test
  void temperaturas() {
    double[][] TEMP = new double[13][32];
    for(int d=1; d<=31; d++) TEMP[1][d] = 10;
    for(int d=1; d<=28; d++) TEMP[2][d] = 15;
    for(int d=1; d<=31; d++) TEMP[3][d] = 20;
    ps4_21.Res r = ps4_21.resolver(TEMP, false);
    assertEquals(20.0, r.max, 1e-9);
    assertEquals(3, r.mesPromMax);
    assertEquals(20.0, r.valPromMax, 1e-9);
    assertEquals(10.0, r.promMes[1], 1e-9);
    assertEquals(15.0, r.promMes[2], 1e-9);
    assertEquals(20.0, r.promMes[3], 1e-9);
  }
}
