package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FullStackTest {


    @Test
    void canCreateFullStackWithCollection() {
        List<String> stringList = new ArrayList<>(List.of("Java","Angular"));
        FullStack<String> developer = new FullStack<>(stringList);

        assertEquals("Angular",developer.pop());
        assertEquals("Java",developer.pop());
        assertThrows(RuntimeException.class, developer::pop);
    }

    @Test
    void FullStackResizesToAccomodateMoreItems() {
        FullStack<String> developer = new FullStack<>(2);
        developer.push("Java");
        developer.push("Angular");

        assertThrows(RuntimeException.class, ()->developer.push("TypeScript"));
        assertEquals("Angular",developer.pop());
        assertEquals("Java",developer.pop());
        assertThrows(RuntimeException.class, developer::pop);
    }
}