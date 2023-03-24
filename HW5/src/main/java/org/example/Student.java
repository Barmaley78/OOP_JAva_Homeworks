package org.example;

import java.util.List;

public class Student extends User{

    int groupID;
    List<Integer> grade;

    public Student(int groupID, List<Integer> grade) {
        super(birthDate,
                fio,
                ID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupID=" + groupID +
                ", grade=" + grade +
                ", birthDate=" + birthDate +
                ", fio='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }
}
}
