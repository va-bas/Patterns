package com.vabas.patterns.factory;

public interface CarFactory{
    Jeep createJeep();
    Lorry createLorry();
    Sedan createSedan();
}
