package org.tan90.training.datastructures.binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testInorderTraversal() {
		
		TreeNode p = new TreeNode(1);
		TreeNode p1 = new TreeNode(2);
		p.right = p1;
		p1.left = new TreeNode(3);
		
		List<Integer> treeList = new TreeProblems().inorderTraversal(p);
		assertEquals(3, treeList.size());
		int num = treeList.get(0);
		assertEquals(1, num);
		num = treeList.get(1);
		assertEquals(3, num);
		num = treeList.get(2);
		assertEquals(2, num);
		
	}

}
