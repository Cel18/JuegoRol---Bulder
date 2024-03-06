package co.edu.uniquindio.poo;

import java.util.List;

public interface PersonajeBuilder {
    void nombre(String nombre);
    void habilidades(List<String> habilidades);
    void descripcion(String descripcion);
    void apodo(String apodo);
    void dineroInicial(double dineroInicial);
    Personaje build();
}