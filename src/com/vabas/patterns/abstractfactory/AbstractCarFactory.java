package com.vabas.patterns.abstractfactory;

public interface AbstractCarFactory {
    AbstractCar createCar();
    Driver createDriver();
    PathForDriver createPathForDriver();
}
