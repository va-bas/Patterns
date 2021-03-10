package com.vabas.patterns.chain;

public class NormalMassageNotifier extends Notifier{

    public NormalMassageNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("It's normal massage: " + massage);
    }
}
