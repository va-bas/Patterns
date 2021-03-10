package com.vabas.patterns.bridge;

public class PhpCreator implements Creator{
    @Override
    public void writeCode() {
        System.out.println("Php creator write code ....");
    }
}
