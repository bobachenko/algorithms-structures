package org.bobachenko.learn.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortTest extends BaseTest {

    @Test
    void shellSortTest() {
    	execTest(new ShellSort());
    }
    
    @Test
    void mergeSortTest() {
    	execTest(new MergeSort());
    }
    
    @Test
    void insertionSortTest() {
    	execTest(new InsertionSort());
    }

    @Test
    void bubleSortTest() {
    	execTest(new BubleSort());
    }
    
    @Test
    void selectSortTest() {
    	execTest(new SelectSort());
    }    
    
    @Test
    void merge() {
    	int[] a1 = {1, 4, 7, 9};
    	int[] a2 = {2, 3, 5};
    	
    	int[] result = new MergeSort().merge(a1, a2);
    	Assert.assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 7, 9});
    	printArr(result);
    }
}