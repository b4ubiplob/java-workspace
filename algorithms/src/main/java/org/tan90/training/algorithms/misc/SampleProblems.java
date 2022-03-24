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

	public int myAtoi(String s) {
		long num = 0;
		if (s.length() == 0) {
			return 0;
		}
		s = s.trim();
		boolean isNegative = false;
		if (s.charAt(0) == '-') {
			isNegative = true;
			s = s.substring(1);
		}
		else if (s.charAt(0) == '+') {
			isNegative = false;
			s = s.substring(1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num = (num * 10) + Character.getNumericValue(ch);
			}
			else {
				break;
			}
			
			if (num > Integer.MAX_VALUE) {
				if (isNegative) {
					num = Integer.MAX_VALUE + 1;
				}
				else {
					num = Integer.MAX_VALUE;
				}
				break;
			}
		}
		
		if (isNegative) {
			num = num * -1;
		}
		
		return (int) num;
	}
}