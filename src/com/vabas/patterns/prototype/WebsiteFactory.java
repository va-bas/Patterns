package com.vabas.patterns.prototype;

public class WebsiteFactory {
    Website website;

    public WebsiteFactory(Website website) {
        this.website = website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    Website cloneWebsite(){
        return (Website) website.copy();
    }
}
