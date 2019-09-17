package me.fsanllehi;

import java.util.ArrayList;

public class Listas {
    private static ArrayList<Personaje> Personajes = new ArrayList<>();
    private static ArrayList<Jugador> Jugadores  = new ArrayList<>();
    private static ArrayList<Enemigos> Enemigos = new ArrayList<>();

    public static ArrayList<Personaje> getPersonajes() {
        return Personajes;
    }

    public static void setPersonajes(Personaje personajes) {
        Personajes.add(personajes);
    }

    public static ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public static void setJugadores(Jugador jugadores) {
        Jugadores.add(jugadores);
    }

    public static ArrayList<Enemigos> getEnemigos() {
        return Enemigos;
    }

    public static void setEnemigos(Enemigos enemigos) {
        Enemigos.add(enemigos);
    }

}
