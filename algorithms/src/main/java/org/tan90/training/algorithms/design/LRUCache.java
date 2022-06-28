package org.tan90.training.algorithms.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCache {

	private Map<Integer, ListNode> map;
	private int capacity;
	private ListNode head;
	private ListNode tail;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new ConcurrentHashMap<>(capacity);
	}

	public int get(int key) {
		if (!map.containsKey(key)) {
			return -1;
		}
		ListNode node = map.get(key);
		removeFromLinkedList(node);
		addToLinkedList(node);
		return node.value;

	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			ListNode node= map.get(key);
			removeFromLinkedList(node);
			ListNode newNode = new ListNode(key, value);
			map.put(key, newNode);
			addToLinkedList(newNode);
			return;
		}
		if (map.size() != this.capacity) {
			ListNode node = new ListNode(key, value);
			map.put(key, node);
			addToLinkedList(node);
		} else {
			map.remove(tail.key);
			removeFromLinkedList(tail);
			ListNode node = new ListNode(key, value);
			map.put(key, node);
			addToLinkedList(node);
		}
	}

	private void removeFromLinkedList(ListNode node) {
		if (node.next == null) {
			ListNode previous = node.previous;
			if (previous != null) {
				previous.next = null;
				tail = previous;
			}
			
		}
		else if (node.previous == null) {
			head = node.next;
			if (head != null) {
				head.previous = null;
				node.next = null;
			}
			
		}
		else {
			ListNode previousNode = node.previous;
			ListNode nextNode = node.next;
			previousNode.next = nextNode;
			nextNode.previous = previousNode;
		}

	}

	private void addToLinkedList(ListNode node) {
		if (head == null) {
			head = node;
			tail = head;
		} else {
			node.next = head;
			head.previous = node;
			head = node;
		}
	}

	class ListNode {

		private int value;
		private int key;
		private ListNode next;
		private ListNode previous;

		public ListNode(int key, int value) {
			this.key = key;
			this.value = value;
			this.next = null;
			this.previous = null;
		}

	}

}
