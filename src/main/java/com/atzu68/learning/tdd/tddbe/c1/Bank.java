package com.atzu68.learning.tdd.tddbe.c1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Bank {

    private final Map<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    private record Pair(String from, String to) {

        @Override
        public boolean equals(Object o) {

            return o instanceof Pair pair
                    && from.equals(pair.from)
                    && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }
}
