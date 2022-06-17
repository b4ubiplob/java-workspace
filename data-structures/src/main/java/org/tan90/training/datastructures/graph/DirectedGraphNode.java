package org.tan90.training.datastructures.graph;

import java.util.HashSet;
import java.util.Set;

public class DirectedGraphNode<T> {

	private T value;
	private Set<DirectedGraphNode<T>> neighbours;
	
	public DirectedGraphNode(T value) {
		this.value = value;
		this.neighbours = new HashSet<>();
	}
	
	public void connect(DirectedGraphNode<T> graphNode) {
		if (this == graphNode) {
			throw new IllegalArgumentException("Cannot connect to itself");
		}
		this.neighbours.add(graphNode);
	}
	
	public T getValue() {
		return this.value;
	}
	
	public Set<DirectedGraphNode<T>> getNeighbours() {
		return this.neighbours;
	}
}
