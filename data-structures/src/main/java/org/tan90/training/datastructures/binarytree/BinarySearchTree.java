package org.tan90.training.datastructures.binarytree;

public class BinarySearchTree {
    
private BinaryTreeNode top;
    
    public void addNode(int value) {
        if (top == null) {
            top = new BinaryTreeNode(value);
            return;
        }
        addNodeRecursive(value, top);
    }
    
    public void addNodeRecursive(int value, BinaryTreeNode node) {
        if (value >= node.getValue()) {
            if (node.getRight() != null) {
                addNodeRecursive(value, node.getRight());
            }
            else {
                node.setRight(new BinaryTreeNode(value));
            }
        }
        else {
            if (node.getLeft() != null) {
                addNodeRecursive(value, node.getLeft());
            }
            else {
                node.setLeft(new BinaryTreeNode(value));
            }
        }
    }
    
    public String getInorderTraversalTree() {
        return inOrderTraversal(top, "");
    }

    private String inOrderTraversal(BinaryTreeNode node, String str) {
        String str2 = "";
        if (node != null) {
            str2 += inOrderTraversal(node.getLeft(), str);
            str2 += node.getValue() + ">>";
            str2 += inOrderTraversal(node.getRight(), str);
        }
        return str2;
    }
    
    public String getPreOrderTraversalTree() {
        return preOrderTraversal(top, "");
    }
    
    private String preOrderTraversal(BinaryTreeNode node, String str) {
        String str2 = "";
        if (node != null) {
            str2 += node.getValue() + ">>";
            str2 += inOrderTraversal(node.getLeft(), str);
            str2 += inOrderTraversal(node.getRight(), str);
        }
        return str2;
    }
    
    public String getPostOrderTraversalTree() {
        return postOrderTraversal(top, "");
    }
    
    private String postOrderTraversal(BinaryTreeNode node, String str) {
        String str2 = "";
        if (node != null) {
            str2 += inOrderTraversal(node.getLeft(), str);
            str2 += inOrderTraversal(node.getRight(), str);
            str2 += node.getValue() + ">>";
        }
        return str2;
    }

}
