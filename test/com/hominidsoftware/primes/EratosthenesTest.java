package com.hominidsoftware.primes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {
    private final Eratosthenes eratosthenes = new Eratosthenes();

    @Test
    void should_reject_negative_startingValue() {
        assertThrows(IllegalArgumentException.class,()->{
            eratosthenes.generate(-1, 4);
        });
    }

    @Test
    void should_reject_negative_endingValue() {
        assertThrows(IllegalArgumentException.class,()->{
            eratosthenes.generate(4, -1);
        });
    }


    @Test
    void should_return_small_primes() {
        List<Integer> primes = eratosthenes.generate(0, 19);

        List<Integer> smallPrimes = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        assertEquals(smallPrimes, primes);
    }

    @Test
    void should_honor_startingValue() {
        List<Integer> primes = eratosthenes.generate(11, 19);

        List<Integer> smallPrimes = new ArrayList<Integer>(Arrays.asList(11, 13, 17, 19));
        assertEquals(smallPrimes, primes);
    }

    @Test
    void should_work_for_larger_ranges() {
        List<Integer> primes = eratosthenes.generate(7900, 7920);

        List<Integer> largerPrimes = new ArrayList<Integer>(Arrays.asList(7901, 7907, 7919));
        assertEquals(largerPrimes, primes);
    }
}
