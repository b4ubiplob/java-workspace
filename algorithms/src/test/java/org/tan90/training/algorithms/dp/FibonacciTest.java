package org.tan90.training.algorithms.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void testFibonacci1() {
		long result = Fibonacci.fibonacci(7);
		assertEquals(13, result);
	}
	
	@Test
	public void testFibonacci2() {
		long result = Fibonacci.fibonacci(50);
		assertEquals(12586269025L, result);
	}

}
