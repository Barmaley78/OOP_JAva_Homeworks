package org.example.controller;

import org.example.model.*;
import org.example.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void start() {



        UserService us = new UserService();
        List<User> users = new ArrayList<>();

        View view = new View();
        Model model = new Model();
        int choise = 1;
        while(choise !=5){
            choise = view.menu();
            switch (choise){
                case 1:
                    model.createUser(new Student());
                    break;
                case 2:
                    model.createUser(new Teacher());
                    break;
                case 3:
                    model.createGroup(new Group(),new Teacher(),new ArrayList<Student>());
                    break;
                case 4:
                    view.showGroupList(model.getGroupList());
                    break;
            }
        }
    }
}
