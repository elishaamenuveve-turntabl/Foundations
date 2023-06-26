package org.example;

import java.util.Collection;
import java.util.stream.IntStream;

public class FullStack<T> {
    private int stackLevel;
    private int currentStackSize;
    private T[] stackArray;

    public FullStack() {
        this(3);
    }

    public FullStack(int initialStackSize) {
        stackArray = (T[])new Object[initialStackSize> 0 ? initialStackSize: 3];
        currentStackSize = initialStackSize;
    }

    public FullStack(Collection<? extends T> collection) {
        this(collection.size());
        collection.forEach(item -> {
            stackArray[stackLevel++] = item;
        });
    }


    public void push(T element){
        if (stackLevel==currentStackSize) throw new RuntimeException("Stack is Full");
        stackArray[stackLevel++] = element;
    }
    public T pop() {
        if (stackLevel==0) throw new RuntimeException("Stack is empty");
        return stackArray[--stackLevel];
    }

    public T peek() {
        if (stackLevel==0) throw new RuntimeException("Stack is empty");
        return stackArray[stackLevel];
    }

}
