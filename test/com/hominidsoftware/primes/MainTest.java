package com.hominidsoftware.primes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void should_run_without_args() {
        String[] args = {};
        Main.main(args);
        // output is not specified when arguments are missing
    }

    @Test
    void should_parse_two_args() {
        String[] args = {"31", "61"};
        Main.main(args);

        assertEquals("[31, 37, 41, 43, 47, 53, 59, 61]\n", outContent.toString());
    }


    // main exits if arguments don't parse. Testing that would require https://stefanbirkner.github.io/system-rules/
}
