package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBinaryTreeTest {

    @Test
    void demo() {
        var tree = new EBinaryTree<Integer>(Integer::compareTo);
        tree.insert(9);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.insert(10);
        tree.insert(17);

        tree.preOrderTraversal();
        tree.postOrderTraversal();
        tree.levelOrderTraversal();
    }

}