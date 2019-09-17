package me.fsanllehi;

public class Personaje {
    private int id;
    private String nombre;
    private String descripcion;
    private int minDMG;
    private int maxDMG;
    private int hp;

    public Personaje(int id, String nombre, String descripcion, int minDMG, int maxDMG, int hp) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.minDMG = minDMG;
        this.maxDMG = maxDMG;
        this.hp = hp;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
