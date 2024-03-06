package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class ArqueroBuilder implements PersonajeBuilder {
    private String nombre;
    private List<String> habilidades;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public ArqueroBuilder() {
        this.habilidades = new ArrayList<>();
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void habilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public void descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void apodo(String apodo) {
        this.apodo = apodo;
    }

    public void dineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public Personaje build() {
        Personaje personaje = new Personaje();
        personaje.setNombre(nombre);
        personaje.setHabilidades(habilidades);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
    }
}