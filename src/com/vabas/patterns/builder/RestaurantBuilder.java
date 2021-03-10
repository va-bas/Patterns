package com.vabas.patterns.builder;

public class RestaurantBuilder extends EatPlaceBuilder{
    @Override
    void buildName() {
        eatPlace.setName("KashaVmiske");
    }

    @Override
    void buildKitchen() {
        eatPlace.setKitchen(Kitchen.RUSSIAN);
    }

    @Override
    void buildStars() {
        eatPlace.setStars(6);
    }
}
