package com.vabas.patterns.bridge;

public class InternetShop extends WebSite{
    protected InternetShop(Creator creator) {
        super(creator);
    }

    @Override
    public void createWebSite() {
        System.out.println("Internet shop creating in progress .....");
        creator.writeCode();
    }
}
