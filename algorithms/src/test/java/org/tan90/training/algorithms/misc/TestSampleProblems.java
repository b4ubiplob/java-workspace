package org.tan90.training.algorithms.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void testmyAtoI() {
		SampleProblems sampleProblems = new SampleProblems();
		
		int num = sampleProblems.myAtoi("42");
		assertEquals(42, num);
		
		num = sampleProblems.myAtoi("    -42");
		assertEquals(-42, num);
		
		num = sampleProblems.myAtoi("4193 with words");
		assertEquals(4193, num);
		
		num = sampleProblems.myAtoi("9223372036854775808");
		assertEquals(2147483647, num);
		
		
	}
	
	@Test
	public void testContainsDuplicates() {
		SampleProblems sampleProblems = new SampleProblems();
		
		int[] arr = new int[] {1,2,3,1};
		assertTrue(sampleProblems.containsDuplicate(arr));
	}

}
