package org.tan90.training.datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {
    
    private LinkedListNode start;

    public LinkedListNode getStart() {
    	return start;
    }
    
    public void setStart(LinkedListNode node) {
    	start = node;
    }
    
    public void addNode(int value) {
        if (start == null) {
            start = new LinkedListNode(value);
            return;
        }

        LinkedListNode current = start;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new LinkedListNode(value));
    }

    public void addNode(LinkedListNode node) {
        if (start == null) {
            start = node;
        }

        LinkedListNode current = start;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public String getLinkedList() {
        LinkedListNode current = start;

        StringBuilder stringBuilder = new StringBuilder();
        while (current != null) {
            stringBuilder.append(current.getValue()).append("->");
            current = current.getNext();
        }
        return stringBuilder.toString();
    }

    public void reverseLinkedList() {
        if (start == null) {
            return;
        }

        LinkedListNode currentNode = start;
        LinkedListNode nextNode = start.getNext();
        LinkedListNode previousNode = null;

        while (nextNode != null) {
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.getNext();
            currentNode.setNext(previousNode);
        }
        start = currentNode;
    
    }

    public int getMiddleElement() {
    	LinkedListNode slow = start;
    	LinkedListNode fast = start;
    	
    	while (fast != null) {
    		fast = fast.getNext();
    		if (fast == null) {
    			break;
    		}
    		fast = fast.getNext();
    		slow = slow.getNext();
    	}
    	return slow.getValue();
    }

    public boolean detectLoop() {
        LinkedListNode fast = start;
        LinkedListNode slow = start;

        while (fast != null) {
            fast = fast.getNext();
            if (fast == null) {
                return false;
            }
            fast = fast.getNext();
            if (fast == slow) {
                return true;
            }
            slow = slow.getNext();
        }
        return false;
    }
    
    public void removeDuplicates() {
    	Set<Integer> numbers = new HashSet<>();
    	
    	LinkedListNode current = start;
    	LinkedListNode previousNode = null;
    	
    	while (current != null) {
    		int num = current.getValue();
    		if (numbers.contains(num)) {
    			LinkedListNode nextNode = current.getNext();
    			previousNode.setNext(nextNode);
    			current = nextNode;
    		}
    		else {
    			numbers.add(num);
    			previousNode = current;
    			current = current.getNext();
    		}
    	
    	}
    }

    public LinkedListNode mergeTwoLists(LinkedListNode list1, LinkedListNode list2) {
    	
    	if (list1 == null) {
    		return list2;
    	}
    	if (list2 == null) {
    		return list1;
    	}
    	LinkedListNode start = null;
    	LinkedListNode current = null;
    	while (list1 != null && list2 != null) {
    		if (current == null) {
        		current = new LinkedListNode();
        		start = current;
    		}
    		else {
    			LinkedListNode newNode = new LinkedListNode();
    			current.setNext(newNode);
    			current = current.getNext();
    		}
    		if (list1.getValue() > list2.getValue()) {
    			current.setValue(list2.getValue());
    			list2 = list2.getNext();
    		}
    		else {
    			current.setValue(list1.getValue());
    			list1 = list1.getNext();
    		}
    		
    	}
		while (list1 != null) {
			LinkedListNode newNode = new LinkedListNode(list1.getValue());
			current.setNext(newNode);
			current = current.getNext();
			list1 = list1.getNext();
		}
    	
    	while (list2 != null) {
    		LinkedListNode newNode = new LinkedListNode(list2.getValue());
    		current.setNext(newNode);
    		current = current.getNext();
    		list2 = list2.getNext();
    	}
    	return start;
    	
    }
}
