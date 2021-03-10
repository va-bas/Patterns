package com.vabas.patterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> news) {
        System.out.println("Hello " + name + "\nWe have some news:\n" + news +
                "\n------------------------------------");
    }
}
