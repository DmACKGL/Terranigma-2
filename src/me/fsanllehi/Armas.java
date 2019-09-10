package me.fsanllehi;

public class Armas {

    private int id;
    private int ataque;
    private int costo;

    public Armas(int id, int ataque, int costo) {
        this.id = id;
        this.ataque = ataque;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
