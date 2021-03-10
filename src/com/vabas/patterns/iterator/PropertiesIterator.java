package com.vabas.patterns.iterator;

public class PropertiesIterator implements Iterator{
    int index;
    WebSite webSite;

    public PropertiesIterator(WebSite webSite) {
        this.webSite = webSite;
    }

    public int getIndex() {
        return index + 1;
    }

    @Override
    public boolean hasNext() {
        return index < webSite.getProperties().length;
    }

    @Override
    public Object next() {
        return webSite.getProperties()[index++];
    }
}
