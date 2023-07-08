package com.ygoway.streamTasks.task1;

import com.ygoway.streamTasks.task1.pojo.Student;
import com.ygoway.streamTasks.task1.predicate.StudentIntPredicate;
import com.ygoway.streamTasks.task1.predicate.StudentsAgePredicate;
import com.ygoway.streamTasks.task1.predicate.StudentsAvgMarkPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  Є список студентів з наступними полями: ім’я, вік, середній бал.
    Треба отримати список імен студентів, які мають вік більше 18 років та отримали оцінку 90.  */

public class Task1 {

    private static StudentIntPredicate studentsAgePredicate = new StudentsAgePredicate();
    private static StudentIntPredicate studentsAvgMarkPredicate = new StudentsAvgMarkPredicate();

    public static List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student("Andrii", 24, 80),
            new Student("Anna", 20, 90),
            new Student("Petro", 22, 90),
            new Student("Yana", 18, 80),
            new Student("Jenya", 18, 90),
            new Student("Olena", 17, 90)
    ));

    public static List<String> task1filter(List<Student> studentsInput) {
        List<Student> outputList = new ArrayList<>();
        for (Student student : studentsInput) {
            if (studentsAgePredicate.filter(student, 18) &&
                    studentsAvgMarkPredicate.filter(student, 90)) {
                outputList.add(student);
            }
        }
        return studentsAgePredicate.listOfStudentsName(outputList);
    }

}
