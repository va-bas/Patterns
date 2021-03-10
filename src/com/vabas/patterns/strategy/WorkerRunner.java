package com.vabas.patterns.strategy;

public class WorkerRunner {
    public static void main(String[] args) {
        Activity activity = new Away();

        Worker worker = new Worker();

        worker.setActivity(activity);
        worker.executeActivity();

        worker.setActivity(new Waiting());
        worker.executeActivity();

        worker.setActivity(new Working());
        worker.executeActivity();

        worker.setActivity(new Dinner());
        worker.executeActivity();

        worker.setActivity(new Working());
        worker.executeActivity();

        worker.setActivity(activity);
        worker.executeActivity();
    }
}
