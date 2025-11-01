package edu.primersemestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 5.5 — Esqueleto para práctica (Arreglos de registros)
 * Arreglos ordenados por número de habitación:
 * HABI[1..360]: NUM (int), TIPO (String: SI, DO, TR, SU), PRECIO (double), DISP (String: SI/NO)
 * HUES[1..360]: NUMHAB (int), NOM (String), FECARR (int, día juliano simplificado)
 *
 * Operaciones a implementar:
 * a) Dado NOM y fechaActual, calcular lo que debe pagar (noches * PRECIO).
 * b) Contar cuántas habitaciones DISPONIBLES hay por tipo (SI/DO/TR/SU).
 * c) Dado NOM, eliminar su registro y marcar como disponible su habitación.
 * d) Dado NUMHAB y fecha de arribo + NOM, asignar si está disponible.
 */
public class Ps55 {

    // === Estructuras de datos base (puedes cambiarlas por clases si deseas) ===
    public static class Hab {
        public int num; public String tipo; public double precio; public String disp; // "SI"/"NO"
    }
    public static class Hue {
        public int numHab; public String nom; public int fecArr;
    }

    // a) Pago: noches * precio
    public static double calcularPago(Hab[] habs, int nH, Hue[] hues, int mH, String nombre, int fechaActual) {
        // TODO: buscar huésped por nombre, hallar su habitación y precio; noches = max(0, fechaActual - fecArr)
        return 0.0; // temporal
    }

    // b) Disponibles por tipo
    public static int contarDisponibles(Hab[] habs, int nH, String tipo) {
        // TODO: contar where hab.tipo.equals(tipo) && hab.disp.equals("SI")
        return 0;
    }

    // c) Eliminar huésped y liberar habitación
    public static boolean eliminarHuesped(Hab[] habs, int nH, Hue[] hues, int[] mH, String nombre) {
        // TODO: buscar por nombre; si existe, marcar hab.disp="SI" y compactar arreglo de huespedes
        return false;
    }

    // d) Reservar si disponible
    public static boolean reservar(Hab[] habs, int nH, Hue[] hues, int[] mH, int numHab, String nombre, int fecArr) {
        // TODO: si hab.disp=="SI", poner "NO" y agregar registro a huespedes
        return false;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // TODO: Cargar algunos datos de ejemplo o pedirlos por teclado y demostrar cada operación.
        sc.close();
    }
}
