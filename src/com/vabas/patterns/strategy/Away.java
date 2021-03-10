package com.vabas.patterns.strategy;

public class Away implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Away now....");
    }
}
