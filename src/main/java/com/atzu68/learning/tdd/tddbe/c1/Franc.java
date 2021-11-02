package com.atzu68.learning.tdd.tddbe.c1;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
