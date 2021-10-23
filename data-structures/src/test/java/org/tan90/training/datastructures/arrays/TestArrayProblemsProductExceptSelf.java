package org.tan90.training.datastructures.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tan90.training.datastructures.array.ArrayProblems;

@RunWith(value = Parameterized.class)
public class TestArrayProblemsProductExceptSelf {

	private int[] inputArray;
	private int[] resultArray;
	
	public TestArrayProblemsProductExceptSelf(int[] inputArray, int[] resultArray) {
		this.inputArray = inputArray;
		this.resultArray = resultArray;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new int[][][] {
			{{1,2,3,4}, {24,12,8,6}},
			{{-1,1,0,-3,3}, {0,0,9,0,0}}
		});
	}
	
	
	@Test
	public void testProductExceptSelf() {
		ArrayProblems arrayProblems = new ArrayProblems();
		int[] result = arrayProblems.productExceptSelf(inputArray);
		assertArrayEquals(resultArray, result);
	}
}
