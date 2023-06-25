package org.example;

import java.util.*;

public class EBinaryTree<T> {
    private BinaryNode<T> rootNode;
    private Comparator<T> comparator;

    public EBinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void insert(T element) {
        var currentNode = rootNode;
        if (currentNode == null) rootNode = new BinaryNode<>(element);
        else while (true) {
            BinaryNode<T> nextNode;
            int comparison = comparator.compare(element, currentNode.data);

            if (comparison < 0) nextNode = currentNode.getLeftNode();
            else if (comparison > 0) nextNode = currentNode.getRightNode();
            else break;


            if (nextNode == null) {
                if (comparison < 0)  currentNode.setLeftNode(new BinaryNode<>(element));
                else currentNode.setRightNode(new BinaryNode<>(element));
                break;
            } else currentNode = nextNode;
        }
    }

    public void preOrderTraversal() {
        Stack<BinaryNode<T>> stack = new Stack<>();
        if (rootNode != null) stack.add(rootNode);
        while (!stack.isEmpty()) {
            var currentNode = stack.pop();
            System.out.println(currentNode.getData());
            if (currentNode.getRightNode() != null) stack.add(currentNode.getRightNode());
            if (currentNode.getLeftNode() != null) stack.add(currentNode.getLeftNode());
        }
    }

    public void postOrderTraversal() {
        Stack<BinaryNode<T>> stack = new Stack<>();
        if (rootNode != null) stack.add(rootNode);
        while (!stack.isEmpty()) {
            var currentNode = stack.pop();
            System.out.println(currentNode.getData());
            if (currentNode.getLeftNode() != null) stack.add(currentNode.getLeftNode());
            if (currentNode.getRightNode() != null) stack.add(currentNode.getRightNode());
        }
    }

    public void levelOrderTraversal() {
        List<BinaryNode<T>> queue = new ArrayList<>();
        if (rootNode != null) queue.add(rootNode);
        while (!queue.isEmpty()) {
            var currentNode = queue.remove(0);
            System.out.println(currentNode.getData());
            if (currentNode.getLeftNode() != null) queue.add(currentNode.getLeftNode());
            if (currentNode.getRightNode() != null) queue.add(currentNode.getRightNode());
        }
    }




    private static class BinaryNode<E> {
        private E data;
        private BinaryNode<E> leftNode;
        private BinaryNode<E> rightNode;

        public BinaryNode(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public BinaryNode<E> getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(BinaryNode<E> leftNode) {
            this.leftNode = leftNode;
        }

        public BinaryNode<E> getRightNode() {
            return rightNode;
        }

        public void setRightNode(BinaryNode<E> rightNode) {
            this.rightNode = rightNode;
        }
    }

}
