package org.example;

import java.util.Stack;

public class Parenthetic {
    public static boolean containsBalancedParenthesis(String string) {
        //default implementation
        int evaluator = 0;
        for (char s: string.toCharArray()) {
            if (s=='(') ++evaluator;
            else if (--evaluator < 0) return false;
        }
        return evaluator==0;
    }

    public static boolean containsBalancedParenthesis(String string, char openParenthesis) {
        //default implementation
        int evaluator = 0;
        for (char s: string.toCharArray()) {
            if (s==openParenthesis) ++evaluator;
            else if (--evaluator < 0) return false;
        }
        return evaluator==0;
    }


    public static boolean containsBalancedParenthesisExtended(String string, char[] openParenthesis, char[] closedParenthesis) {
        //extendedImplementation
        if (openParenthesis.length!=closedParenthesis.length) throw new RuntimeException();
        Stack<Character> stack = new Stack<>();
        for (char s: string.toCharArray()) {
            for (int i = 0; i< openParenthesis.length; i++) {
                if (s==openParenthesis[i]) stack.push(openParenthesis[i]);
                else if (s==closedParenthesis[i]) {
                    if (stack.pop() != openParenthesis[i]) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
