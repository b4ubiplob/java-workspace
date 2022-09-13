package org.tan90.training.algorithms.sorting;

public class SortAlgorithms {

	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int length = arr.length;
		int mid = length/2;
		
		int[] left = new int[mid];
		int[] right = new int[length - mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		
		for (int i = mid ;i < length; i++) {
			right[i - mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int leftLength = left.length;
		int rightLength = right.length;
		
		int i = 0, j = 0, k=0;
		
		while (j < leftLength && k < rightLength)  {
			if (left[j] < right[k]) {
				arr[i++] = left[j++];
			}
			else {
				arr[i++] = right[k++];
			}
		}
		
		while (j < leftLength) {
			arr[i++] = left[j++];
		}
		while (k < rightLength) {
			arr[i++] = right[k++];
		}
	}
}
