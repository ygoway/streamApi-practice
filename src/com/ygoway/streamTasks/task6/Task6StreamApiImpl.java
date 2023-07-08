package com.ygoway.streamTasks.task6;

/*Є список чисел. Необхідно визначити, чи є хоча б 1 парне.*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task6StreamApiImpl {

    public static List<Integer> listOfNumbers = Arrays.asList(1, 3, 5, 12, 35, 11, 14, 46);

    public boolean thereEvenNumberInList(List<Integer> integers) {
        return integers.stream()
                .anyMatch(integer -> integer % 2 == 0);
    }

    public List<Integer> suchEvenNumbersInList(List<Integer> integers) {
        return integers.stream()
                .filter(integer -> integer % 2 == 0)
                .toList();
    }

    public Optional<Integer> suchFirstEvenNumberInList(List<Integer> integers) {
        return integers.stream()
                .filter(integer -> integer % 2 == 0)
                .findFirst();
    }
}
