package com.vabas.patterns.abstractfactory.Racer;

import com.vabas.patterns.abstractfactory.AbstractCar;
import com.vabas.patterns.abstractfactory.AbstractCarFactory;
import com.vabas.patterns.abstractfactory.Driver;
import com.vabas.patterns.abstractfactory.PathForDriver;

public class RacerFactoryAbstract implements AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new Ferrari();
    }

    @Override
    public Driver createDriver() {
        return new Vovan();
    }

    @Override
    public PathForDriver createPathForDriver() {
        return new RacePath();
    }
}
