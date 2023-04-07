package org.example.model;

import java.util.Date;
import java.util.List;

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

