package com.ygoway.streamTasks.task1.predicate;

import com.ygoway.streamTasks.task1.pojo.Student;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface StudentIntPredicate {

    boolean filter(Student student, int predicate);

    default List<String> listOfStudentsName(List<Student> studentList) {
        List<String> studentNames = new ArrayList<>();
        for (Student student : studentList) {
            studentNames.add("Student{" + student.getFirstName() + "}");
        }
        return studentNames;
    }
}
