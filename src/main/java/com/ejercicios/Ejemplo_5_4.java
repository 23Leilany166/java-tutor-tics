package com.ejercicios;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

/**
*
* @author Chema
*/
import java.util.Scanner;

public class Ejemplo_5_4 {
    public static void main(String[] args) {
        // Declaración del registro EMPLEADO
        class Empleado {
            int numero;
            String nombre;
            String departamento;
            int nivel;
            double sueldo;
        }

        // Creación de un objeto empleado1
        Empleado empleado1 = new Empleado();
        empleado1.numero = 1;
        empleado1.nombre = "Juan Pérez";
        empleado1.departamento = "Ventas";
        empleado1.nivel = 2;
        empleado1.sueldo = 2500.50;

        // Creación de un objeto empleado2
        Empleado empleado2 = new Empleado();
        empleado2.numero = 2;
        empleado2.nombre = "María López";
        empleado2.departamento = "Recursos Humanos";
        empleado2.nivel = 3;
        empleado2.sueldo = 3000.75;

        // Imprimir los datos de los empleados
        System.out.println("Datos del empleado 1:");
        System.out.println("Número: " + empleado1.numero);
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Departamento: " + empleado1.departamento);
        System.out.println("Nivel: " + empleado1.nivel);
        System.out.println("Sueldo: " + empleado1.sueldo);

        System.out.println("\nDatos del empleado 2:");
        System.out.println("Número: " + empleado2.numero);
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Departamento: " + empleado2.departamento);
        System.out.println("Nivel: " + empleado2.nivel);
        System.out.println("Sueldo: " + empleado2.sueldo);
    }

}