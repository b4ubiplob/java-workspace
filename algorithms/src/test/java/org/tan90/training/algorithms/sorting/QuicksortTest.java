package org.tan90.training.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuicksortTest {
    
    @Test
    public void testQuickSort() {
        int[] arr = {4, 7, 9, 2, 3, 1, 6};
        QuickSort.sort(arr);
        int[] expectedArr = {1, 2, 3, 4, 6, 7, 9};
        assertArrayEquals(expectedArr,  arr);
    }

}
