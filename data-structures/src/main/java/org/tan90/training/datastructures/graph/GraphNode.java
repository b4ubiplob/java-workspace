package org.tan90.training.datastructures.graph;

import java.util.HashSet;
import java.util.Set;

public class GraphNode<T> {

	private T value;
	private Set<GraphNode<T>> neighbours;
	
	public GraphNode(T value) {
		this.value = value;
		this.neighbours = new HashSet<>();
	}
	
	public void connect(GraphNode<T> graphNode) {
		if (this == graphNode) {
			throw new IllegalArgumentException("Cannot connect to itself");
		}
		this.neighbours.add(graphNode);
		graphNode.neighbours.add(this);
	}
	
	public T getValue() {
		return this.value;
	}
	
	public Set<GraphNode<T>> getNeighbours() {
		return this.neighbours;
	}
}
