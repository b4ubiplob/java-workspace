package org.tan90.training.algorithms.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.tan90.training.algortihms.greedy.Bulbs;

public class TestBulbs {
	
	@Test
	public void testGetNumberOfSwitches() {
		boolean[] bulbs = new boolean[] {false, true, false, true, true, false, true, true};
		int cost = Bulbs.getNumberOfflips(bulbs);
		assertEquals(6, cost);
		
		//[0,1,0,1,1,0,1,1]
		//[1,0,1,0,0,1,0,0] cost 1
		
		//[1,1,0,1,1,0,1,1] cost 2
		
		//[1,1,1,0,0,1,0,0] cost 3
		
		//[1,1,1,1,1,0,1,1] cost 4
		//[1,1,1,1,1,1,0,0] cost 5
		//[1,1,1,1,1,1,1,1] cost 6
	}

}
