package org.example;
import java.util.Date;
public abstract class User {
    Date birthDate;
    String fio;
    int ID;


    public User(Date birthDate, String fio, int ID) {
        this.birthDate = birthDate;
        this.fio = fio;
        this.ID = ID;
    }

    public User() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
