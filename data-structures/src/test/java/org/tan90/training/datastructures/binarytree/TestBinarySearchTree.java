package org.tan90.training.datastructures.binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearchTree {
    
    @Test
    public void addNodeTest() {
        
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNode(100);
        binarySearchTree.addNode(50);
        binarySearchTree.addNode(150);
        
        String tree = binarySearchTree.getInorderTraversalTree();
        assertEquals("50>>100>>150>>", tree);
        
        tree = binarySearchTree.getPreOrderTraversalTree();
        assertEquals("100>>50>>150>>", tree);
        
        tree = binarySearchTree.getPostOrderTraversalTree();
        assertEquals("50>>150>>100>>", tree);
        
        binarySearchTree.addNode(75);
        binarySearchTree.addNode(175);
        binarySearchTree.addNode(125);
        
        tree = binarySearchTree.getInorderTraversalTree();
        assertEquals("50>>75>>100>>125>>150>>175>>", tree);
        
        tree = binarySearchTree.getPreOrderTraversalTree();
        assertEquals("100>>50>>75>>125>>150>>175>>", tree);
        
        tree = binarySearchTree.getPostOrderTraversalTree();
        assertEquals("50>>75>>125>>150>>175>>100>>", tree);
    }

}
