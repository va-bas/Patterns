package com.vabas.patterns.command;

public class TakeCommand implements Command{
    Library library;

    public TakeCommand(Library library) {
        this.library = library;
    }

    @Override
    public void runCommand() {
        library.takeBook();
    }
}
