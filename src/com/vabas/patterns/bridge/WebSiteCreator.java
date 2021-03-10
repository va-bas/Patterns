package com.vabas.patterns.bridge;

import com.vabas.patterns.prototype.Website;

public class WebSiteCreator {
    public static void main(String[] args) {
        WebSite [] webSites = {
                new VisitCardSite(new PhpCreator()),
                new InternetShop(new HtmlCreator())
        };

        for (WebSite webSite: webSites){
            webSite.createWebSite();
        }
    }
}
