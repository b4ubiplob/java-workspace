package org.tan90.training.datastructures.linkedlist;

public class LinkedListNode {
    
    private int value;
    private LinkedListNode next;
    
    public LinkedListNode(int value) {
        this.value = value;
        next = null;
    }
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public LinkedListNode getNext() {
        return next;
    }
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    

}
