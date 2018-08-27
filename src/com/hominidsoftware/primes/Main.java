package com.hominidsoftware.primes;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int startingValue = 0;
        int endingValue = 100;

        if (args.length >= 1) {
            try {
                startingValue = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument `" + args[0] + "' must be an integer.");
                System.exit(1);
            }
        }
        if (args.length >= 2) {
            try {
                endingValue = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument `" + args[1] + "' must be an integer.");
                System.exit(2);
            }
        }

        final PrimeNumberGenerator generator = new Eratosthenes();

        List<Integer> primes = generator.generate(startingValue, endingValue);

        System.out.println(primes);
    }
}
