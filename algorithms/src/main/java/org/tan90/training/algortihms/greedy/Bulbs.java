package org.tan90.training.algortihms.greedy;

public class Bulbs {
	
	
	public static int getNumberOfflips(boolean[] bulbs) {
		
		int cost = 0;
		
		for (boolean bulb : bulbs) {
			
			if (cost % 2 != 0) {
				bulb = !bulb;
			}
			
			if (!bulb) {
				cost++;
			}
			
		}
		
		return cost;
		
	}

}
