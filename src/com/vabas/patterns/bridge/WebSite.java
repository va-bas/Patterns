package com.vabas.patterns.bridge;



public abstract class WebSite {
    protected Creator creator;

    protected WebSite(Creator creator){
        this.creator = creator;
    }

    public abstract void createWebSite();
}
