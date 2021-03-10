package com.vabas.patterns.strategy;

public class Dinner implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Having dinner now....");
    }
}
