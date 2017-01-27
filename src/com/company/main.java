package com.company;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Videojuego MonkeyIsland = new Videojuego(1l, "Monkey Island", 10, "Lucas Arts", 1997, 4843, "Aventura", 12, 1, "PC");
        Videojuego CounterStrikeGO = new Videojuego(2l, "Counter Strike GO", 15, "Valve", 2010, 10000000, "Fps", 16, 10, "PC");
        Videojuego YokaiWatch = new Videojuego(3l, "Yokai Watch", 40, "Level-5", 2014, 2000000, "Aventura", 3, 1, "Ninendo DS");
        Videojuego PokemonLuna = new Videojuego(4l, "Pokemon Luna", 45, "Game Freak", 2016, 4000000, "Aventura", 3, 1, "Ninendo DS");
        Videojuego JakAndDaxter3 = new Videojuego(5l, "Jak & Daxter 3", 25, "Naughty Dog", 2004, 150000, "Plataformas", 16, 1, "PlayStation");
        Videojuego KingdomHearts2 = new Videojuego(6l, "Kingdom Hearts 2", 25, "Square Enix", 2005, 2500000, "Plataformas", 7, 1, "PlayStation");
        Videojuego ChocoboTales = new Videojuego(7l, "Chocobo Tales", 30, "Square Enix", 2006, 10000, "Aventrura", 3, 1, "Ninendo DS");
        Videojuego CrashBandicoot = new Videojuego(8l, "Crash Bandicoot", 25, "Naughty Dog", 1996, 5000000, "Plataformas", 3, 1, "PlayStation");
        Videojuego LeagueOfLegends = new Videojuego(9l, "League Of Legends", 0, "Riot Games", 2009, 100000000, "MOBA", 12, 10, "PC");
        Videojuego FinalFantasyVII = new Videojuego(10l, "Final Fantasy VII", 50, "Square Enix", 1997, 9999999, "Aventura", 16, 1, "Multiplataforma");

        List<Videojuego> VideojuegoList = new ArrayList<>();
        VideojuegoList.add(MonkeyIsland);
        VideojuegoList.add(CounterStrikeGO);
        VideojuegoList.add(YokaiWatch);
        VideojuegoList.add(PokemonLuna);
        VideojuegoList.add(JakAndDaxter3);
        VideojuegoList.add(KingdomHearts2);
        VideojuegoList.add(ChocoboTales);
        VideojuegoList.add(CrashBandicoot);
        VideojuegoList.add(LeagueOfLegends);
        VideojuegoList.add(FinalFantasyVII);

        //VideojuegoList.subList(0, 5).stream().map(Videojuego::getNombre).forEach(System.out::println);

        for (Videojuego v : VideojuegoList.subList(0, 5)
                ) {
            System.out.println(v.getNombre());
        }

        System.out.println("muestro los juego de superioridad al 2013");


        for (int x = 0; x < VideojuegoList.size(); x++) {

            Videojuego videojuego = VideojuegoList.get(x);
            if (videojuego.getLanzamiento() > 2013) {
                System.out.println(videojuego.getNombre());
                System.out.println(videojuego.getLanzamiento());
            }
            System.out.println();

        }

        System.out.println("Juegos de un determinado lanzamiento, empresa y ventas");

        for (int x = 0; x < VideojuegoList.size(); x++) {

            Videojuego videojuego = VideojuegoList.get(x);
            if (videojuego.getLanzamiento() > 2000) {

                if (videojuego.getEmpresa() == "Square Enix") {

                    if (videojuego.getVentas() > 20000) {

                        System.out.println(videojuego.getNombre());
                        System.out.println(videojuego.getEmpresa());
                        System.out.println(videojuego.getVentas());
                    }
                }
            }
            System.out.println();

        }

        System.out.println("Ahora devolvere los datos de una plataforma en un rango de precios");

        for (int x = 0; x < VideojuegoList.size(); x++) {
            Videojuego videojuego = VideojuegoList.get(x);

            if (videojuego.getPlataforma() == "PC"){

                if (videojuego.getPrecio() > 5){
                    System.out.println(videojuego.getNombre());
                    System.out.println(videojuego.getPlataforma());
                    System.out.println(videojuego.getPrecio());
                }
            }
            System.out.println();
        }


    }

}

