package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS2_8Test {
  @Test void casosBasicos() {
    assertEquals("Sí es divisor", ps2_8.resolver(6, 18));
    assertEquals("No es divisor", ps2_8.resolver(5, 18));
    assertEquals("Indefinido", ps2_8.resolver(0, 7));
  }
}
