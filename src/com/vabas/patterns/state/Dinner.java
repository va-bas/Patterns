package com.vabas.patterns.state;

public class Dinner implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Having dinner now....");
    }
}
