package com.vabas.patterns.facade;

public class PlayTracker {
    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is finish");
        activeSprint = false;
    }
}
