package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FullCounterTest {

    @Test
    void characterCountTest() {
        String string = "The quick brown fox jumps over the lazy dog";
        Map<Character, Integer> expected = new HashMap<>(Map.of('a', 1, 'b', 1, 'c', 1, 'd', 1,
                'e', 3, 'f', 1, 'g', 1, 'h', 2, 'i', 1, 'j', 1));
        expected.putAll(Map.of('k',1, 'l',1, 'm',1, 'n',1, 'o',4,
                'p',1, 'q',1, 'r',2, 's',1, 't',2));
        expected.putAll(Map.of('u',2, 'v',1, 'w',1, 'x',1, 'y',1,
                'z',1));

        assertEquals(expected, FullCounter.countOccurenceOfCharacters(string));
        FullCounter.countOccurenceOfCharactersStream(string);
    }

}