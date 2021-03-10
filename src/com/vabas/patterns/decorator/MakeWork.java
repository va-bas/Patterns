package com.vabas.patterns.decorator;

public class MakeWork {
    public static void main(String[] args) {

        Worker worker = new Security(new Director(new Janitor()));

        System.out.println(worker.makeJob());
    }
}
