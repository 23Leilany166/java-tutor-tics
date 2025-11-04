package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Optional;

public class Problema2_3Test {
  @Test
  void raicesReales() {
    Optional<double[]> r = Problema2_3.raices(1, -3, 2);
    assertTrue(r.isPresent());
    assertArrayEquals(new double[]{2.0,1.0}, r.get(), 1e-9);
  }

  @Test
  void noCuadraticaONegativo() {
    assertTrue(Problema2_3.raices(0,2,3).isEmpty());
    assertTrue(Problema2_3.raices(1,0,1).isEmpty()); // Δ = -4
  }
}
