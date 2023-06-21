package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FullCounter {
    public static Map<Character, Integer> countOccurenceOfCharacters(String string) {
        Map<Character, Integer> characterOccurence = new HashMap<>();
         string = string.replaceAll(" ", "").toLowerCase();
         for (var c : string.toCharArray()) {
             Integer count = characterOccurence.getOrDefault(c, 0) + 1;
             characterOccurence.put(c, count);
         }
         return characterOccurence;
    }

    public static Map<Character, Integer> countOccurenceOfCharactersStream(String string) {
        Map<Character, Integer> characterOccurence = new HashMap<>();
         Arrays.stream(string.replaceAll(" ", "").toLowerCase()
                 .split(""))
                 .forEach(System.out::println);
//                 .collect(HashMap<Character, Integer>::new,
//                         (map, element) -> map.put(element, 1),
//                         (map1, map2)-> map1.put(map1.getOrDefault(map1.getOrDefault(map2.keySet()))));
        
        return null;
    }
}
