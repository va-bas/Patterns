package com.vabas.patterns.abstractfactory.lorrydriver;

import com.vabas.patterns.abstractfactory.AbstractCar;
import com.vabas.patterns.abstractfactory.AbstractCarFactory;
import com.vabas.patterns.abstractfactory.Driver;
import com.vabas.patterns.abstractfactory.PathForDriver;

public class LorryDriverFactoryAbstract implements AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new Kamaz();
    }

    @Override
    public Driver createDriver() {
        return new OldBadVovan();
    }

    @Override
    public PathForDriver createPathForDriver() {
        return new LorryDriverPath();
    }
}
