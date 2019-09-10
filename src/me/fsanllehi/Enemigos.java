package me.fsanllehi;

public class Enemigos {

    private int id;
    private String nombre;
    private int currentHP;
    private int dmg;

    public Enemigos(int id, String nombre, int currentHP, int dmg) {
        this.id = id;
        this.nombre = nombre;
        this.currentHP = currentHP;
        this.dmg = dmg;
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

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}
