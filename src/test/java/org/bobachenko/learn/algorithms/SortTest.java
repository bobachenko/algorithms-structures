package org.bobachenko.learn.algorithms;

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
    	printArr(result);
    }
}