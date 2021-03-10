package com.vabas.patterns.state;

public class Working implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Working now....");
    }
}
