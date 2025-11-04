package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS2_9Test {
  @Test void identidadPotenciasNegativas() {
    assertTrue(ps2_9.identidad(2.0, 3, 1e-9));
    assertTrue(ps2_9.identidad(-4.0, 2, 1e-9));
    assertFalse(ps2_9.identidad(0.0, 5, 1e-9));
  }
}
