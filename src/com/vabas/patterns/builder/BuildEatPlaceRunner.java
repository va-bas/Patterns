package com.vabas.patterns.builder;

public class BuildEatPlaceRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setCreator(new RestaurantBuilder());
        EatPlace eatPlace = creator.buildEatPlace();

        System.out.println(eatPlace);

    }
}
