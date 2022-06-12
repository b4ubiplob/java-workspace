package org.tan90.training.algorithms.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

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

	@Test
	public void testGetEvenNumbers() {
		SampleProblems sampleProblems = new SampleProblems();
		List<Integer> numbers = sampleProblems.getEvenNumbers();
		assertEquals(4, numbers.size());
		assertEquals(10, (int) numbers.get(0));
	}

	@Test
	public void testGetMumbersStaringFromOne() {
		SampleProblems sampleProblems = new SampleProblems();
		List<Integer> numbers = sampleProblems.getNumbersStartingFromOne();
		assertEquals(2, numbers.size());
		assertEquals(10, (int) numbers.get(0));
	}
	
	@Test
	public void testAnagrams() {
		SampleProblems sampleProblems = new SampleProblems();
		String str1 = "nameless";
		String str2 = "salesmen";
		assertTrue(sampleProblems.isAnagram(str1, str2));
		
		str1 = "nameless";
		str2 = "salesmbn";
		assertFalse(sampleProblems.isAnagram(str1, str2));
	}
	
	@Test
	public void testFindFirstAndLast() {
		SampleProblems sampleProblems = new SampleProblems();
		int[] arr = {2,4,5,5,5,5,5,7,9,9};
		int[] result  = sampleProblems.findFirstAndLast(arr, 5);
		assertEquals(2, result.length);
		assertEquals(2, result[0]);
		assertEquals(6, result[1]);
	}
	
	@Test
	public void testKthLargest() {
		Integer[] arr = {1,2,3,4,5,6,7,7,9};
		SampleProblems sampleProblems = new SampleProblems();
		int result = sampleProblems.kthLargest(arr, 4);
		assertEquals(6, result);
		
	}
}
