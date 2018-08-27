package com.hominidsoftware.primes;

import java.util.List;

public class Eratosthenes implements PrimeNumberGenerator {
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        if (startingValue < 0 || endingValue < 0) {
            throw new IllegalArgumentException("endpoints must be 0 or greater");
        }
        return null;
    }

    @Override
    public boolean isPrime(int value) {
        throw new UnsupportedOperationException();
    }
}
