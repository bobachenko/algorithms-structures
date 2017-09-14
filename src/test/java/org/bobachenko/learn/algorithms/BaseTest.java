package org.bobachenko.learn.algorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BaseTest {
	
	private static final int ARR_SIZE = 21;
	protected static int[] arr = new int[ARR_SIZE];
		
	protected int[] getTestData() {
		return arr.clone();
	}
	
	static {
		fillTestData();	
	}

	//@BeforeAll didn't work, I don't know why.
	private static void fillTestData() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
	}
	
	protected void validate(int[] array) {
		int last = 0;
		
		for(int i : array) {
			if(i<last) {
				printArr(array);
				Assert.fail("Array is not sorted.");
			}
			last = i;
		}
		printArr(array);
	}
	
	protected void printArr(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	protected void execTest(Sort sort) {
    	int[] array = getTestData();
    	sort.sort(array);
    	validate(array);    
	}
}
