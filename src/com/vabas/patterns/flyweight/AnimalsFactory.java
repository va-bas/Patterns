package com.vabas.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalsFactory {
    public static final Map<String, Animal> animals = new HashMap<>();

    public Animal getAnimalByType(String type){
        Animal animal = animals.get(type);

        if (animal == null)
        {
            switch (type) {
                case "Pig":
                    System.out.println("We need more pig ...");
                    animal = new Pig();
                    break;
                case "Wolf":
                    System.out.println("Find more wolfs...");
                    animal = new Wolf();
                    break;
            }
            animals.put(type, animal);
        }
        return animal;
    }


}
