package org.tan90.training.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestSortAlgorithms {
    
    @Test
    public void testQuickSort() {
        int[] arr = {4, 7, 9, 2, 3, 1, 6};
        SortAlgorithms.sort(arr);
        int[] expectedArr = {1, 2, 3, 4, 6, 7, 9};
        assertArrayEquals(expectedArr,  arr);
    }
    
    @Test
    public void testInsertionSort() {
        int[] arr = {4, 7, 9, 2, 3, 1, 6};
        SortAlgorithms.insertionSort(arr);
        int[] expectedArr = {1, 2, 3, 4, 6, 7, 9};
        assertArrayEquals(expectedArr,  arr);
    }

    
    
}
