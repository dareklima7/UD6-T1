package net.salesianos.ejercicio2;

import java.util.HashMap;
import java.util.HashSet;

public class AppAsistente {
    public static void main(String[] args) {

        // HashSet para evitar duplicados
        HashSet<Asistente> asistentes = new HashSet<>();

        // Añadimos los asistentes
        asistentes.add(new Asistente("111A", "Elena", "DAM1"));
        asistentes.add(new Asistente("222B", "Hugo", "DAM1"));
        asistentes.add(new Asistente("333C", "Sara", "DAW1"));
        asistentes.add(new Asistente("111A", "Elena repetida", "DAM2")); // duplicado
        asistentes.add(new Asistente("444D", "Marcos", "DAW1"));
        asistentes.add(new Asistente("555E", "Lucía", "DAM1"));

        // Mostrar contenido del set
        System.out.println("Contenido del set:");
        for (Asistente a : asistentes) {
            System.out.println(a);
        }

        // Intentados vs añadidos
        System.out.println("\nIntentados añadir: 6");
        System.out.println("Añadidos realmente: " + asistentes.size());

        // HashMap para contar asistentes por grupo
        HashMap<String, Integer> conteo = new HashMap<>();

        // Contamos por grupo
        for (Asistente a : asistentes) {
            conteo.put(a.getGrupo(), conteo.getOrDefault(a.getGrupo(), 0) + 1);
        }

        // Mostrar mapa
        System.out.println("\nConteo por grupo:");
        System.out.println(conteo);

        // Consultas
        System.out.println("\nAsistentes en DAM1: " + conteo.get("DAM1"));
        System.out.println("¿Existe ASIR1? " + conteo.containsKey("ASIR1"));

        // Eliminar ASIR1 si existiera
        conteo.remove("ASIR1");

        // Mostrar claves
        System.out.println("\nClaves del mapa:");
        System.out.println(conteo.keySet());
    }
}
