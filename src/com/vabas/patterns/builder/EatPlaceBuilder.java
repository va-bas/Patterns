package com.vabas.patterns.builder;

public abstract class EatPlaceBuilder {
    EatPlace eatPlace;

    void createEatPlace(){
        eatPlace = new EatPlace();
    }

    abstract void buildName();
    abstract void buildKitchen();
    abstract void buildStars();

    EatPlace getEatPlace(){
        return eatPlace;
    }
}
