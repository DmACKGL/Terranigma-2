package me.fsanllehi;

public class Jugador {
    private int id;
    private String Nombre;
    private int hp;
    private int maxDMG;
    private int minDMG;
    private boolean live;

    public Jugador(int id, String nombre, int hp, int maxDMG, int minDMG, boolean live) {
        this.id = id;
        Nombre = nombre;
        this.hp = hp;
        this.maxDMG = maxDMG;
        this.minDMG = minDMG;
        this.live = live;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxDMG() {
        return maxDMG;
    }

    public void setMaxDMG(int maxDMG) {
        this.maxDMG = maxDMG;
    }

    public int getMinDMG() {
        return minDMG;
    }

    public void setMinDMG(int minDMG) {
        this.minDMG = minDMG;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }



}
