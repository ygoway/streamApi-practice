package com.ygoway.strreamTasks.task1.predicate;

import com.ygoway.strreamTasks.task1.pojo.Student;

public class StudentsAvgMarkPredicate implements StudentIntPredicate {
    @Override
    public boolean filter(Student student, int markPredicate) {
        return student.getAvgMark() == markPredicate;
    }
}
