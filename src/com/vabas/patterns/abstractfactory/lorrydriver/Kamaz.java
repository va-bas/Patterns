package com.vabas.patterns.abstractfactory.lorrydriver;

import com.vabas.patterns.abstractfactory.AbstractCar;

public class Kamaz implements AbstractCar {
    @Override
    public String runCar() {
        return "Kamaz is running ";
    }
}
