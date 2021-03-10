package com.vabas.patterns.facade;

public class Player {
    public void playInGame(PlayTracker playTracker) {
        if (playTracker.isActiveSprint()){
            System.out.println("Player play game ...");
        }
        else {
            System.out.println("Player don't play game ...");
        }
    }
}
