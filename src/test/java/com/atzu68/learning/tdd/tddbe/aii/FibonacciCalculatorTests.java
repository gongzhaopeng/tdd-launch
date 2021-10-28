package com.atzu68.learning.tdd.tddbe.aii;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciCalculatorTests {

    private final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

    @Test
    void fibonacci() {
        final int[][] cases = {
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5}
        };
        Stream.of(cases).forEach(c -> assertEquals(c[1], fibonacciCalculator.fib(c[0])));
    }
}
