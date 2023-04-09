package org.example.model;

import java.util.Date;
import java.util.List;

/*
 * принцип S - класс отвечает только за действия с объектами типа студент
 * принцип D - класс описываюший реальные (конечные) объекты наследуется от абстрактного
 */
public class Student extends User{



    public Student(Date birthDate, String fio, int iD) {
        super(birthDate, fio, iD);
    }

    public Student(){
    }
    @Override
    public String toString() {
        return "Student{ " +
                " groupID= " + groupID +
                ", birthDate= " + birthDate +
                ", fio Student = '" + fio + '\'' +
                ", ID= " + iD +
                '}';
    }

}

