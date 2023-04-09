package org.example.model;

import java.util.List;
/*
Принцип O - использование интерфейса с последующей имплементацией в отдельные классы
позволяет его соблюсти

Принцип I - рапзделение и создание нескольких интерфейсов под разичные виды объектов.
Это позволяет диференцировать использование прописанных в них методов под различныв задачи
 */
public interface GroupDataService {
    Group CreateGroup(int groupID, Teacher teacher, List<Student> users);
}
