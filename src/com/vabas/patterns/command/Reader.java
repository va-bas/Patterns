package com.vabas.patterns.command;

public class Reader {
    Command add;
    Command take;
    Command read;

    public Reader(Command add, Command take, Command read) {
        this.add = add;
        this.take = take;
        this.read = read;
    }

    public void addBook(){
        add.runCommand();
    }

    public void takeBook(){
        take.runCommand();
    }

    public void readBook(){
        read.runCommand();
    }
}
