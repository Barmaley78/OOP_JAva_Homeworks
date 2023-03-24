package org.example;

import java.util.Date;
import java.util.List;

public class Student extends User{

    int groupID;
    List<Integer> grade;

    public Student(int groupID, List<Integer> grade, Date birthDate, String fio, int iD) {
        super(birthDate, fio, iD);
    }

    public Student(){
    }
    @Override
    public String toString() {
        return "Student{ " +
                " groupID= " + groupID +
                ", grade= " + grade +
                ", birthDate= " + birthDate +
                ", fio Student = '" + fio + '\'' +
                ", ID= " + iD +
                '}';
    }

}

