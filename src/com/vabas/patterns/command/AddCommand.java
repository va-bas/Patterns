package com.vabas.patterns.command;

public class AddCommand implements Command{
    Library library;

    public AddCommand(Library library) {
        this.library = library;
    }

    @Override
    public void runCommand() {
        library.addBook();
    }
}
