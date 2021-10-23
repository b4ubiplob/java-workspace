package org.tan90.training.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Stairs {

	 private static Map<Integer, Integer> memoryMap = new HashMap<>();
		
		public int climbStairs(int n) {
			if (memoryMap.containsKey(n)) {
				return memoryMap.get(n);
			}
			if (n == 0) {
				return 1;
			}
			else if (n < 0) {
				return 0;
			}
			int result = climbStairs(n-1) + climbStairs(n-2);
			memoryMap.put(n, result);
			return result;
		}
}
