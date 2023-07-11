package com.ygoway.streamTasks.task5;

import java.math.BigInteger;
import java.util.stream.IntStream;

/*Обрахувати факторіал числа*/

public class Task5StreamApiImpl {

    public BigInteger countingFactorialReturnBigInteger(Integer inputNumber) {
        if(inputNumber < 2) return BigInteger.valueOf(1);
        return IntStream.range(1, inputNumber + 1)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .get();
    }

    public Integer countingFactorialReturnInteger(Integer input) {
        return IntStream.range(1, input + 1)
                .reduce(1, (a, b) -> a * b);
    }

    public BigInteger countingFactorialUseParallelStream(int inputNumber) {
        if(inputNumber < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, inputNumber)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .get();
    }
}
