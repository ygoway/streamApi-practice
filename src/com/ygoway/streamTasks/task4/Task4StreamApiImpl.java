package com.ygoway.streamTasks.task4;

import java.math.BigDecimal;
import java.util.*;

/*Є список користувачів з полями: ім’я, зарплата. Знайти користувача з найвищою зарплатою*/

public class Task4StreamApiImpl {

    public static List<User> usersList = new ArrayList<>(Arrays.asList(
            new User("Bob", BigDecimal.valueOf(600)),
            new User("Helen", BigDecimal.valueOf(700)),
            new User("Petro", BigDecimal.valueOf(735)),
            new User("Andriy", BigDecimal.valueOf(1200)),
            new User("Olga", BigDecimal.valueOf(1020)),
            new User("Muhamed", BigDecimal.valueOf(960))
    ));

    public User getUserWithMostSalary(List<User> usersList) {
        return usersList.stream()
                .max(Comparator.comparing(User::getSalary)).orElse(usersList.get(2));
    }
}
