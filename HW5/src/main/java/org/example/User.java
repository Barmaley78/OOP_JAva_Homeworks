package org.example;
import java.util.Date;
public abstract class User {
    Date birthDate;
    String fio;
    int iD;


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
}
