package com.vabas.patterns.abstractfactory.lorrydriver;

import com.vabas.patterns.abstractfactory.Driver;

public class OldBadVovan implements Driver {
    @Override
    public String runDriver() {
        return "Old Vovan on ";
    }
}
