package org.example.model;

import java.util.Date;
import java.util.List;
/*
 * принцип S - класс отвечает только за действия с объектами типа учитель
 * принцип D - класс описываюший реальные (конечные) объекты наследуется от абстрактного
 */
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

