package org.tan90.training.algorithms.dp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class GridTravellerTest {
	
	private int number1;
	private int number2;
	private long expected;
	
	public GridTravellerTest(int number1, int number2, long expected) {
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,1,1},
			{2,3,3},
			{3,2,3},
			{3,3,6},
			{18,18,2333606220L}
		});
	}
	
	@Test
	public void testCalculate1() {
		long result = GridTraveller.calculate(number1, number2);
		assertEquals(expected, result);
	}

}
