package com.ejercicios ;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejemplo1_7Test {

  @Test
  void calculaCorrecto() {
    assertEquals(3.0, Ejemplo1_7.resolver(1, 2), 1e-9);
    assertEquals(5.3333333333, Ejemplo1_7.resolver(2, 2), 1e-9);
    assertEquals(0.0, Ejemplo1_7.resolver(-2, 2), 1e-9);
  }
}
