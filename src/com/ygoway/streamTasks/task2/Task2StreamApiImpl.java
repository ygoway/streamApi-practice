package com.ygoway.streamTasks.task2;

/*Є двомірний масив (список списків) з числами, треба обрати лише унікальні елементb*/

import java.util.*;

public class Task2StreamApiImpl {

    public static Integer[][] doubleArrayOfIntegers = {
            {1, 2, 3, 4, 4, 5, 9, 12},
            {1, 2, 3, 4, 4, 4, 5, 6, 7,}
    };

    public static int[][] doubleArrayOfInts = {
            {1, 2, 3, 4, 4, 5, 9, 12},
            {1, 2, 3, 4, 4, 4, 5, 6, 7,}
    };

    public int[] task2FunctionReturnAndPrintSingleArrayOfUniqueInts(int[][] integers) {
        return Arrays.stream(integers)
                .flatMapToInt(integers1 -> Arrays.stream(integers1))
                .distinct()
                .peek(value -> System.out.printf(value + " "))
                .toArray();
    }

    public Integer[][] task2FunctionReturnDimensionalArrayOfUniqueIntegers(Integer[][] integers) {
        return Arrays.stream(integers)
                .map(integers1 -> {
                    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
                    linkedHashSet.addAll(Arrays.asList(integers1));
                    return linkedHashSet.stream().toArray(Integer[]::new);
                })
                .toArray(Integer[][]::new);
    }

}
