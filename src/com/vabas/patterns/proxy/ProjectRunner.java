package com.vabas.patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://getmaket.ru/makets/project");

        project.run();

    }
}
