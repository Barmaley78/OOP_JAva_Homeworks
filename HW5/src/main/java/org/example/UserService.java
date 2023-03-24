package org.example;

import java.util.Date;
import java.util.List;

public class UserService implements DataService{

    @Override
    public User create(Student student) {
        return new Student(new Date(), "lsdkdh", 1);
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(new Date(), "srsr", 2);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
