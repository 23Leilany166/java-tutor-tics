package com.programa;

/**
 * Contenedor simple para resultados del problema de clima.
 *
 * NOTA PARA ALUMNOS:
 * - Esta clase actúa como una estructura de datos ligera (OJO) para agrupar
 *   varios resultados que luego pueden ser retornados por un método.
 * - No es necesario modificar la firma de esta clase. Solo úsala para
 *   almacenar valores cuando implementes la lógica en la clase correspondiente.
 */
public class ReporteClima {
    // Promedio de lluvia en la región centro
    public double promedioCentro;

    // Mes con menor lluvia en la región sur (1-12)
    public int mesMenorLluviaSur;

    // Registro (valor) de la menor lluvia en la región sur
    public double registroMenorLluviaSur;

    // Nombre de la región con mayor lluvia acumulada
    public String regionMayorLluvia;

    // Constructor por defecto (útil para inicializar desde la implementación)
    public ReporteClima() {}
}