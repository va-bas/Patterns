package com.vabas.patterns.singleton;

public class SomeNotes {
    private static SomeNotes someNotes;
    private static String note = "This is notes: \n\n";

    public static synchronized SomeNotes getSomeNotes(){
        if (someNotes == null){
            someNotes = new SomeNotes();
        }
        return someNotes;
    }

    private SomeNotes(){

    }

    public void addNotes(String newNote){
        note += newNote + "\n";
    }

    public void showNotes(){
        System.out.println(note);
    }
}
