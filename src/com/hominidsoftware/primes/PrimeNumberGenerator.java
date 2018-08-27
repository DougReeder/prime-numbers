package com.hominidsoftware.primes;

import java.util.List;

public interface PrimeNumberGenerator {
    /**
     * Returns an ordered list of all prime numbers in a given range (inclusive of the endpoints)
     * Endpoints may be in either order.
     *
     * @param startingValue the non-negative, inclusive start of the range
     * @param endingValue the non-negative, inclusive end of the range
     * @return the primes in ascending order
     */
    List<Integer> generate(int startingValue, int endingValue);

    boolean isPrime(int value);
}
