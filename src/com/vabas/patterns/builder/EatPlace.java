package com.vabas.patterns.builder;

public class EatPlace {
    private String name;
    private Kitchen kitchen;
    private int stars;

    public void setName(String name) {
        this.name = name;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", Kitchen='" + kitchen + '\'' +
                ", stars=" + stars +
                '}';
    }
}
