package com.atzu68.learning.tdd.tddbe.c1;

public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        final var dollar = (Dollar) o;
        return amount == dollar.amount;
    }
}
