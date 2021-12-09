package org.tan90.training.datastructures.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestSingleLinkedList {
    
    @Test
    public void testAddNode() {
         SingleLinkedList singleLinkedList = new SingleLinkedList();
         singleLinkedList.addNode(2);
         singleLinkedList.addNode(8);
         singleLinkedList.addNode(4);
         
         String linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->4->", linkedList);
         
         singleLinkedList.addNode(6);
         
         linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->4->6->", linkedList);

     }
     
     
     @Test
     public void testReverseLinkedList() {
         SingleLinkedList singleLinkedList = new SingleLinkedList();
         
         singleLinkedList.addNode(2);
         singleLinkedList.addNode(8);
         singleLinkedList.addNode(4);
         
         String linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->4->", linkedList);
         
         singleLinkedList.reverseLinkedList();
         linkedList = singleLinkedList.getLinkedList();
         assertEquals("4->8->2->", linkedList);
         
     }
     
     @Test
     public void testGetMiddle() {
    	 SingleLinkedList singleLinkedList = new SingleLinkedList();
    	 singleLinkedList.addNode(2);
         singleLinkedList.addNode(8);
         singleLinkedList.addNode(4);
         singleLinkedList.addNode(7);
         singleLinkedList.addNode(10);
         singleLinkedList.addNode(19);
         singleLinkedList.addNode(3);
         
         String linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->4->7->10->19->3->", linkedList);
         
         int number = singleLinkedList.getMiddleElement();
         assertEquals(7, number);
         
         singleLinkedList = new SingleLinkedList();
    	 singleLinkedList.addNode(2);
         singleLinkedList.addNode(8);
         singleLinkedList.addNode(4);
         singleLinkedList.addNode(7);
         singleLinkedList.addNode(10);
         singleLinkedList.addNode(19);
         
         linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->4->7->10->19->", linkedList);
         
         number = singleLinkedList.getMiddleElement();
         assertEquals(7, number);
         
     }

     @Test
     public void testRemoveDuplicates() {
    	 SingleLinkedList singleLinkedList = new SingleLinkedList();
    	 singleLinkedList.addNode(2);
         singleLinkedList.addNode(8);
         singleLinkedList.addNode(2);
         singleLinkedList.addNode(7);
         singleLinkedList.addNode(10);
         singleLinkedList.addNode(2);
         singleLinkedList.addNode(3);
         
         String linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->2->7->10->2->3->", linkedList);
         
         singleLinkedList.removeDuplicates();
         
         linkedList = singleLinkedList.getLinkedList();
         assertEquals("2->8->7->10->3->", linkedList);
     }

}
