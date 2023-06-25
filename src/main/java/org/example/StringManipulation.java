package org.example;


public class StringManipulation {
    public static String reverseStringExcludingSpecialCharacter(String string, char specialCharacter) {
        char[] reversedString = new char[string.length()];

        int pointer_front = 0;
        int pointer_back = string.length()-1;

        while (pointer_front < pointer_back) {
            if (string.charAt(pointer_front) == specialCharacter)  reversedString[pointer_front++] = specialCharacter;
            else if (string.charAt(pointer_back) == specialCharacter) reversedString[pointer_back--] = specialCharacter;
            else {
                reversedString[pointer_front] = string.charAt(pointer_back);
                reversedString[pointer_back--] = string.charAt(pointer_front++);
            }
        }

        return String.valueOf(reversedString);
    }
}
