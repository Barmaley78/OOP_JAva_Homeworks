package org.example.model;

import java.util.List;

public interface GroupDataService {
    Group CreateGroup(int groupID, Teacher teacher, List<Student> users);
}
