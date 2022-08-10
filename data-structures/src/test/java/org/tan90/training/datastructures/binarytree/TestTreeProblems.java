package org.tan90.training.datastructures.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTreeProblems {
	
	@Test
	public void testIsSameTree() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		assertTrue(new TreeProblems().isSameTree(p, q));
	}
	
	@Test
	public void testIsSameTree2() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);
		
		assertFalse(new TreeProblems().isSameTree(p, q));
	}

}
