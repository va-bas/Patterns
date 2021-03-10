package com.vabas.patterns.abstractfactory.Racer;

import com.vabas.patterns.abstractfactory.PathForDriver;

public class RacePath implements PathForDriver {
    @Override
    public String runPathForDriver() {
        return "Moscow - Hell";
    }
}
