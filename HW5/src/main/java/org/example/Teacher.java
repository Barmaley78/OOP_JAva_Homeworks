package org.example;

import java.util.List;

public class Teacher extends User{
    int exp;
    List<Integer> group;

    @Override
    public String toString() {
        return "Teacher{" +
                "exp=" + exp +
                ", group=" + group +
                ", birthDate=" + birthDate +
                ", fio='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Teacher(int exp, List<Integer> group) {
        super();
    }
}

