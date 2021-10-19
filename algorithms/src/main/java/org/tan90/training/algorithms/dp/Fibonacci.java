package org.tan90.training.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	private static Map<Integer, Long> memoryMap = new HashMap<>();
	
	public static long fibonacci(int number) {
		if (number <= 2) {
			return 1;
		}
		else {
			if (memoryMap.containsKey(number) ) {
				return memoryMap.get(number);
			}
			else {
				long result = fibonacci(number - 1) + fibonacci(number - 2);
				memoryMap.put(number, result);
				return result;

			}
		}
	}

}
