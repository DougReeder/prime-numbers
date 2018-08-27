package com.hominidsoftware.primes;

import org.junit.jupiter.api.Test;

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
    
}
