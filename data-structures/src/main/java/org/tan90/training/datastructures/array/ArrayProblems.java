package org.tan90.training.datastructures.array;

public class ArrayProblems {
	
	public int[] productExceptSelf(int[] nums) {
		int numberOfZeros = 0;
		int product = 1;
		int[] result = new int[nums.length];
		for (int i = 0 ; i < nums.length; i++) {
			if (nums[i] == 0) {
				numberOfZeros += 1;
			}
			else {
				product *= nums[i];
			}
		}
		
		if (numberOfZeros >= 2) {
			for (int i = 0; i < nums.length; i++) {
				result[i] = 0;
			}
		}
		else if (numberOfZeros == 1) {
			for (int i = 0; i < nums.length ;i++) {
				if (nums[i] == 0) {
					result[i] = product;
				}
				else {
					result[i] = 0;
				}
			}
		}
		else {
			for (int i = 0; i < nums.length; i++) {
				result[i] = product/nums[i];
			}
		}
		
		return result;
	}

}
