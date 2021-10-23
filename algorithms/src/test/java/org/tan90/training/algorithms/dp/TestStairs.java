package org.tan90.training.algorithms.dp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestStairs {
	
	private int number;
	private int expected;
	
	public TestStairs(int number, int expected) {
		this.number = number;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, 1},
			{2, 2},
			{3, 3},
			{4, 5},
			{45, 1836311903}
		});
	}
	
	@Test
	public void testClimbStairs() {
		int result = new Stairs().climbStairs(number);
		
		assertEquals(expected, result);
	}

}
