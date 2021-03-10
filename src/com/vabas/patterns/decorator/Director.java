package com.vabas.patterns.decorator;

public class Director extends WorkerDecorator{

    public Director(Worker worker) {
        super(worker);
    }

    public String makeNotMyJob(){
        return " because janitor drinking vodka";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeNotMyJob();
    }
}
