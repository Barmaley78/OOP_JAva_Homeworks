package org.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService uS = new UserService();
        List<User> users = new ArrayList<>();
        users.add(uS.create(new Student()));
        users.add(uS.create(new Teacher()));
        uS.read(users);
        View view = new View();
        System.out.println(view.studentView(users));
    }
}
