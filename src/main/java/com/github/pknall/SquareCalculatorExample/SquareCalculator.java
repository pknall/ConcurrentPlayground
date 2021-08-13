package com.github.pknall.SquareCalculatorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {

    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        // Creates an instance of the call() method using a lambda expression
        return executorService.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }
}
