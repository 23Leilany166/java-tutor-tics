package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS2_11Test {
  @Test void tramos() {
    assertEquals(51,     ps2_11.X(5));   // 3*5 + 36
    assertEquals(134,    ps2_11.X(12));  // 12^2 - 10
    assertEquals(65599,  ps2_11.X(40));  // 40^3 + 40^2 - 1
    assertEquals(0,      ps2_11.X(-3));  // fuera de rango
  }
}
