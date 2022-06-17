package org.tan90.training.datastructures.graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphSearch {
	
	public static <T> Optional<GraphNode<T>> breadthFirstSearch(T value, GraphNode<T> start) {
		Queue<GraphNode<T>> queue = new ArrayDeque<>();
		queue.add(start);
		
		Set<GraphNode<T>> visitedGraphNodes = new HashSet<>();
		GraphNode<T> currentNode;
		
		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			System.out.println("Visiting node with value : " + currentNode.getValue());
			if (currentNode.getValue().equals(value)) {
				return Optional.of(currentNode);
			}
			else {
				visitedGraphNodes.add(currentNode);
				queue.addAll(currentNode.getNeighbours());
				queue.removeAll(visitedGraphNodes);
			}
		}
		return Optional.empty();
	}

	
	public static <T> String getDepthFirstTraversal(DirectedGraphNode<T> start) {
		StringBuilder sb = new StringBuilder();
		Stack<DirectedGraphNode<T>> stack = new Stack<>();
		stack.add(start);
		while (!stack.isEmpty()) {
			DirectedGraphNode<T> node = stack.pop();
			sb.append(node.getValue().toString() + ">>");
			Set<DirectedGraphNode<T>> neighbours = node.getNeighbours();
			for (DirectedGraphNode<T> neighbourNode : neighbours) {
				stack.push(neighbourNode);
			}
		}
		
		return sb.toString();
		
	}
	
	public static <T> String getBreadthFirstTraversal(DirectedGraphNode<T> start) {
		StringBuilder sb = new StringBuilder();
		Queue<DirectedGraphNode<T>> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()) {
			DirectedGraphNode<T> node = queue.poll();
			sb.append(node.getValue().toString() + ">>");
			Set<DirectedGraphNode<T>> neighbours = node.getNeighbours();
			for (DirectedGraphNode<T> neighbourNode : neighbours) {
				queue.add(neighbourNode);
			}
		}
		return sb.toString();
	}
	
	public static boolean hasPath(String start, String end, Map<String, String[]> graph) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push(start);
		while (!stack.isEmpty()) {
			String str = stack.pop();
			if (str.equals(end)) {
				return true;
			}
			stack.addAll(Arrays.asList(graph.get(str)));
		}
		return false;
	}


	public static int countConnectedComponnents(Map<Integer, Integer[]> graph) {
		int count  = 0;
		Set<Integer> visitedNodes = new HashSet<>();
		for (Integer node : graph.keySet()) {
			if (!visitedNodes.contains(node)) {
				Stack<Integer> stack = new Stack<>();
				stack.push(node);
				while (!stack.isEmpty()) {
					Integer number = stack.pop();
					visitedNodes.add(number);
					for (Integer num : graph.get(number)) {
						if (!visitedNodes.contains(num)) {
							stack.push(num);
						}
					}
				}
				count++;
			}
		}
		
		return count;
	}

	
	public static int getMaxComponentCount(Map<Integer, Integer[]> graph) {
		int max = 0;
		Set<Integer> visitedNodes = new HashSet<>();
		for (Integer node : graph.keySet()) {
			if (!visitedNodes.contains(node)) {
				Stack<Integer> stack = new Stack<>();
				stack.push(node);
				int count = 0;
				while (!stack.isEmpty()) {
					Integer number = stack.pop();
					visitedNodes.add(number);
					count++;
					for (Integer num : graph.get(number)) {
						if (!visitedNodes.contains(num) && !stack.contains(num)) {
							stack.push(num);
						}
					}
				}
				if (count > max) {
					max = count;
				}
			}
		}
		
		return max;
	}


	public static int findShortestPath(String source, String target, Map<String, String[]> graph) {
		
		Queue<String> queue = new LinkedList<>();
		queue.add(source);
		Map<String, Integer> distanceMap = new HashMap<>();
		distanceMap.put(source, 0);
		

		while (!queue.isEmpty()) {
			
			String node = queue.poll();
			
			if (node.equals(target)) {
				return distanceMap.get(node);
			}
		
			for (String neighbour : graph.get(node)) {
				if (!distanceMap.containsKey(neighbour)) {
					distanceMap.put(neighbour, distanceMap.get(node) + 1);
					queue.add(neighbour);
				}
			}
			
		}
		return -1;
	}


	public static int countIslands(String[][] grid) {
		int count = 0;
		
		Set<GridNode> visitedNodes = new HashSet<>();	
		int rows = grid.length;
		int columns = grid[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				GridNode gridNode = new GridNode(i, j);
				
				if (!visitedNodes.contains(gridNode)) {
					if (grid[i][j].equals("L")) {
						Stack<GridNode> stack = new Stack<>();
						stack.push(gridNode);
						
						while (!stack.isEmpty()) {
							GridNode current = stack.pop();
							visitedNodes.add(current);
							
							int p = current.getRow();
							int q = current.getColumn();
							
							if (insertGridNode(grid, p+1, q, visitedNodes, stack)) {
								stack.push(new GridNode(p+1, q));
							}
							
							if (insertGridNode(grid, p-1, q, visitedNodes, stack)) {
								stack.push(new GridNode(p-1, q));
							}
							
							if (insertGridNode(grid, p, q-1, visitedNodes, stack)) {
								stack.push(new GridNode(p, q-1));
							}
							
							if (insertGridNode(grid, p, q + 1, visitedNodes, stack)) {
								stack.push(new GridNode(p, q+1));
							}
							
						}
						count++;
					}
				}
			}
		}
		return count;
	}
	
	private static boolean insertGridNode(String[][] grid, int row, int column, Set<GridNode> visitedNodes, Stack<GridNode> stack) {
		if (row < 0 || row >= grid.length) {
			return false;
		}
		if (column < 0 || column >= grid[0].length) {
			return false;
		}
		
		if (!grid[row][column].equals("L")) {
			return false;
		}
		
		if (visitedNodes.contains(new GridNode(row, column))) {
			return false;
		}
		if (stack.contains(new GridNode(row, column))) {
			return false;
		}
		return true;
		
	}


	public static int minimumIslands(String[][] grid) {
		int minimum = Integer.MAX_VALUE;
		
		Set<GridNode> visitedNodes = new HashSet<>();	
		int rows = grid.length;
		int columns = grid[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				GridNode gridNode = new GridNode(i, j);
				
				if (!visitedNodes.contains(gridNode)) {
					if (grid[i][j].equals("L")) {
						Stack<GridNode> stack = new Stack<>();
						int size = 0;
						stack.push(gridNode);
						
						while (!stack.isEmpty()) {
							GridNode current = stack.pop();
							size++;
							visitedNodes.add(current);
							
							int p = current.getRow();
							int q = current.getColumn();
							
							if (insertGridNode(grid, p+1, q, visitedNodes, stack)) {
								stack.push(new GridNode(p+1, q));
							}
							
							if (insertGridNode(grid, p-1, q, visitedNodes, stack)) {
								stack.push(new GridNode(p-1, q));
							}
							
							if (insertGridNode(grid, p, q-1, visitedNodes, stack)) {
								stack.push(new GridNode(p, q-1));
							}
							
							if (insertGridNode(grid, p, q + 1, visitedNodes, stack)) {
								stack.push(new GridNode(p, q+1));
							}
							
						}
						if (size < minimum) {
							minimum = size;
						}
					}
				}
			}
		}
		return minimum;
	}

}
