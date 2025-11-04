package com.programa;

/**
 * MatrizElemento - Estructura simple para representar un elemento no nulo
 * de una matriz dispersa (renglón, columna, valor).
 *
 * NOTA:
 * - Se usa en los ejercicios donde las matrices se representan como listas
 *   de elementos no nulos para optimizar almacenamiento.
 */
public class MatrizElemento {
    // Usamos campos públicos para facilitar el acceso en ejercicios educativos
    public int ren;
    public int col;
    public int val;
    
    public MatrizElemento(int ren, int col, int val) {
        // Índices en Java base 0
        this.ren = ren; 
        this.col = col; 
        this.val = val;
    }
}