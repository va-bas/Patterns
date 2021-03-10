package com.vabas.maincode;

import com.vabas.patterns.abstractfactory.AbstractCar;
import com.vabas.patterns.abstractfactory.AbstractCarFactory;
import com.vabas.patterns.abstractfactory.Driver;
import com.vabas.patterns.abstractfactory.PathForDriver;
import com.vabas.patterns.factory.Car;
import com.vabas.patterns.factory.CarFactoryImpl;
import com.vabas.patterns.singleton.SomeNotes;

public class Ex {
    static Car getCarByName(String name){
        CarFactoryImpl cfi = new CarFactoryImpl();

        if (name.equals("Jeep")){
            return cfi.createJeep();
        }
        if(name.equals("Lorry")){
            return cfi.createLorry();
        }
        if(name.equals("Sedan")){
            return cfi.createSedan();
        }
        else {
            throw new RuntimeException(name + " is unknown name, enter correct name");
        }
    }

    public static void exFactory(String name){
        Car car = getCarByName(name);
        System.out.println(car.runCar());
    }

    public static void exAbstractFactory(AbstractCarFactory cf){
        AbstractCar car = cf.createCar();
        Driver driver = cf.createDriver();
        PathForDriver pfd = cf.createPathForDriver();

        System.out.println(driver.runDriver() + car.runCar() + pfd.runPathForDriver());
    }

    public static void exSingleton(){
        SomeNotes.getSomeNotes().addNotes("this is 1-st note ...");
        SomeNotes.getSomeNotes().addNotes("this is 2-d note ...");
        SomeNotes.getSomeNotes().addNotes("this is 3-d note ...");

        SomeNotes.getSomeNotes().showNotes();
    }

}
