package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void reverseStringExcludingSpecialCharacter() {
        String actual = StringManipulation
                .reverseStringExcludingSpecialCharacter("salesperson",'s');

        String expected = "snorsepesla";

        assertEquals(expected, actual);
    }
}