package com.vabas.patterns.command;

public class ReadCommand implements Command{
    Library library;

    public ReadCommand(Library library) {
        this.library = library;
    }

    @Override
    public void runCommand() {
        library.readBook();
    }
}
