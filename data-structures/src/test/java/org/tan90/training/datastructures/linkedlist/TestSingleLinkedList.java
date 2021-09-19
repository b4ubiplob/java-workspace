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


}
