package com.example;

import java.util.List;

public class ResultadosAnalisis {
    private final List<Elemento> mejoresElectricos;
    private final List<Elemento> peoresElectricos;
    private final List<Elemento> mejoresTermicos;
    private final List<Elemento> peoresTermicos;

    public ResultadosAnalisis(List<Elemento> mejoresElectricos, List<Elemento> peoresElectricos, List<Elemento> mejoresTermicos, List<Elemento> peoresTermicos) {
        this.mejoresElectricos = mejoresElectricos;
        this.peoresElectricos = peoresElectricos;
        this.mejoresTermicos = mejoresTermicos;
        this.peoresTermicos = peoresTermicos;
    }

    public List<Elemento> getMejoresElectricos() {
        return mejoresElectricos;
    }

    public List<Elemento> getPeoresElectricos() {
        return peoresElectricos;
    }

    public List<Elemento> getMejoresTermicos() {
        return mejoresTermicos;
    }

    public List<Elemento> getPeoresTermicos() {
        return peoresTermicos;
    }
}