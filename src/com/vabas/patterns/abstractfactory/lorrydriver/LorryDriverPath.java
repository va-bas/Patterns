package com.vabas.patterns.abstractfactory.lorrydriver;

import com.vabas.patterns.abstractfactory.PathForDriver;

public class LorryDriverPath implements PathForDriver {
    @Override
    public String runPathForDriver() {
        return "Barnaul - Hell";
    }
}
