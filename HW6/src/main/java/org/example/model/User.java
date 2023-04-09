package org.example.model;
import java.util.Date;

/*
принцип L - использование абстрактного класса. Его нас ледники Учитель и студент  могут
расширяться новыми свойствами и методами, при этом не ломается общая логика кода
 */
public abstract class User {
    Date birthDate;
    String fio;
    int iD;
    int groupID;


    public User(Date birthDate, String fio, int iD) {
        this.birthDate = birthDate;
        this.fio = fio;
        this.iD = iD;
    }

    public User() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
}
