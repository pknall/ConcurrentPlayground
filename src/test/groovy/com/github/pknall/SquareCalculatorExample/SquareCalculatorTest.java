package com.github.pknall.SquareCalculatorExample;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class SquareCalculatorTest {

    @Test
    void calculate() {
        Future<Integer> future = new SquareCalculator().calculate(10);

        while (!future.isDone()) {
            System.out.println("Calculating....");
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

        try {
            Integer result = future.get();
            System.out.println("Result: " + result);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}