package com.vabas.patterns.command;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        Reader reader = new Reader(new AddCommand(library),
                new ReadCommand(library), new TakeCommand(library));

        reader.addBook();
        reader.readBook();
        reader.takeBook();
    }
}
