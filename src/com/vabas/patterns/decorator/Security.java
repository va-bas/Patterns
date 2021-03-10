package com.vabas.patterns.decorator;

public class Security extends WorkerDecorator{

    public Security(Worker worker) {
        super(worker);
    }

    public String makeNotMyJob(){
        return " and because director dont want do it";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeNotMyJob();
    }
}
