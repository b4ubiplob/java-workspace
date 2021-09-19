package org.tan90.training.datastructures.linkedlist;

public class SingleLinkedList {
    
    private LinkedListNode start;

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

}
