package com.vabas.patterns.iterator;

public class WebSite implements Collection{
    private String name;
    private String[] properties;

    public WebSite(String name, String[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }

    @Override
    public Iterator getIterator(Object obj) {
        return new PropertiesIterator((WebSite) obj);
    }

    /*@Override
    public Iterator getIterator() {
        return new PropertiesIterator();
    }

    private class PropertiesIterator implements Iterator{
        int index;

        public int getIndex() {
            return index;
        }

        @Override
        public boolean hasNext() {
            return index < properties.length;
        }

        @Override
        public Object next() {
            return properties[index++];
        }
    }*/
}
