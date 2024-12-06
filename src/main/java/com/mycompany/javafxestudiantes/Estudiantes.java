package com.mycompany.javafxestudiantes;

class Estudiantes {

    private String nombre;
    private String apellido;
    private int edad;

    public Estudiantes(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String nombre() {
        return nombre;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public String apellido() {
        return apellido;
    }

    public void apellido(String apellido) {
        this.apellido = apellido;
    }

    public int edad() {
        return edad;
    }

    public void edad(int edad) {
        this.edad = edad;
    }
}