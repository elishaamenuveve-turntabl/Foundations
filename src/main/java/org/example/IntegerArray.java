package org.example;

import java.util.Arrays;

public class IntegerArray {

    public static int[] getMaxValueToTheRightOfIndex(int[] array) {
        int numberOfElements = array.length;
        int[] maxValueToTheRightOfIndex = new int[numberOfElements];

        maxValueToTheRightOfIndex[numberOfElements-1] = -1;
        for (int currentIndex = numberOfElements-2; currentIndex >= 0; currentIndex--) {
            maxValueToTheRightOfIndex[currentIndex] =
                    Math.max(array[currentIndex + 1], maxValueToTheRightOfIndex[currentIndex + 1]);
        }

        return maxValueToTheRightOfIndex;
    }
}
