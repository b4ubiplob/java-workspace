package org.tan90.training.datastructures.binarytree;


public class BinaryTreeNode {
    
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    public BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public BinaryTreeNode getLeft() {
        return left;
    }
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }
    public BinaryTreeNode getRight() {
        return right;
    }
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

}
