package com.vabas.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User user){
        this.admin = user;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMassage(String massage, User user) {
        for (User u: users){
            if (u != user){
                u.getMassage(massage);
            }
        }
        admin.getMassage(massage);
    }
}
