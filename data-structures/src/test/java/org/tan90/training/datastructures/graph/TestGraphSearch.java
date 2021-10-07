package org.tan90.training.datastructures.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class TestGraphSearch {

	@Test
	public void testBreadthFirstSearch() {
		GraphNode<Integer> start = new GraphNode<>(10);
		start.connect(new GraphNode<Integer>(4));
		
		GraphNode<Integer> neighbour1 = new GraphNode<>(2);
		start.connect(neighbour1);
		
		GraphNode<Integer> neighbour2 = new GraphNode<>(3);
		neighbour1.connect(neighbour2);
		neighbour2.connect(start);
		
		
		Optional<GraphNode<Integer>> node =  GraphSearch.breadthFirstSearch(3, start);
		assertTrue(node.isPresent());
		
		
		Optional<GraphNode<Integer>> node1 =  GraphSearch.breadthFirstSearch(100, start);
		assertFalse(node1.isPresent());
		
		
		
	}
}
