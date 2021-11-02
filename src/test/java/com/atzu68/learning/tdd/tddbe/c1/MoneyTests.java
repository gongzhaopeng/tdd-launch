package com.atzu68.learning.tdd.tddbe.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTests {

    @Test
    void equality() {
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    void currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void differentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
    }
}
