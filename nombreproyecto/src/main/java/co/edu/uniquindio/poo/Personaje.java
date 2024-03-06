package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class Personaje {
    private String nombre;
    private List<String> habilidades;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public Personaje() {
        this.habilidades = new ArrayList<>();
    }

    
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }
    

    @Override
    public String toString() {
        return "Character{" +
                "nombre='" + nombre + '\'' +
                ", habilidades=" + habilidades +
                ", descripcion='" + descripcion + '\'' +
                ", apodo='" + apodo + '\'' +
                ", dineroInicial=" + dineroInicial +
                '}';
    }

}