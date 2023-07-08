package com.ygoway.streamTasks.task4;

/*Є список користувачів з полями: ім’я, зарплата. Знайти користувача з найвищою зарплатою*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4StreamApiImpl {

    public static List<User> usersList = new ArrayList<>(Arrays.asList(
            new User("Bob", 600),
            new User("Helen", 700),
            new User("Petro", 735),
            new User("Andriy", 1200),
            new User("Olga", 1020),
            new User("Muhamed", 960)
    ));

    public User getUserWithMostSalary(List<User> usersList) {
        return usersList.stream()
                .max(Comparator.comparingInt(User::getSalary)).get();
    }
}
