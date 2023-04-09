package org.example.model;

import java.util.List;
/*
Принцип O - использование интерфейса с последующей имплементацией в отдельные классы
позволяет его соблюсти
 */
public interface DataService {
    User create(Student student);
    User create(Teacher teacher);
    List<User> read(List<User> users);
}
