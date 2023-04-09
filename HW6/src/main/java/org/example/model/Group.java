package org.example.model;

import java.util.List;
/*
* принцип S - класс отвечает только за действия с объектами типа группа
*/
public class Group{
    int groupID;
    Teacher teacher;
    List<Student> users;

    public Group() {
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public Group(int groupID, Teacher teacher, List<Student> users) {
        this.groupID = groupID;
        this.teacher = teacher;
        this.users = users;
    }
    @Override
    public String toString() {
        return "Group{ " + "teacher="  + teacher + ", users= " + users + '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getUsers() {
        return users;
    }

    public void setUsers(List<Student> users) {
        this.users = users;
    }
}