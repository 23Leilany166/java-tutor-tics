package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PS4_37Test {
  @Test
  void listarReporteInsertarMayor() {
    int N = 2;
    String[] CT = new String[10];
    int[] HAB = new int[10*2+5];
    CT[1]="Acapulco"; HAB[1]=10; HAB[2]=20;
    CT[2]="Cancun";   HAB[3]=30; HAB[4]=10;

    String m = ps4_37.mayor(CT, N, HAB);
    assertTrue(m.startsWith("Cancun"));

    String rep = ps4_37.reporte(CT, N, HAB, "Acapulco");
    assertTrue(rep.contains("Simples: 10"));
    assertTrue(rep.contains("Dobles: 20"));

    N = ps4_37.insertar(CT, N, HAB, "Bacalar", 5, 5);
    assertEquals(3, N);
    assertEquals("Acapulco", CT[1]);
    assertEquals("Bacalar", CT[2]);
    assertEquals("Cancun", CT[3]);
  }
}
