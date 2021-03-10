package com.vabas.patterns.strategy;

public class Worker {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Away){
            setActivity(new Waiting());
        }
        else if(activity instanceof Waiting){
            setActivity(new Working());
        }
        else if(activity instanceof Working){
            setActivity(new Dinner());
        }
        else if(activity instanceof Dinner){
            setActivity(new Away());
        }
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
