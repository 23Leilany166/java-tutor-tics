package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS2_10Test {
  @Test void identidadCocientePotencias() {
    assertTrue(ps2_10.identidad(2.0, 5.0, 3, 1e-9));
    assertTrue(ps2_10.identidad(0.0, 3.0, 4, 1e-9));
    assertFalse(ps2_10.identidad(1.0, 0.0, 2, 1e-9));
  }
}
