package com.atzu68.learning.tdd.tddbe.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarTests {

    @Test
    void multiplication() {

        final var five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
