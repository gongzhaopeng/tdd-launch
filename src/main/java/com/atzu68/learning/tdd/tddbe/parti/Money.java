package com.atzu68.learning.tdd.tddbe.parti;

class Money implements Expression {

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Money money
                && amount == money.amount
                && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}