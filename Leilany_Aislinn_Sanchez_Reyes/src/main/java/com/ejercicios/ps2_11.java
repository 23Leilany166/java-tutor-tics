package com.ejercicios;

public class ps2_11 {
  public static long X(int Y) {
    if (Y <= 0)  return 0L;
    if (Y <= 11) return 3L * Y + 36L;
    if (Y <= 33) return (long) Y * Y - 10L;
    if (Y <= 64) return (long) Y * Y * Y + (long) Y * Y - 1L;
    return 0L;
  }
}
