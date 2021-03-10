package com.vabas.patterns.bridge;

public class HtmlCreator implements Creator{
    @Override
    public void writeCode() {
        System.out.println("Html creator write code ....");
    }
}
