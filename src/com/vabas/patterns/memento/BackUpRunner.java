package com.vabas.patterns.memento;

public class BackUpRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        BackUp backUp = new BackUp();

        System.out.println("Creating new project version 1.0");
        project.setVersionAndDate("version 1.0");
        System.out.println(project);

        System.out.println("Saving backup");
        backUp.setSave(project.save());
        Thread.sleep(5000);
        System.out.println("Updating project for version 1.1");
        project.setVersionAndDate("version 1.1");
        System.out.println(project);
        System.out.println("Load old version 1.0");
        project.load(backUp.getSave());
        System.out.println(project);
    }
}
