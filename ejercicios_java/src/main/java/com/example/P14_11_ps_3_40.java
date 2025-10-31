package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class P14_11_ps_3_40 {

    public ResultadosAnalisis analizarConductores(List<Elemento> elementos) {
        if (elementos == null || elementos.isEmpty()) {
            return new ResultadosAnalisis(Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        }

        List<Elemento> mejoresElectricos = elementos.stream()
            .sorted(Comparator.comparingDouble(Elemento::getCondElectrica).reversed())
            .limit(2)
            .collect(Collectors.toList());
            
        List<Elemento> peoresElectricos = elementos.stream()
            .sorted(Comparator.comparingDouble(Elemento::getCondElectrica))
            .limit(2)
            .collect(Collectors.toList());

        List<Elemento> mejoresTermicos = elementos.stream()
            .sorted(Comparator.comparingDouble(Elemento::getCondTermica).reversed())
            .limit(2)
            .collect(Collectors.toList());
            
        List<Elemento> peoresTermicos = elementos.stream()
            .sorted(Comparator.comparingDouble(Elemento::getCondTermica))
            .limit(2)
            .collect(Collectors.toList());

        return new ResultadosAnalisis(mejoresElectricos, peoresElectricos, mejoresTermicos, peoresTermicos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P14_11_ps_3_40 programa = new P14_11_ps_3_40();
        List<Elemento> listaElementos = new ArrayList<>();

        System.out.println("--- Ingrese los datos de los elementos ---");
        String nombreElemento;
        do {
            System.out.print("Ingrese el nombre del elemento (o 'NN' para finalizar): ");
            nombreElemento = scanner.nextLine();

            if (!nombreElemento.equalsIgnoreCase("NN")) {
                System.out.print("Ingrese la conductividad electrica: ");
                double condElectrica = scanner.nextDouble();
                System.out.print("Ingrese la conductividad termica: ");
                double condTermica = scanner.nextDouble();
                scanner.nextLine(); 

                listaElementos.add(new Elemento(nombreElemento, condElectrica, condTermica));
            }
        } while (!nombreElemento.equalsIgnoreCase("NN"));

        ResultadosAnalisis resultados = programa.analizarConductores(listaElementos);

        System.out.println("\n--- Resultados del Análisis de Conductividad ---");
        System.out.println("Mejores conductores eléctricos: " + formatNombres(resultados.getMejoresElectricos()));
        System.out.println("Mejores conductores térmicos: " + formatNombres(resultados.getMejoresTermicos()));
        System.out.println("Peores conductores eléctricos: " + formatNombres(resultados.getPeoresElectricos()));
        System.out.println("Peores conductores térmicos: " + formatNombres(resultados.getPeoresTermicos()));
        
        scanner.close();
    }
    
    private static String formatNombres(List<Elemento> elementos) {
        if (elementos.isEmpty()) return "N/A";
        return elementos.stream().map(Elemento::getNombre).collect(Collectors.joining(" y "));
    }
}