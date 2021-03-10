package com.vabas.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Racer> racers = new ArrayList<Racer>();

    public void addRacer(Racer racer){
        racers.add(racer);
    }

    public void removeRacer(Racer racer){
        racers.remove(racer);
    }

    public void startRace(){
        System.out.println("Race is started ...");
        for (Racer racer : racers){
            racer.runRace();
        }
    }
}
