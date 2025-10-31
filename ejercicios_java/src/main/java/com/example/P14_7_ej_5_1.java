
package com.example;
// CORRECCIÓN 1: El nombre de la clase ahora es válido (empieza con una letra)
public class P14_7_ej_5_1 { 
    private String nombre;
    private String direccion;
    private int matricula;
    private String carrera;
    
    // CORRECCIÓN 2: El constructor ahora se llama igual que la clase
    public P14_7_ej_5_1(String nombre, String direccion, int matricula, String carrera) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public static void main(String[] args) {
        // CORRECCIÓN 3: Al crear los objetos, usamos el nuevo nombre de la clase
        P14_7_ej_5_1 alumno1 = new P14_7_ej_5_1("Juan Perez", "Calle Principal 123", 123456, "Ingeniería Informática");
        P14_7_ej_5_1 alumno2 = new P14_7_ej_5_1("Maria Lopez", "Avenida Central 456", 789012, "Administración de Empresas");
        
        // El resto del código no necesita cambios
        String nombreAlumno1 = alumno1.getNombre();
        int matriculaAlumno2 = alumno2.getMatricula();
        
        alumno1.setDireccion("Calle Secundaria 789");
        alumno2.setCarrera("Contabilidad");
        
        System.out.println("Alumno 1:");
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Dirección: " + alumno1.getDireccion());
        System.out.println("Matrícula: " + alumno1.getMatricula());
        System.out.println("Carrera: " + alumno1.getCarrera());
        
        System.out.println("\nAlumno 2:");
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Dirección: " + alumno2.getDireccion());
        System.out.println("Matrícula: " + alumno2.getMatricula());
        System.out.println("Carrera: " + alumno2.getCarrera());
    }
}