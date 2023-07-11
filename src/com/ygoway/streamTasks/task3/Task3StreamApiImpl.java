package com.ygoway.streamTasks.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Є список продуктів з наступними полями: назва товару, ціна, кількість. Треба обчислити загальну вартість всіх товарів*/

public class Task3StreamApiImpl {

    public static List<Product> listOfProducts = new ArrayList<>(Arrays.asList(
            new Product("Banana", BigDecimal.valueOf(10), 5),
            new Product("Orange", BigDecimal.valueOf(15), 10),
            new Product("Apple", BigDecimal.valueOf(10), 10),
            new Product("Cherry", BigDecimal.valueOf(15), 10)
    ));

    public BigDecimal generalCost(List<Product> productList) {
        return productList.stream()
                .map(product -> product.getPrice().multiply(BigDecimal.valueOf(product.getCount())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
