package net.salesianos.ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AppVideojuego {
    public static void main(String[] args) {

        // Lista donde guardaremos los videojuegos del CSV
        List<Videojuego> lista = new ArrayList<>();

        try {
            // Leemos todas las líneas del CSV
            List<String> lineas = Files.readAllLines(Path.of("videojuego.csv"));

            // Empezamos desde 1 para saltar la cabecera
            for (int i = 1; i < lineas.size(); i++) {
                String[] campos = lineas.get(i).split(",");

                String titulo = campos[0].trim();
                String genero = campos[1].trim();
                int horas = Integer.parseInt(campos[2].trim());

                lista.add(new Videojuego(titulo, genero, horas));
            }

            // Cálculos
            int total = lista.size();
            int totalHoras = 0;
            Videojuego masJugado = null;

            for (Videojuego v : lista) {
                totalHoras += v.getHorasJugadas();

                if (masJugado == null || v.getHorasJugadas() > masJugado.getHorasJugadas()) {
                    masJugado = v;
                }
            }

            double media = (double) totalHoras / total;

            // Crear resumen
            String resumen =
                    "Total videojuegos: " + total + "\n" +
                    "Total horas jugadas: " + totalHoras + "\n" +
                    "Media de horas: " + media + "\n" +
                    "Más jugado: " + masJugado.getTitulo() + " (" + masJugado.getHorasJugadas() + "h)\n";

            // Guardar resumen
            Files.writeString(Path.of("resumen_videojuegos.txt"), resumen);

            // Añadir log sin borrar lo anterior
            Files.writeString(
                    Path.of("log_videojuegos.txt"),
                    "Ejecución correcta\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
