package com.vabas.patterns.prototype;

public class WebRunner {
    public static void main(String[] args) {
        Website master = new Website(1, "masterSite", "this code for pattern ....");


        master.showWs();

        WebsiteFactory factory = new WebsiteFactory(master);
        Website masterClone = factory.cloneWebsite();
        System.out.println("\n-------------------------\n");
        masterClone.showWs();

    }
}
