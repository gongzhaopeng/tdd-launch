package com.atzu68.learning.tdd.tddbe.c1;

interface Expression {

    Expression plus(Expression addend);

    Expression times(int multiplier);

    Money reduce(Bank bank, String to);
}
