package com.vabas.patterns.state;

public class Waiting implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Waiting tasks now....");
    }
}
