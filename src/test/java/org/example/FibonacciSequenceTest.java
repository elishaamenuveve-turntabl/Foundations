package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    @Test
    public void getNThTerm() {
        //0, 1, 1, 2, 3, 5, 8
        //7778742049
        assertEquals(2, FibonacciSequence.getNThTerm(4));
        assertEquals(3, FibonacciSequence.getNThTerm(5));
        assertEquals(5, FibonacciSequence.getNThTerm(6));
        assertEquals(7778742049L, FibonacciSequence.getNThTerm(50));

    }
}