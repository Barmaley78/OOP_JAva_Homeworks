package org.example.model;

import java.util.List;

public class StudyGroupService implements GroupDataService{
    @Override
    public Group CreateGroup(int groupID, Teacher teacher, List<Student> users) {
        return new Group(groupID,teacher, users);
    }
}
