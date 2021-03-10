package com.vabas.patterns.abstractfactory.Racer;

import com.vabas.patterns.abstractfactory.AbstractCar;

public class Ferrari implements AbstractCar {
    @Override
    public String runCar() {
        return "Ferrari is running ";
    }
}
