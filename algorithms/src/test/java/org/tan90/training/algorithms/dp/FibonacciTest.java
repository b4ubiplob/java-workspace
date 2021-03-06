package org.tan90.training.algorithms.dp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class FibonacciTest {
	
	private int number;
	private long expected;
	
	public FibonacciTest(int number, long expected) {
		this.number = number;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{6, 8},
			{7, 13},
			{8, 21},
			{50, 12586269025L}
		});
	}
	
	@Test
	public void testFibonacci1() {
		long result = Fibonacci.fibonacci(number);
		assertEquals(expected, result);
	}
	
	

}
