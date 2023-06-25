package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ELinkedListTest {

    ELinkedList<String> classUnderTest = new ELinkedList<>();

    @Test
    void itemsCanBeInsertedIntoLinkedList() {
        classUnderTest.insert("Hello");
        assertEquals(1, classUnderTest.getSize());
        assertEquals("Hello", classUnderTest.get(0));
    }

    @Test
    void linkedListSizeGrowsAsMoreItemsAreAdded() {
        classUnderTest.insert("Hello");
        assertEquals(1, classUnderTest.getSize());
        classUnderTest.insert("Hello");
        assertEquals(2, classUnderTest.getSize());
        classUnderTest.insert("Hello");
        assertEquals(3, classUnderTest.getSize());
        classUnderTest.insert("Hello");
        assertEquals(4, classUnderTest.getSize());
    }

    @Test
    void linkedListItemsCanBeGotten() {
        classUnderTest.insert("Hello");
        classUnderTest.insert("World");
        classUnderTest.insert("My");
        classUnderTest.insert("Name");

        assertEquals(4, classUnderTest.getSize());
        assertEquals("Hello",classUnderTest.get(0));
        assertEquals("World",classUnderTest.get(1));
        assertEquals("My",classUnderTest.get(2));
        assertEquals("Name",classUnderTest.get(3));
    }

    @Test
    void linkedListItemsCanBeDeleted() {
        classUnderTest.insert("Hello");
        classUnderTest.insert("World");
        classUnderTest.insert("My");
        classUnderTest.insert("Name");
        classUnderTest.insert("Is");

        assertEquals(5, classUnderTest.getSize());
        assertEquals("My",classUnderTest.get(2));

        classUnderTest.delete(2);

        assertEquals(4, classUnderTest.getSize());
        assertEquals("Name",classUnderTest.get(2));

        classUnderTest.delete(3);
        classUnderTest.insert("Elisha");
        assertEquals("Elisha",classUnderTest.get(3));
    }



}