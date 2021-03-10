package com.vabas.patterns.state;

public class Away implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Away now....");
    }
}
