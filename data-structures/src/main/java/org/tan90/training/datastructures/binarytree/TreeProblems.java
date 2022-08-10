package org.tan90.training.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TreeProblems {
	
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 if (p == null && q == null) {
			 return true;
		 }
		 if (p == null && q != null) {
			 return false;
		 }
		 if (p != null && q == null) {
			 return false;
		 }
		 if (p.val != q.val) {
			 return false;
		 }
		 if (!isSameTree(p.left, q.left)) {
			 return false;
		 }
		 if (!isSameTree(p.right, q.right)) {
			 return false;
		 }
	     return true;   
	 }
	 
	 public List<Integer> inorderTraversal(TreeNode root) {
		 
		 List<Integer> tree = new ArrayList<>();
		 if (root != null) {
			 tree.addAll(inorderTraversal(root.left));
			 tree.add(root.val);
			 tree.addAll(inorderTraversal(root.right));
		 }
		 return tree;
	        
	 }

}
