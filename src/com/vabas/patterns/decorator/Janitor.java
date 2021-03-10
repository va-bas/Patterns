package com.vabas.patterns.decorator;

public class Janitor implements Worker{
    @Override
    public String makeJob() {
        return "Clean the garbage";
    }
}
