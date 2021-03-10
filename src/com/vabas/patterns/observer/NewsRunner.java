package com.vabas.patterns.observer;

public class NewsRunner {
    public static void main(String[] args) {
        SuperNews newsSite = new SuperNews();

        newsSite.addNews("Not good news for you");

        Observer Subscriber1 = new Subscriber("Vovan from forest");
        Observer Subscriber2 = new Subscriber("Vasil from hell");

        newsSite.addObserver(Subscriber1);
        newsSite.addNews("Hell gate is open...");
        newsSite.addObserver(Subscriber2);

        newsSite.addNews("Free beer from hell for you !!!!!");

        newsSite.removeNews("Hell gate is open...");
    }
}
