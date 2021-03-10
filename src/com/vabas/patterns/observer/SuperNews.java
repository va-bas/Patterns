package com.vabas.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SuperNews implements Observed{
    List<String> news = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addNews(String newNews){
        this.news.add(newNews);
        notifyObservers();
    }

    public void removeNews(String oldNews){
        this.news.remove(oldNews);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers){
            observer.handleEvent(news);
        }
    }
}
