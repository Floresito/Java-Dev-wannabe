package com.example.practica11dfl;

public class EstudianteDFL {
    private String nombre;
    private String matricula;

    public EstudianteDFL(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
}