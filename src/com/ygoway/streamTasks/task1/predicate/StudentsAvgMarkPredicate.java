package com.ygoway.streamTasks.task1.predicate;

import com.ygoway.streamTasks.task1.pojo.Student;

public class StudentsAvgMarkPredicate implements StudentIntPredicate {
    @Override
    public boolean filter(Student student, int markPredicate) {
        return student.getAvgMark() == markPredicate;
    }
}
