package net.salesianos.ejercicio2;

import java.util.Objects;

public class Asistente {

    // Atributos del asistente
    private String dni;
    private String nombre;
    private String grupo;

    // Constructor obligatorio
    public Asistente(String dni, String nombre, String grupo) {
        this.dni = dni;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    // Getters y setters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getGrupo() { return grupo; }

    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setGrupo(String grupo) { this.grupo = grupo; }

    // Mostrar asistente
    @Override
    public String toString() {
        return nombre + " (" + dni + ") - " + grupo;
    }

    // equals y hashCode basados en DNI → evita duplicados en HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asistente)) return false;
        Asistente that = (Asistente) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
