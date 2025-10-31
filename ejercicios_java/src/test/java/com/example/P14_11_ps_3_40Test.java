package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P14_11_ps_3_40Test {

    private final P14_11_ps_3_40 programa = new P14_11_ps_3_40();
    
    private final Elemento plata = new Elemento("Plata", 63.0, 429.0);
    private final Elemento cobre = new Elemento("Cobre", 59.6, 401.0);
    private final Elemento oro = new Elemento("Oro", 45.2, 318.0);
    private final Elemento azufre = new Elemento("Azufre", 0.0000000000000001, 0.205);
    private final Elemento vidrio = new Elemento("Vidrio", 0.00000000000000001, 1.1);

    @Test
    void testAnalisisConVariosElementos() {
        List<Elemento> elementos = Arrays.asList(plata, cobre, oro, azufre, vidrio);
        
        ResultadosAnalisis resultados = programa.analizarConductores(elementos);
        
        List<String> mejoresElectricos = Arrays.asList("Plata", "Cobre");
        List<String> peoresElectricos = Arrays.asList("Vidrio", "Azufre");
        List<String> mejoresTermicos = Arrays.asList("Plata", "Cobre");
        List<String> peoresTermicos = Arrays.asList("Azufre", "Vidrio");

        assertEquals(mejoresElectricos, getNames(resultados.getMejoresElectricos()));
        assertEquals(peoresElectricos, getNames(resultados.getPeoresElectricos()));
        assertEquals(mejoresTermicos, getNames(resultados.getMejoresTermicos()));
        assertEquals(peoresTermicos, getNames(resultados.getPeoresTermicos()));
    }
    
    @Test
    void testAnalisisConMenosDeDosElementos() {
        List<Elemento> elementos = Arrays.asList(cobre);
        ResultadosAnalisis resultados = programa.analizarConductores(elementos);
        
        assertEquals(Arrays.asList("Cobre"), getNames(resultados.getMejoresElectricos()));
        assertEquals(Arrays.asList("Cobre"), getNames(resultados.getPeoresTermicos()));
        assertEquals(1, resultados.getMejoresElectricos().size());
    }
    
    @Test
    void testAnalisisConArregloVacio() {
        List<Elemento> elementos = Arrays.asList();
        ResultadosAnalisis resultados = programa.analizarConductores(elementos);

        assertEquals(0, resultados.getMejoresElectricos().size());
        assertEquals(0, resultados.getPeoresElectricos().size());
    }

    private List<String> getNames(List<Elemento> elementos) {
        return elementos.stream().map(Elemento::getNombre).collect(Collectors.toList());
    }
}