package org.example;

import java.util.HashSet;

public class ELinkedList<T>  {
    private linkedNode<T> initialNode;
    private linkedNode<T> lastNode;
    private int size;


    public ELinkedList() {
    }

    public ELinkedList(T element) {
        this.initialNode = new linkedNode<>(element);
        this.size++;
    }

    public void insert(T element) {
        if (initialNode==null) {
            initialNode = new linkedNode<>(element);
            lastNode = initialNode;
        } else {
            var nextLinkedNode = new linkedNode<>(element);
            lastNode.setNextLinkedNode(nextLinkedNode);
            lastNode = nextLinkedNode;
        }
        this.size++;
    }

    public int getSize() {
        return size;
    }

    public T get(int index) {
        if (index >= size || index < 0) throw new RuntimeException("Index out of bounds");
        var currentNode = initialNode;
        for (int counter = 0; counter < index; counter++) {
            currentNode = currentNode.getNextLinkedNode();
        }
        return currentNode.data;
    }

    public void delete(int index) {
        if (index >= size || index < 0) throw new RuntimeException("Index out of bounds");
        var previousNode = initialNode;
        var currentNode = initialNode;
        for (int counter = 0; counter < index; counter++) {
            previousNode = currentNode;
            currentNode = currentNode.getNextLinkedNode();
        }
        if (index==0) {
            if (lastNode == initialNode) lastNode = null;
            initialNode = initialNode.getNextLinkedNode();
        }
        else {
            if (index == size - 1) lastNode = previousNode;
            previousNode.setNextLinkedNode(currentNode.getNextLinkedNode());
        }
        size--;
    }

    public Boolean isLoopPresent() {
        HashSet<linkedNode<T>> linkedNodes = new HashSet<>();
        if (initialNode==null) {
            return false;
        } else {
            var currentNode = initialNode;
            while (currentNode.getNextLinkedNode() != null) {
                if (linkedNodes.contains(currentNode)) return true;
                else linkedNodes.add(currentNode);
                currentNode = currentNode.getNextLinkedNode();
            }
        }
        return false;
    }

    private static class linkedNode<E> {
        private E data;
        private linkedNode<E> nextLinkedNode;

        public linkedNode(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public linkedNode<E> getNextLinkedNode() {
            return nextLinkedNode;
        }

        public void setNextLinkedNode(linkedNode<E> nextLinkedNode) {
            this.nextLinkedNode = nextLinkedNode;
        }
    }
}
