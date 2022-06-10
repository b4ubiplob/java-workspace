package org.tan90.training.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private BinaryTreeNode root;

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public String getDepthFirstSearchTree() {
        if (root == null) {
            return "";
        }
        return getDepthFirstSearchString(root);
    }

    private String getDepthFirstSearchString(BinaryTreeNode currentNode) {
        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            return currentNode.getValue() + ">>";
        }
        String value = "" + currentNode.getValue() + ">>";
        if (currentNode.getLeft() != null) {
            value = value + getDepthFirstSearchString(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            value = value + getDepthFirstSearchString(currentNode.getRight());
        }
        return value;
    }
    

    public String getDepthFirstSearchRecursive() {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            sb.append(node.getValue() + ">>");
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        return sb.toString();
    }

    public String getBreadthFirstSearchRecursive() {
        if (root == null) {
            return "";
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            sb.append(node.getValue() + ">>");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return sb.toString();
    }


    public boolean treeIncludes(int target) {
        if (root == null) {
            return false;
        }

        return treeIncludes(root, target);
    }

    private boolean treeIncludes(BinaryTreeNode node, int target) {
        if (node == null) {
            return false;
        }
        if (node.getValue() == target) {
            return true;
        }
        return treeIncludes(node.getLeft(), target) || treeIncludes(node.getRight(), target);
    }


    public int treeSum() {
        if (root == null) {
            return 0;
        }
        return treeSum(root);
    }

    private int treeSum(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        int sum  = node.getValue();
        return sum + treeSum(node.getLeft()) + treeSum(node.getRight());
    }

    public int getMinValue() {
        if (root == null) {
            return -1;
        }

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        int min = root.getValue();
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            if (node.getValue() < min) {
                min = node.getValue();
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
        }
        return min;
    }

    public int getMaxRootToLeafPathSum() {
        if (root == null) {
            return 0;
        }

        return getMaxRootToLeafPathSum(root);
    }

    private int getMaxRootToLeafPathSum(BinaryTreeNode node) {
        if (node.getLeft() == null && node.getRight() == null) {
            return node.getValue();
        }

        if (node.getLeft() == null) {
            return node.getValue() + getMaxRootToLeafPathSum(node.getRight());
        }

        if (node.getRight() == null) {
            return node.getValue() + getMaxRootToLeafPathSum(node.getLeft());
        }

        return Math.max(node.getValue() + getMaxRootToLeafPathSum(node.getLeft()), node.getValue() + getMaxRootToLeafPathSum(node.getRight()));
    }
}
