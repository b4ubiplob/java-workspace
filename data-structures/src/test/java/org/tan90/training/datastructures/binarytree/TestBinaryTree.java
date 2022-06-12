package org.tan90.training.datastructures.binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBinaryTree {

    @Test
    public void testDepthFirstSearch() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(435);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

        String binaryTreeString = binaryTree.getDepthFirstSearchTree();
        String expectedString  = "100>>140>>110>>435>>109>>645>>";
        assertEquals(expectedString, binaryTreeString);
    }

    @Test
    public void testDepthFirstSearchRecursive() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(435);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

        String binaryTreeString = binaryTree.getDepthFirstSearchRecursive();
        String expectedString  = "100>>140>>110>>435>>109>>645>>";
        assertEquals(expectedString, binaryTreeString);
    }

    @Test
    public void testBreadthFirstSearchRecursive() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(435);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

        String binaryTreeString = binaryTree.getBreadthFirstSearchRecursive();
        String expectedString  = "100>>140>>109>>110>>435>>645>>";
        assertEquals(expectedString, binaryTreeString);
    }


    @Test
    public void testIncludes() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(435);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

       
        assertTrue(binaryTree.treeIncludes(110));
        assertTrue(binaryTree.treeIncludes(435));
        assertFalse(binaryTree.treeIncludes(111));

    }

    @Test
    public void testTreeSum() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(435);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

       
       assertEquals(1539, binaryTree.treeSum());

    }

    @Test
    public void testGetMinValue() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(65);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

       
       assertEquals(65, binaryTree.getMinValue());

    }

    @Test
    public void testGetMaxRootToLeafPathSum() {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(100);
        BinaryTreeNode a1 = new BinaryTreeNode(140);
        BinaryTreeNode a2 = new BinaryTreeNode(109);

        BinaryTreeNode c1 = new BinaryTreeNode(110);
        BinaryTreeNode c2 = new BinaryTreeNode(65);
        BinaryTreeNode c3 = new BinaryTreeNode(645);

        root.setLeft(a1);
        root.setRight(a2);

        a1.setLeft(c1);
        a1.setRight(c2);

        a2.setRight(c3);
        binaryTree.setRoot(root);

       
       assertEquals(854, binaryTree.getMaxRootToLeafPathSum());

    }
    
    @Test
    public void testIsSymmetricTree() {
    	BinaryTree binaryTree = new BinaryTree();
    	BinaryTreeNode root = new BinaryTreeNode(4);
    	
    	BinaryTreeNode a1 = new BinaryTreeNode(5);
    	BinaryTreeNode a2 = new BinaryTreeNode(5);
    	root.setLeft(a1);
    	root.setRight(a2);
    	
    	BinaryTreeNode b1 = new BinaryTreeNode(2);
    	BinaryTreeNode b2 = new BinaryTreeNode(8);
    	BinaryTreeNode b3 = new BinaryTreeNode(8);
    	BinaryTreeNode b4 = new BinaryTreeNode(2);
    	a1.setLeft(b1);
    	a1.setRight(b2);
    	a2.setLeft(b3);
    	a2.setRight(b4);
    	
    	BinaryTreeNode c1 = new BinaryTreeNode(9);
    	BinaryTreeNode c2 = new BinaryTreeNode(7);
    	BinaryTreeNode c3 = new BinaryTreeNode(1);
    	BinaryTreeNode c4 = new BinaryTreeNode(1);
    	BinaryTreeNode c5 = new BinaryTreeNode(7);
    	BinaryTreeNode c6 = new BinaryTreeNode(9);
    	
    	b1.setLeft(c1);
    	b1.setRight(c2);
    	b2.setLeft(c3);
    	b3.setRight(c4);
    	b4.setLeft(c5);
    	b4.setRight(c6);
    	
    	BinaryTreeNode d1 = new BinaryTreeNode(3);
    	BinaryTreeNode d2 = new BinaryTreeNode(0);
    	BinaryTreeNode d3 = new BinaryTreeNode(6);
    	BinaryTreeNode d4 = new BinaryTreeNode(6);
    	BinaryTreeNode d5 = new BinaryTreeNode(0);
    	BinaryTreeNode d6 = new BinaryTreeNode(3);
    	
    	c1.setLeft(d1);
    	c1.setRight(d2);
    	c2.setRight(d3);
    	c5.setLeft(d4);
    	c6.setLeft(d5);
    	c6.setRight(d6);
    	
    	binaryTree.setRoot(root);
    	
    	
    	assertTrue(binaryTree.isSymmetric());
    	
    	
    }
    
}
