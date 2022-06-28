package org.tan90.training.algorithms.design;

public class MinStack {
	
	private ListNode start;
	private int min;
	
	public MinStack() {
		this.start = null;
		this.min = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
    	if (val < this.min) {
    		this.min = val;
    	}
        ListNode node = new ListNode(val);
        if (this.start == null) {
        	this.start = node;
        }
        else {
        	node.next = this.start;
        	this.start = node;
        }
    }
    
    public void pop() {
    	if (this.start.value == this.min) {
    		findMin();
    	}
    	this.start = this.start.next;
        
    }
    
    public int top() {
    	if (start != null) {
    		 int value = start.value;
    	     start = start.next;
    	     if (value == this.min) {
    	    	 findMin();
    	     }
    	     return value;
    	}
    	
    	return -1;
       
    }
    
    public void findMin() {
    	ListNode currentNode = this.start;
    	if (this.start == null) {
    		this.min = -1;
    	}
    	this.min = this.start.value;
    	
    	while (currentNode != null) {
    		if (this.min < currentNode.value) {
    			this.min = currentNode.value;
    		}
    		currentNode = currentNode.next;
    	}
    }
    
    public int getMin() {
    	return this.min;
    }
    
    class ListNode {
    	
    	private int value;
    	private ListNode next;
    	
    	public ListNode(int value) {
    		this.value = value;
    		this.next = null;
		}
    	
    	public String toString() {
    		return this.value + ">>" + this.next;
    	}
    }

}
