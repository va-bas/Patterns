package com.vabas.patterns.composite;

public class Races {
    public static void main(String[] args) {
        Race race = new Race();

        Racer racerMercedes = new MercedesRacer();
        Racer racerFerrari = new FerrariRacer();
        Racer racerVolga = new VolgaRacer();

        race.addRacer(racerMercedes);
        race.addRacer(racerFerrari);
        race.addRacer(racerVolga);


        race.startRace();
    }
}
