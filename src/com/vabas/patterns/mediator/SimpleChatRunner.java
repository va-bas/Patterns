package com.vabas.patterns.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "user 1");
        User user2 = new SimpleUser(chat, "user 2");
        User user3 = new SimpleUser(chat, "user 3");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);


        user1.sendMassage("Hello, i'm user 1");
        admin.sendMassage("It's my chat, i'm god here !!!");
    }
}
