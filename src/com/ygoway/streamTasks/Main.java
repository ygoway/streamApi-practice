package com.ygoway.strreamTasks;

import com.ygoway.strreamTasks.task1.Task1StreamApiImpl;
import com.ygoway.strreamTasks.task1.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1.task1filter(Task1.studentList));
        Task1StreamApiImpl streamApiTask1 = new Task1StreamApiImpl();
        streamApiTask1.task1Function();
        System.out.println(streamApiTask1.task1FunctionWithInput(Task1.studentList));

    }
}