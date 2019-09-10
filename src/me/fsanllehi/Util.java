package me.fsanllehi;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

class Util {
    static void init(){
        System.out.print("Bienvenido a...\n" +
                " /$$$$$$$$                                               /$$                                  \n" +
                "|__  $$__/                                              |__/                                  \n" +
                "   | $$  /$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$  /$$$$$$$  /$$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$ \n" +
                "   | $$ /$$__  $$ /$$__  $$ /$$__  $$|____  $$| $$__  $$| $$ /$$__  $$| $$_  $$_  $$ |____  $$\n" +
                "   | $$| $$$$$$$$| $$  \\__/| $$  \\__/ /$$$$$$$| $$  \\ $$| $$| $$  \\ $$| $$ \\ $$ \\ $$  /$$$$$$$\n" +
                "   | $$| $$_____/| $$      | $$      /$$__  $$| $$  | $$| $$| $$  | $$| $$ | $$ | $$ /$$__  $$\n" +
                "   | $$|  $$$$$$$| $$      | $$     |  $$$$$$$| $$  | $$| $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$\n" +
                "   |__/ \\_______/|__/      |__/      \\_______/|__/  |__/|__/ \\____  $$|__/ |__/ |__/ \\_______/\n" +
                "                                                             /$$  \\ $$                        \n" +
                "                                                            |  $$$$$$/                        \n" +
                "                                                             \\______/                         \n" +
                "                         Creado por Francisco Montecinos y Franco Sanllehi                     \n" +
                "                                 El juego se iniciara en 5 segundos...                         \n");
        try{
            TimeUnit.SECONDS.sleep(5);
            Util.limpiarCMD();
            Util.Setup();}
        catch(InterruptedException e) {
            System.out.println("Problemas al iniciar el juego.");
        }
    }

    private static void Setup(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Corriendo Setup...");

        /**
         * Set de personajes
         */
        try{
            System.out.println("Populando lista de personajes...");
            Listas.setPersonajes(new Personaje(1, "Ark", "Un joven lleno de energía, no puede parar. Vive en la casa mas grande de Crysta junto al Sabio. Pasa su mayor tiempo junto a Naomi. También suele hacer alguna gamberrada y nunca niega una nueva aventura."));
            Listas.setPersonajes(new Personaje(2, "Naomi", "Naomi es la mejor tejedora de Krysta. También es la mejor amiga de Ark. Cuando este se mete en problemas, ella le ayuda a solucionarlos. Mantienen una relación muy estrecha."));
            Listas.setPersonajes(new Personaje(3, "El Sabio", "El Sabio es el hombre mas anciano del pueblo de Krysta. Adoptó a Ark cuando era pequeño cuando este perdió a sus padres. Es el hombre mas respetado del pueblo."));
            Listas.setPersonajes(new Personaje(4, "Yomi", "Extraña criatura que dormía en una caja sellada. Tiene grandes conocimientos del mundo. Se sirve de sus pequeñas alas para mantenerse al vuelo."));
            Listas.setPersonajes(new Personaje(5, "Mei-Lin", "Mei-Lin, es la nieta del sabio anciano Ma-Yo. Perdió a sus padres cuando era pequeña. Tiene la habilidad de proyectar los sentimientos de cada persona. Por eso, ella proyecto una vida con sus padres en un pueblo fantasma."));
            Listas.setPersonajes(new Personaje(6, "Ma-Yo", "Ma-Yo viaja por todo el mundo en busca de la verdad y la sabiduría. Es el abuelo de Mei-Lin y es muy buen amigo de Lord-Kumari. Tiene la asombrosa habilidad de ver el futuro."));
            Listas.setPersonajes(new Personaje(7, "Fidia", "Esta mujer, es la guardaespaldas de la princesa Naomi de Loira. Protegerá con su vida a la chica para cumplir la promesa que hizo a unas personas muy importantes en el pasado."));
            Listas.setPersonajes(new Personaje(8, "Roy", "Valiente mercenario. Roy por unas cuantas Gemas es capaz de cualquier cosa. A menos que haya chicas guapas de por medio. Parece que tuvo alguna relación con Fidia en el pasado."));
            Listas.setPersonajes(new Personaje(9, "Perry", "Perry es el amo del monopatín. Con sus malabares es capaz de hacer sonreír a cualquier persona por triste que este. Vive en Liberita con sus amigos del orfanato."));
            Listas.setPersonajes(new Personaje(10, "Naomi Storkolm", "Muchacha de muy parecido físico a Naomi de Crysta. Perdió el don del habla debido a la terrible perdida de sus padres cuando era una niña."));
            System.out.printf("Cantidad de Personajes ingresados: %d \n" , Listas.getPersonajes().size());
        } catch (Exception e) {
            System.out.println("Error al intentar popular lista de personajes | Error: ");
            e.printStackTrace();
        }

        /**
         * Set de enemigos
         */
        try{

        }catch (Exception e) {
            System.out.println("Error al intentar popular lista de enemigos | Error: ");
            e.printStackTrace();
        }
        /**
         * Ingreso de jugadores
         */
        System.out.println("No se detectaron jugadores... Siga las instrucciones.");
        try{
            System.out.println("Ingrese su nombre: ");
            String nombre = scan.next();
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%10s %20s %50s", "ID", "Nombre", "Descripcion");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            for(Personaje personaje: Listas.getPersonajes()){
                System.out.format("%10s %20s %50s", personaje.getId(), personaje.getNombre(), personaje.getDescripcion());
                System.out.println();
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Elige tu personaje: ");
            int personajeID = scan.nextInt();
        }catch (Exception e) {
            System.out.println("Error en el proceso de setup jugador.");
        }
    }

    private static void limpiarCMD(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int randomEntre(int uno, int dos){
        int randomInt = ThreadLocalRandom.current().nextInt(uno, dos+1); //+1 para que de hasta el numero, de lo contrario restara uno
        return randomInt;
    }

}
