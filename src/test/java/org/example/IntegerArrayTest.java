package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntegerArrayTest {

    @Test
    void getMaxValueToTheRightOfIndex() {
        int[] actual = IntegerArray.getMaxValueToTheRightOfIndex(new int[]{8, 54, 3, 6, 2, 5, 42, 6, 2, 35, 2, 4, 2});
        int[] expected = new int[] {54, 42, 42, 42, 42, 42, 35, 35, 35, 4, 4, 2, -1};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }
}