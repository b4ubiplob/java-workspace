package org.tan90.training.algorithms.misc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSampleProblems {
	
	@Test
	public void testReverse() {
		SampleProblems sampleProblems = new SampleProblems();
		
		int num = sampleProblems.reverse(123);
		assertEquals(321, num);
		
		num = sampleProblems.reverse(-123);
		assertEquals(-321, num);
		
		num = sampleProblems.reverse(120);
		assertEquals(21, num);
		
		num = sampleProblems.reverse(1534236469);
		assertEquals(0, num);
		
	}

}
