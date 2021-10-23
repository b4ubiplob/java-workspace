package org.tan90.training.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

	
	public static Map<String, Long> memoryMap = new HashMap<>();
	
	public static long calculate(int x, int y) {
		String key = x + "," + y;
		if (memoryMap.containsKey(key)) {
			return memoryMap.get(key);
		}
		if ( x == 1 && y == 1) {
			return 1;
		}
		else if (x == 0 || y == 0) {
			return 0;
		}
		long result = calculate(x, y -1) + calculate(x-1, y);
		memoryMap.put(key, result);
		return result;
	}
}
