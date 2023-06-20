package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {


    @Test
    void stringReversalTest() {
        String string = "Hello World!";
        String actual = StringManipulator.reverseString(string);

        Assertions.assertEquals("!dlroW olleH", actual);
    }
}