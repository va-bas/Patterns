package com.vabas.patterns.builder;

public class CaffeBuilder extends EatPlaceBuilder{
    @Override
    void buildName() {
        eatPlace.setName("ChanJyram");
    }

    @Override
    void buildKitchen() {
        eatPlace.setKitchen(Kitchen.CHINA);
    }

    @Override
    void buildStars() {
        eatPlace.setStars(2);
    }
}
