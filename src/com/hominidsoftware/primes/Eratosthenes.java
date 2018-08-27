package com.hominidsoftware.primes;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Eratosthenes implements PrimeNumberGenerator {
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        if (startingValue < 0 || endingValue < 0) {
            throw new IllegalArgumentException("endpoints must be 0 or greater");
        }

        // sieves
        BitSet sieve = new BitSet(endingValue+1);
        sieve.set(2, endingValue+1);

        int currentPrime = 1;   // not actually a prime
        while ((currentPrime = sieve.nextSetBit(currentPrime+1)) >= 0) {
            for (int number=currentPrime*2; number<=endingValue; number+=currentPrime) {
                sieve.clear(number);
            }
        }

        // converts to output format
        List<Integer> primes = new ArrayList<>();
        for (int i = sieve.nextSetBit(startingValue); i >= 0; i = sieve.nextSetBit(i+1)) {
            primes.add(i);
        }
        return primes;
    }

    @Override
    public boolean isPrime(int value) {
        throw new UnsupportedOperationException();
    }
}
