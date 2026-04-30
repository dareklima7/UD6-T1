package net.salesianos.ejercicio3;

public class Videojuego {

    // Atributos del videojuego
    private String titulo;
    private String genero;
    private int horasJugadas;

    // Constructor
    public Videojuego(String titulo, String genero, int horasJugadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getHorasJugadas() { return horasJugadas; }

    // Mostrar videojuego
    @Override
    public String toString() {
        return titulo + " (" + genero + ") - " + horasJugadas + "h";
    }
}
