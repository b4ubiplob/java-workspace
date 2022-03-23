package org.tan90.training.algorithms.misc;

public class SampleProblems {
	
	public int reverse(int x) {
		long num = 0;
		
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = x*-1;
		}
		while (x > 0) {
			int digit = x % 10;
			num = (num*10)  + digit;
			x = x/10;
			
		}
		
		if (isNegative) {
			num = num * -1;
		}
		
		if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
			return 0;
		}
		
		return (int) num;
	}

}
