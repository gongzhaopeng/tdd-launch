package com.atzu68.learning.tdd.tddbe.c1;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
