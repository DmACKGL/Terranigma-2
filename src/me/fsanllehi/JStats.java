package me.fsanllehi;

public class JStats extends Jugador {

    private int ataque;
    private int defensa;
    private int vida;
    private int armadura;
    private int espada;

    public JStats(int id, String nombre, int personajeID, int ataque, int defensa, int vida, int armadura, int espada) {
        super(id, nombre, personajeID);
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.armadura = armadura;
        this.espada = espada;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getEspada() {
        return espada;
    }

    public void setEspada(int espada) {
        this.espada = espada;
    }
}
