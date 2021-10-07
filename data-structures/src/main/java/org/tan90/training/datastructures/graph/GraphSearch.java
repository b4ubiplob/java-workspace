package org.tan90.training.datastructures.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

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

}
