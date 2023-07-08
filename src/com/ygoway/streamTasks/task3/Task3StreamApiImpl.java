package com.ygoway.streamTasks.task3;

/*Є список продуктів з наступними полями: назва товару, ціна, кількість. Треба обчислити загальну вартість всіх товарів*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3StreamApiImpl {

    public static List<Product> listOfProducts = new ArrayList<>(Arrays.asList(
            new Product("Banana", 10, 5),
            new Product("Orange", 15, 10),
            new Product("Apple", 10, 10),
            new Product("Cherry", 15, 10)
    ));

    public int generalCost(List<Product> productList) {
        return productList.stream()
                .map(product -> (product.getPrice() * product.getCount()))
                .mapToInt(Integer::shortValue)
                .sum();
    }

}
