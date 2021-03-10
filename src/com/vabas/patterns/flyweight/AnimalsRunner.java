package com.vabas.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AnimalsRunner {
    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<Animal> animals = new ArrayList<>();

        animals.add(animalsFactory.getAnimalByType("Pig"));
        animals.add(animalsFactory.getAnimalByType("Pig"));
        animals.add(animalsFactory.getAnimalByType("Pig"));
        animals.add(animalsFactory.getAnimalByType("Pig"));
        animals.add(animalsFactory.getAnimalByType("Pig"));
        animals.add(animalsFactory.getAnimalByType("Wolf"));
        animals.add(animalsFactory.getAnimalByType("Wolf"));
        animals.add(animalsFactory.getAnimalByType("Wolf"));
        animals.add(animalsFactory.getAnimalByType("Wolf"));
        animals.add(animalsFactory.getAnimalByType("Wolf"));

        for (Animal animal: animals){
            animal.eating();
        }



    }
}
