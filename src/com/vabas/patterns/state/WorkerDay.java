package com.vabas.patterns.state;

public class WorkerDay {
    public static void main(String[] args) {
        Activity activity = new Away();

        Worker worker = new Worker();
        worker.setActivity(activity);

        for (int i = 0; i < 10; i++){
            worker.justDoIt();
            worker.changeActivity();
        }
    }
}
