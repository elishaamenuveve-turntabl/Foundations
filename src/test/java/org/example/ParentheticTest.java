package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentheticTest {

    @Test
    void ParenthesisAreBalancedAndCorrectlyNested() {
        String string = "()(()())";
        assertTrue(Parenthetic.containsBalancedParenthesis(string));

        string = "(()()))(";
        assertFalse(Parenthetic.containsBalancedParenthesis(string));

        string = "(()()";
        assertFalse(Parenthetic.containsBalancedParenthesis(string));


        string = "({}){]{]";
        boolean actual = Parenthetic.containsBalancedParenthesisExtended(string,
                "({[".toCharArray(),
                ")}]".toCharArray());

        assertFalse(actual);

        actual = Parenthetic.containsBalancedParenthesisExtended("{}{}[]()(",
                "({[".toCharArray(),
                ")}]".toCharArray());
        assertFalse(actual);

        actual = Parenthetic.containsBalancedParenthesisExtended("[]{}(([]{}{[]})())",
                "({[".toCharArray(),
                ")}]".toCharArray());

        assertTrue(actual);

    }

}