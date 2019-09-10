package me.fsanllehi;

import java.util.ArrayList;

public class Jugador {
    private int id;
    private String Nombre;
    private int personajeID;
    public static ArrayList<Jugador> Jugadores = new ArrayList<>();

    public Jugador(int id, String nombre, int personajeID) {
        this.id = id;
        Nombre = nombre;
        this.personajeID = personajeID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPersonajeID() {
        return personajeID;
    }

    public void setPersonajeID(int personajeID) {
        this.personajeID = personajeID;
    }
}
