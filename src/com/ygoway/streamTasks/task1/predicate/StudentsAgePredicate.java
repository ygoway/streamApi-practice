package com.ygoway.strreamTasks.task1.predicate;

import com.ygoway.strreamTasks.task1.pojo.Student;

public class StudentsAgePredicate implements StudentIntPredicate {
    @Override
    public boolean filter(Student student, int agePredicate) {
        return student.getAge() > agePredicate;
    }
}
