package org.tan90.training.datastructures.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

     @Test
     public void testDetectLoop() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(8);
        LinkedListNode node = new LinkedListNode(7);
        singleLinkedList.addNode(node);
        singleLinkedList.addNode(10);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(node);

        boolean result = singleLinkedList.detectLoop();
        assertTrue("The linked list contains a loop", result);

        singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(8);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(7);
        singleLinkedList.addNode(10);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        
        String linkedList = singleLinkedList.getLinkedList();
        assertEquals("2->8->2->7->10->2->3->", linkedList);
        result = singleLinkedList.detectLoop();
        assertFalse("The linked list does not contain a loop", result);


     }
     
     
     @Test
     public void testMergeTwoLists() {
    	 SingleLinkedList singleLinkedList1 = new SingleLinkedList();
    	 singleLinkedList1.addNode(1);
    	 singleLinkedList1.addNode(2);
    	 singleLinkedList1.addNode(4);
    	 
    	 assertEquals("1->2->4->", singleLinkedList1.getLinkedList());
    	 
    	 SingleLinkedList singleLinkedList2 = new SingleLinkedList();
    	 singleLinkedList2.addNode(1);
    	 singleLinkedList2.addNode(3);
    	 singleLinkedList2.addNode(4);
    	 
    	 assertEquals("1->3->4->", singleLinkedList2.getLinkedList());

    	 LinkedListNode node = new SingleLinkedList().mergeTwoLists(singleLinkedList1.getStart(), singleLinkedList2.getStart());
    	 
    	 SingleLinkedList linkedList = new SingleLinkedList();
    	 linkedList.setStart(node);
    	 
    	 assertEquals("1->1->2->3->4->4->", linkedList.getLinkedList());

     }

}
