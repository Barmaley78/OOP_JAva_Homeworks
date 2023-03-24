package org.example;

import java.util.Date;
import java.util.List;

public class Teacher extends User{
    int exp;
    List<Integer> group;

    @Override
    public String toString() {
        return "Teacher{ " +
                " exp= " + exp +
                ", group= " + group +
                ", birthDate= " + birthDate +
                ", fio Teacher = '" + fio + '\'' +
                ", ID= " + iD +
                '}';
    }

    public Teacher(int exp, List<Integer> group, Date birthDate, String fio, int iD) {
        super(birthDate, fio, iD);
    }
    public Teacher() {
    }
}

