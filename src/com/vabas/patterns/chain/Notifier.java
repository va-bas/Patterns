package com.vabas.patterns.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifierManager(String massage, int level){
        if (level >= priority){
            write(massage);
        }
        if (nextNotifier != null){
            nextNotifier.notifierManager(massage, level);
        }
    }

    public abstract void write(String massage);

}
