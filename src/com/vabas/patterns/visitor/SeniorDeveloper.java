package com.vabas.patterns.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing good class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Restore database after junior...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable tests...");
    }
}
