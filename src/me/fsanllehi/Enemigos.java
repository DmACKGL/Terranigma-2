package me.fsanllehi;

public class Enemigos {

    private int id;
    private String nombre;
    private int currentHP;
    private int minDMG;
    private int maxDMG;
    private boolean live;

    public Enemigos(int id, String nombre, int currentHP, int minDMG, int maxDMG, boolean live) {
        this.id = id;
        this.nombre = nombre;
        this.currentHP = currentHP;
        this.minDMG = minDMG;
        this.maxDMG = maxDMG;
        this.live = live;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getMinDMG() {
        return minDMG;
    }

    public void setMinDMG(int minDMG) {
        this.minDMG = minDMG;
    }

    public int getMaxDMG() {
        return maxDMG;
    }

    public void setMaxDMG(int maxDMG) {
        this.maxDMG = maxDMG;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
