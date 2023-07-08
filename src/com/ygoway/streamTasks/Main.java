package com.ygoway.streamTasks;

import com.ygoway.streamTasks.task1.Task1StreamApiImpl;
import com.ygoway.streamTasks.task1.Task1;
import com.ygoway.streamTasks.task2.Task2StreamApiImpl;
import com.ygoway.streamTasks.task3.Task3StreamApiImpl;
import com.ygoway.streamTasks.task4.Task4StreamApiImpl;
import com.ygoway.streamTasks.task6.Task6StreamApiImpl;

import static com.ygoway.streamTasks.task2.Task2StreamApiImpl.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1.task1filter(Task1.studentList));
        Task1StreamApiImpl streamApiTask1 = new Task1StreamApiImpl();
        streamApiTask1.task1Function();
        System.out.println(streamApiTask1.task1FunctionWithInput(Task1.studentList));

        Task2StreamApiImpl streamApiTask2 = new Task2StreamApiImpl();
        streamApiTask2.task2FunctionReturnAndPrintSingleArrayOfUniqueInts(doubleArrayOfInts);

        Integer[][] result = streamApiTask2.task2FunctionReturnDimensionalArrayOfUniqueIntegers(doubleArrayOfIntegers);
        for (Integer[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        Task3StreamApiImpl task3StreamApi = new Task3StreamApiImpl();
        System.out.println("General sum of products is : " +
                task3StreamApi.generalCost(Task3StreamApiImpl.listOfProducts));

        Task4StreamApiImpl task4StreamApi = new Task4StreamApiImpl();
        System.out.println(task4StreamApi.getUserWithMostSalary(Task4StreamApiImpl.usersList));

        Task6StreamApiImpl task6StreamApi = new Task6StreamApiImpl();
        System.out.println("There is even number : " +
                task6StreamApi.thereEvenNumberInList(Task6StreamApiImpl.listOfNumbers));
    }
}
