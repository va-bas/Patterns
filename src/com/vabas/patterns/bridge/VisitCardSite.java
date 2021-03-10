package com.vabas.patterns.bridge;

public class VisitCardSite extends WebSite{
    protected VisitCardSite(Creator creator) {
        super(creator);
    }

    @Override
    public void createWebSite() {
        System.out.println("Visit card creating in progress .....");
        creator.writeCode();
    }
}
