package org.example.view;

import org.example.model.User;
import org.example.model.Group;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class View {
    public String studentView(List<User> students){
        return students.toString();
    }

    public int menu(){
        Scanner s = new Scanner(System.in);
        int choise = 0;
        boolean f = false;
        while(f == false){
            System.out.println("Выберите действие");
            System.out.println("1. Создать студента");
            System.out.println("2. Создать преподавателя");
            System.out.println("3. Создать группу");
            System.out.println("4. Вывести группы");
            System.out.println("5. Выход");
            System.out.println("Ваш выбор ");
            choise = s.nextInt();
            if (choise < 1 || choise > 5){
                System.out.println("Неопределенное действие");
            }
            else {f = true;}
        }
        return choise;
    }

    public void showGroupList(List<Group> groupList){
        System.out.println("вывод списка групп");
        for(Group group: groupList){
            group.toString();
        }
    }

}
