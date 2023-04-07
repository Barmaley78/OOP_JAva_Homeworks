package org.example.model;

import java.util.Date;
import java.util.List;

public class Teacher extends User{
    int exp;


    @Override
    public String toString() {
        return "Teacher{ " +
                ", birthDate= " + birthDate +
                ", fio Teacher = '" + fio + '\'' +
                ", ID= " + iD +
                '}';
    }

    public Teacher(int exp, List<Integer> group, Date birthDate, String fio, int iD) {
        super(birthDate, fio, iD);
    }
    public Teacher() {}
}

