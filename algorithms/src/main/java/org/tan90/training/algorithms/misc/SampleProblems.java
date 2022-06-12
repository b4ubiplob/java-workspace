package org.tan90.training.algorithms.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

	public boolean containsDuplicate(int[] nums) {
        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numbers);
        return (set.size() != nums.length);
    }
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int j = 0;
		for (int i = m; m < (m+n); i++) {
			nums1[i] = nums2[j]; 
			j++;
		}
		
		Arrays.sort(nums1);
        
    } 

	public List<Integer> getEvenNumbers() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		return myList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
	}

	public List<Integer> getNumbersStartingFromOne() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

		return myList.stream().map(n -> n + "")
			.filter(n -> n.startsWith("1"))
			.map(n -> Integer.parseInt(n))
			.collect(Collectors.toList());
	}

	public List<Integer> getDuplicates() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		return myList.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
	}

	public int findFirst() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Optional<Integer> number =  myList.stream().findFirst();
		if (number.isPresent()) {
			return number.get();
		}
		return 0;
	}

	public long getCount() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		return myList.stream().count();
	}

	public long getMaximumCount() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		return myList.stream().max(Integer::compare).get();
	}

	public boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		
		Map<Character, Integer> count1 = getCharacterCountMap(str1);
		Map<Character, Integer> count2 = getCharacterCountMap(str2);

		for (Map.Entry<Character, Integer> entry : count1.entrySet()) {
			if ( !(count2.containsKey(entry.getKey()) && 
					count2.get(entry.getKey()).equals(entry.getValue()))) {
				return false;
			}
		}
		return true;
	}
	
	private Map<Character, Integer> getCharacterCountMap(String str) {
		Map<Character, Integer> count1 = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (count1.containsKey(str.charAt(i))) {
				count1.put(str.charAt(i), count1.get(str.charAt(i)) + 1);
			}
			else {
				count1.put(str.charAt(i), 1);
			}
		}
		return count1;
	}
	
	public int[] findFirstAndLast(int[] arr, int target) {
		
		if (arr.length == 0 || target < arr[0] || target > arr[arr.length - 1]) {
			return new int[] {-1, -1};
		}
		
		int start = findStartPosition(arr, target);
		int end = findEndPosition(arr, target);
		
		return new int[] {start, end};
		
	}
	
	private int findStartPosition(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == target && arr[mid - 1] < target) {
				return mid;
			}
			else if (arr[mid] >= target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
		
	}
	
	private int findEndPosition(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == target && arr[mid + 1] > target) {
				return mid;
			}
			else if (arr[mid] > target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
		
	}
	
	public int kthLargest(Integer[] arr, int k) {
		if (k > arr.length) {
			return -1;
		}
		Comparator<Integer> comparator = Comparator.reverseOrder();
 		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(comparator);
 		priorityQueue.addAll(Arrays.asList(arr));
 		
 		int num  = -1;
 		for (int i = 0; i < k ;i++) {
 			num = priorityQueue.poll();
 		}
 		return num;
	}
	
	
}
