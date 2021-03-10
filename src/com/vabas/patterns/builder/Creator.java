package com.vabas.patterns.builder;

public class Creator {
    EatPlaceBuilder builder;

    public void setCreator(EatPlaceBuilder creator) {
        this.builder = creator;
    }

    EatPlace buildEatPlace()
    {
        builder.createEatPlace();
        builder.buildName();
        builder.buildKitchen();
        builder.buildStars();

        EatPlace eatPlace = builder.getEatPlace();

        return eatPlace;
    }
}
