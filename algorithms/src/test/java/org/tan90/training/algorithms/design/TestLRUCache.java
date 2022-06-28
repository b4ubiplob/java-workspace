package org.tan90.training.algorithms.design;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLRUCache {
	
	@Test
	public void testCache() {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		assertEquals(1, lRUCache.get(1));    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(-1, lRUCache.get(2));    // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(1));    // return -1 (not found)
		assertEquals(3, lRUCache.get(3));    // return 3
		assertEquals(4, lRUCache.get(4));    // return 4
		
	}
	
	@Test
	public void testCache2() {
		LRUCache lRUCache = new LRUCache(1);
		lRUCache.put(2, 1); // cache is {1=1}
		assertEquals(1, lRUCache.get(2));    // return 1
		
	}
	
	@Test
	public void testCache3() {
		LRUCache lRUCache = new LRUCache(2);
		
		assertEquals(-1, lRUCache.get(2));    // return 1

		
		lRUCache.put(2, 6); // cache is {2=6}
		
		assertEquals(-1, lRUCache.get(1));    
		lRUCache.put(1, 5); // cache is {2=6}
		lRUCache.put(1, 2); // cache is {2=6}

		

		assertEquals(2, lRUCache.get(1));    
		
		assertEquals(6, lRUCache.get(2));    

	}
	
	@Test
	public void testCache4() {
		LRUCache lRUCache = new LRUCache(2);
		
		lRUCache.put(2, 1); 
		lRUCache.put(1, 1);
		lRUCache.put(2, 3);
		lRUCache.put(4, 1);

		
		assertEquals(-1, lRUCache.get(1));    
		assertEquals(3, lRUCache.get(2));    

	}

}
