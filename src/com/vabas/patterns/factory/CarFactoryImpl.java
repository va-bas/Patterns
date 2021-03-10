package com.vabas.patterns.factory;

public class CarFactoryImpl implements CarFactory{

    @Override
    public Jeep createJeep() {
        return new Jeep();
    }

    @Override
    public Lorry createLorry() {
        return new Lorry();
    }

    @Override
    public Sedan createSedan() {
        return new Sedan();
    }
}
