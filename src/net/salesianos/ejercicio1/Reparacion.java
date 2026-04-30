package net.salesianos.ejercicio1;

import java.util.Objects;

public class Reparacion {

    // Atributos principales de una reparación
    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    // Constructor con todos los datos obligatorios
    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public String getCliente() { return cliente; }
    public String getDescripcion() { return descripcion; }
    public boolean isUrgente() { return urgente; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setUrgente(boolean urgente) { this.urgente = urgente; }

    // Para mostrar la reparación de forma legible
    @Override
    public String toString() {
        return "Reparacion{" +
                "codigo='" + codigo + '\'' +
                ", cliente='" + cliente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", urgente=" + urgente +
                '}';
    }

    // Dos reparaciones son iguales si tienen el mismo código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reparacion)) return false;
        Reparacion that = (Reparacion) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
