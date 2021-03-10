package com.vabas.patterns.command;

public class DeleteCommand implements Command{
    Library library;

    public DeleteCommand(Library library) {
        this.library = library;
    }

    @Override
    public void runCommand() {
        library.deleteBook();
    }
}
