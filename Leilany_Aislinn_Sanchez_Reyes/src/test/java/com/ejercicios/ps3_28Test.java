package com.ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ps3_28Test {
  @Test
  void censo() {
    int N=5;
    int[] CLAVE={1,2,3,4,5};
    int[] EDAD ={30,55,22,39,60};
    int[] SEXO ={1,0,1,1,0};
    int[] SUELDO={35000,25000,15000,39000,21000};
    int[] r = ps3_28.resolver(N, CLAVE, EDAD, SEXO, SUELDO);
    assertArrayEquals(new int[]{3,2,1,2,2}, r);
  }
}
