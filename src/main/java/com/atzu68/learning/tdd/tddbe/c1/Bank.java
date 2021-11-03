package com.atzu68.learning.tdd.tddbe.c1;

import java.util.HashMap;
import java.util.Map;

class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    private record Pair(String from, String to) {

        @Override
        public boolean equals(Object o) {
            Pair pair = (Pair) o;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
