package me.fsanllehi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Iniciar SETUP
        Util.init();

        // Iniciar juego
        Util.limpiarCMD();
        System.out.println("\n\n\n\n¡COMIENZA EL JUEGO!\n\n\n\n");
        Scanner scan = new Scanner(System.in);
        while (true){
            Util.saveGame();
            if (Util.checkLiveE()){
                System.out.println("\n\nGanaron los Jugadores!");
                break;
            }
            if (Util.checkLiveP()){
                System.out.println("\n\nGanaron los Enemigos!");
                break;
            }
            System.out.println("--> ¡Turno de los jugadores! <--");
            for (Jugador jugador: Listas.getJugadores()) {
                if (Util.checkLiveE()){
                    break;
                }
                System.out.printf("\n\n--> TURNO DEL JUGADOR N°%s (%s) <--\nVida actual: %sHP\n", jugador.getId(), jugador.getNombre(), jugador.getHp());
                System.out.println("--- Lista de enemigos ---");
                for (Enemigos enemigo: Listas.getEnemigos()) {
                    if (enemigo.isLive()) {
                        System.out.printf("ID: %s | Nombre: %s | HP: %s\n", enemigo.getId(), enemigo.getNombre(), enemigo.getCurrentHP());
                    }else{
                        System.out.printf("ID: %s | Nombre: %s | MUERTO\n", enemigo.getId(), enemigo.getNombre());
                    }
                }
                System.out.println();
                if (jugador.isLive()){
                    for (Enemigos enemigo: Listas.getEnemigos()) {
                        System.out.printf("Turno del jugador N°%s (%s) para enemigo N°%s\n1) Atacar\n2) Pasar\n3) Consultar Jugadores\n4) Consultar Enemigos\n5) Cambio HP Masivo\nSeleccion: ", jugador.getId(), jugador.getNombre(), enemigo.getId());
                        int seleccion = scan.nextInt();
                        if (seleccion == 1){
                            int ataque = Util.ataque(enemigo.getCurrentHP(), jugador.getMinDMG(), jugador.getMaxDMG());
                            if (ataque <= 0){
                                System.out.println("¡El enemigo Murio!");
                                enemigo.setCurrentHP(0);
                                enemigo.setLive(false);
                            }else {
                                System.out.printf("¡El enemigo quedo en: %s! Antes tenia: %s\n", ataque, enemigo.getCurrentHP());
                                enemigo.setCurrentHP(ataque);
                            }

                        }
                        if (seleccion == 3){
                            System.out.println("Ingresa el nombre del personaje a buscar: ");
                            scan.nextLine();
                            String nombre = scan.nextLine();
                            Util.buscarNombre(jugador, nombre);
                        }
                        if (seleccion == 4){
                            System.out.println("Ingresa el nombre del enemigo a buscar: ");
                            scan.nextLine();
                            String nombre = scan.nextLine();
                            Util.buscarNombre(enemigo, nombre);
                        }
                        if (seleccion == 5){
                            System.out.println("Cambio masivo de HP ¿A cuanto HP quieres cambiar?");
                            int hp = scan.nextInt();
                            System.out.println("¿A quienes quieres ejecutar esta accion?");
                            System.out.println("1) Jugadores\n2) Enemigos");
                            seleccion = scan.nextInt();
                            if (seleccion == 1){
                                Util.Masivo(jugador, hp);
                            }
                            if (seleccion == 2){
                                Util.Masivo(enemigo, hp);
                            }
                        }
                    }
                }else{
                    System.out.printf("¡El Jugador N°%s esta muerto! \n", jugador.getId());
                }
            }

            for (Enemigos enemigo: Listas.getEnemigos()) {
                if (Util.checkLiveP()){
                    break;
                }
                System.out.printf("\n\n--> TURNO DEL Enemigo N°%s <--\n\n", enemigo.getId());
                System.out.println("--- Lista de Jugadores ---");
                for (Jugador jugador: Listas.getJugadores()) {
                    if (enemigo.isLive()) {
                        System.out.printf("ID: %s | Nombre: %s | HP: %s\n", jugador.getId(), jugador.getNombre(), jugador.getHp());
                    }else{
                        System.out.printf("ID: %s | Nombre: %s | MUERTO\n", jugador.getId(), jugador.getNombre());
                    }
                }
                System.out.println();
                if (enemigo.isLive()){
                    for (Jugador jugador: Listas.getJugadores()) {
                        System.out.printf("Turno del Enemigo N°%s para Jugador N°%s\n", enemigo.getId(), jugador.getId());
                        int seleccion = Util.randomEntre(1,2);
                        if (seleccion == 1){
                            int ataque = Util.ataque(jugador.getHp(), enemigo.getMinDMG(), enemigo.getMaxDMG());
                            if (ataque <= 0){
                                System.out.printf("¡El jugador N°%s murio!", jugador.getId());
                                jugador.setHp(0);
                                jugador.setLive(false);
                            }else {
                                System.out.printf("¡El jugador N°%s quedo en: %s! Antes tenia: %s\n", jugador.getId(), ataque, jugador.getHp());
                                jugador.setHp(ataque);
                            }
                        }else{
                            System.out.println("El enemigo decidio pasar.");
                        }
                    }
                }else{
                    System.out.printf("¡El Enemigo N°%s esta muerto! \n", enemigo.getId());
                }

            }
        }
        System.out.println("\n\nTERMINO EL JUEGO!\nGracias por jugar Terranigma :)");
    }
}
