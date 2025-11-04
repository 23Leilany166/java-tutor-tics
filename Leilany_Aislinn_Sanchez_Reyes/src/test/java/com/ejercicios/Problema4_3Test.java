package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Problema4_3Test {
  @Test
  void cuentaYGanaYPorcentaje() {
    List<Integer> votos = Arrays.asList(1,3,3,2,3,12,0,99);
    int[] V = Problema4_3.contarVotos(votos);
    assertEquals(1, V[1]);
    assertEquals(3, V[3]);
    int g = Problema4_3.ganador(V);
    assertEquals(3, g);
    double p = Problema4_3.porcentajeGanador(V);
    assertEquals(60.0, p, 1e-9);
  }
}
