package com.example;

public class Elemento {
    private final String nombre;
    private final double condElectrica;
    private final double condTermica;

    public Elemento(String nombre, double condElectrica, double condTermica) {
        this.nombre = nombre;
        this.condElectrica = condElectrica;
        this.condTermica = condTermica;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCondElectrica() {
        return condElectrica;
    }

    public double getCondTermica() {
        return condTermica;
    }
}