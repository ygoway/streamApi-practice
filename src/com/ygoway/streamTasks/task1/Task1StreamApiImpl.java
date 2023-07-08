package com.ygoway.strreamTasks.task1;

import com.ygoway.strreamTasks.task1.pojo.Student;

import java.util.List;
import java.util.stream.Collectors;

import static com.ygoway.strreamTasks.task1.Task1.studentList;

public class Task1StreamApiImpl {

    public void task1Function() {
        studentList.stream()
                .filter(student -> student.getAge() > 18 && student.getAvgMark() == 90)
                .map(Student::getFirstName)
                .forEach(System.out::println);
    }

    public List<String> task1FunctionWithInput(List<Student> inputStudents) {
        return inputStudents.stream()
                .filter(student -> student.getAge() > 18 && student.getAvgMark() == 90)
                .map(Student::getFirstName)
                .collect(Collectors.toList());
    }
}
