package com.atzu68.learning.tdd.tddbe.parti;

interface Expression {

    Expression plus(Expression addend);

    Expression times(int multiplier);

    Money reduce(Bank bank, String to);
}
