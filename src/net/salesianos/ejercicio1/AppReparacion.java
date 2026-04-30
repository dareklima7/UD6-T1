package net.salesianos.ejercicio1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AppReparacion {
    public static void main(String[] args) {

        // Cola FIFO para reparaciones pendientes
        Queue<Reparacion> cola = new LinkedList<>();

        // Pila LIFO para historial de reparaciones atendidas
        Stack<Reparacion> historial = new Stack<>();

        // Añadimos las reparaciones
        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Batería dañada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto de carga", true));

        // Mostrar todas las reparaciones pendientes
        System.out.println("Reparaciones pendientes:");
        for (Reparacion r : cola) {
            System.out.println(r);
        }

        // peek() → ver la primera sin eliminar
        System.out.println("\nPrimera reparación sin eliminar:");
        System.out.println(cola.peek());

        // poll() → sacar las dos primeras reparaciones
        Reparacion r1 = cola.poll();
        Reparacion r2 = cola.poll();

        // Guardamos en la pila (historial)
        historial.push(r1);
        historial.push(r2);

        // Última reparación atendida (top de la pila)
        System.out.println("\nÚltima reparación atendida:");
        System.out.println(historial.peek());

        // pop() → sacar del historial
        System.out.println("\nExtrayendo una reparación del historial:");
        System.out.println(historial.pop());

        // Mostrar cuántas quedan pendientes
        System.out.println("\nReparaciones pendientes: " + cola.size());

        // Saber si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.isEmpty());
    }
}
