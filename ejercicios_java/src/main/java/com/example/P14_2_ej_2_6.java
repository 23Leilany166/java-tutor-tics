package com.example;

public class P14_2_ej_2_6 {

    /**
     * Devuelve el nombre de la acción basado en el número selector.
     * @param selector El número entero de entrada.
     * @return Un String que describe la acción a realizar.
     */
    public String seleccionarAccion(int selector) {
        String accion;
        switch (selector) {
            case 1:
            case 2:
                accion = "Realizando acción 1";
                break;
            case 3:
            case 4:
            case 5:
                accion = "Realizando acción 2";
                break;
            default:
                accion = "Realizando acción 3";
                break;
        }
        return accion;
    }

    public static void main(String[] args) {
        P14_2_ej_2_6 programa = new P14_2_ej_2_6();
        int selector = 3;

        // Se llama al método para obtener la acción y se imprime.
        String accionSeleccionada = programa.seleccionarAccion(selector);
        System.out.println(accionSeleccionada);

        // La acción X se mantiene como parte del flujo principal.
        System.out.println("Realizando acción X");
    }
}