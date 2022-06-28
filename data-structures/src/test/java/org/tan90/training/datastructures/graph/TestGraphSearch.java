package org.tan90.training.datastructures.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class TestGraphSearch {
	
	private DirectedGraphNode<String> traversalTestStart;
	
	@Before
	public void init() {
		traversalTestStart = new DirectedGraphNode<String>("a");
		DirectedGraphNode<String> b = new DirectedGraphNode<String>("b");
		DirectedGraphNode<String> c = new DirectedGraphNode<String>("c");
		DirectedGraphNode<String> d = new DirectedGraphNode<String>("d");
		DirectedGraphNode<String> e = new DirectedGraphNode<String>("e");
		DirectedGraphNode<String> f = new DirectedGraphNode<String>("f");

		traversalTestStart.connect(b);
		traversalTestStart.connect(c);
		b.connect(d);
		c.connect(e);
		d.connect(f);
	
		    
		
		
	}

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
	
	
	@Test
	public void testDepthFirstTraversal() {
		String result = GraphSearch.getDepthFirstTraversal(traversalTestStart);
		String expected = "a>>c>>e>>b>>d>>f>>";
		assertEquals(result, expected);
	}
	
	@Test
	public void testBreadthFirstTraversal() {
		String result = GraphSearch.getBreadthFirstTraversal(traversalTestStart);
		String expected = "a>>b>>c>>d>>e>>f>>";
		assertEquals(result, expected);
	}
	
	
	@Test
	public void testHasPath() {
//		DirectedGraphNode<String> f = new DirectedGraphNode<>("f");
//		DirectedGraphNode<String> g = new DirectedGraphNode<>("g");
//		DirectedGraphNode<String> h = new DirectedGraphNode<>("h");
//		DirectedGraphNode<String> i = new DirectedGraphNode<>("i");
//		DirectedGraphNode<String> j = new DirectedGraphNode<>("j");
//		DirectedGraphNode<String> k = new DirectedGraphNode<>("k");
		
		Map<String, String[]> graph = new HashMap<>();
		graph.put("f", new String[] {"g", "i"});
		graph.put("g", new String[] {"h"});
		graph.put("h", new String[] {});
		graph.put("i", new String[] {"g", "k"});
		graph.put("j", new String[] {"i"});
		graph.put("k", new String[] {});
		
		assertTrue(GraphSearch.hasPath("f", "k", graph));
		assertFalse(GraphSearch.hasPath("j", "f", graph));
		
		

	}
	
	@Test
	public void testCountConnectedComponents() {
		
		Map<Integer, Integer[]> graph = new HashMap<>();
		graph.put(3, new Integer[] {});
		graph.put(4, new Integer[] {6});
		graph.put(6, new Integer[] {4,5,7,8});
		graph.put(8, new Integer[] {6});
		graph.put(7, new Integer[] {6});
		graph.put(5, new Integer[] {6});
		graph.put(1, new Integer[] {2});
		graph.put(2, new Integer[] {2});
		
		assertEquals(3, GraphSearch.countConnectedComponnents(graph));

	}
	
	@Test
	public void testGetMaxComponentCount() {
		
		Map<Integer, Integer[]> graph = new HashMap<>();
		graph.put(3, new Integer[] {});
		graph.put(4, new Integer[] {6});
		graph.put(6, new Integer[] {4,5,7,8});
		graph.put(8, new Integer[] {6});
		graph.put(7, new Integer[] {6});
		graph.put(5, new Integer[] {6});
		graph.put(1, new Integer[] {2});
		graph.put(2, new Integer[] {2});
		
		assertEquals(5, GraphSearch.getMaxComponentCount(graph));
		
		
		Map<Integer, Integer[]> graph2 = new HashMap<>();
		graph2.put(0, new Integer[] {8,1,5});
		graph2.put(1, new Integer[] {0});
		graph2.put(5, new Integer[] {0,8});
		graph2.put(8, new Integer[] {0,5});
		graph2.put(2, new Integer[] {3,4});
		graph2.put(3, new Integer[] {2,4});
		graph2.put(4, new Integer[] {3,2});
		
		assertEquals(4, GraphSearch.getMaxComponentCount(graph2));

	}
	
	@Test
	public void testShortestPath() {
		
		Map<String, String[]> graph = new HashMap<>();
		
		graph.put("w", new String[] {"x", "v"});
		graph.put("v", new String[] {"w", "z"});
		graph.put("x", new String[] {"y", "w"});
		graph.put("y", new String[] {"x", "z"});
		graph.put("z", new String[] {"y", "v"});
		
		assertEquals(2, GraphSearch.findShortestPath("w", "z", graph));

	}

	@Test
	public void testIslandCount() {
		String[][] grid = {
				{"W", "L", "W", "W", "W"},
				{"W", "L", "W", "W", "W"},
				{"W", "W", "W", "L", "W"},
				{"W", "W", "L", "L", "W"},
				{"L", "W", "W", "L", "L"},
				{"L", "L", "W", "W", "W"}
		};
		
		assertEquals(3, GraphSearch.countIslands(grid));
		
		String[][] grid2 = {
				{"L", "L", "L"},
				{"L", "L", "L"},
				{"L", "L", "L"},
		};
		
		assertEquals(1, GraphSearch.countIslands(grid2));
		
		String[][] grid3 = {
				{"W", "W"},
				{"W", "W"},
				{"W", "W"},
		};
		
		assertEquals(0, GraphSearch.countIslands(grid3));
		
		
		String[][] grid4 = {
				{"L", "W", "W", "L", "W"},
				{"L", "W", "W", "L", "L"},
				{"W", "L", "W", "L", "W"},
				{"W", "W", "L", "L", "W"},
				{"W", "W", "W", "W", "W"},
				{"W", "W", "L", "L", "L"}
		};
		
		assertEquals(4, GraphSearch.countIslands(grid4));
	
	}
	
	@Test
	public void testMinimumIsland() {
		String[][] grid = {
				{"W", "L", "W", "W", "W"},
				{"W", "L", "W", "W", "W"},
				{"W", "W", "W", "L", "W"},
				{"W", "W", "L", "L", "W"},
				{"L", "W", "W", "L", "L"},
				{"L", "L", "W", "W", "W"}
		};
		
		assertEquals(2, GraphSearch.minimumIslands(grid));
		
		String[][] grid2 = {
				{"L", "L", "L"},
				{"L", "L", "L"},
				{"L", "L", "L"},
		};
		
		assertEquals(9, GraphSearch.minimumIslands(grid2));
		
//		String[][] grid3 = {
//				{"W", "W"},
//				{"W", "W"},
//				{"W", "W"},
//		};
//		
//		assertEquals(0, GraphSearch.minimumIslands(grid3));
		
		
		String[][] grid4 = {
				{"L", "W", "W", "L", "W"},
				{"L", "W", "W", "L", "L"},
				{"W", "L", "W", "L", "W"},
				{"W", "W", "L", "L", "W"},
				{"W", "W", "W", "W", "W"},
				{"W", "W", "L", "L", "L"}
		};
		
		assertEquals(1, GraphSearch.minimumIslands(grid4));
	
	}
	
	@Test
	public void testCourseSchedule() {
		int[][] edgeList = {
				{0,1},
				{3,0},
				{1,3},
				{2,1},
				{4,1},
				{4,2},
				{5,3},
				{5,4}
		};
		
		assertFalse(GraphSearch.courseSchedule(edgeList));
		
		int[][] edgeList2 = {
				{3,0},
				{1,3},
				{2,1},
				{4,1},
				{4,2},
				{5,3},
				{5,4}
		};
		
		assertTrue(GraphSearch.courseSchedule(edgeList2));
	}
	
	
}
