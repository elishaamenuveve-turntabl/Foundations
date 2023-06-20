package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringManipulator {
    public static String reverseString(String string) {
        // initial implementation
/*        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; --i) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();*/

        // streams implementation
        return IntStream.range(1, string.length()+1)
                .mapToObj(i-> string.charAt(string.length() - i))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        //recursion implementation
//        return innerStringReversal("", string.length()-1,string);
    }

    private static String innerStringReversal(String accumulation, int index, String string) {
        if (index == 0) return accumulation + string.charAt(index);
        else return innerStringReversal(accumulation + string.charAt(index), index-1, string);
    }

}
