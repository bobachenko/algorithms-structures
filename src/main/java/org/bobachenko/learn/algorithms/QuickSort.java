package org.bobachenko.learn.algorithms;

/**
 * Quick sort
 * complexity = O(N^logN)
 * @author max
 *
 */
public class QuickSort implements Sort {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length-1);
	}
	
	private void sort(int[] arr, int left, int right) {
		
		if(right-left<=0) { // if arr.size = 1
			return;
		}
		else {
			int thresholdValue = arr[right]; // set value from right element
			int thresholdPos = split(arr, left, right, thresholdValue);
			sort(arr, left, thresholdPos-1);
			sort(arr, thresholdPos+1, right);
		}
	}
	
	/**
	 * Complexity O(N)
	 */
	private int split(int[] arr, int left, int right, int threshold) {
		
		int lPtr = left-1;
		int rPtr = right;
		
		while(true) {			
			while(lPtr<arr.length && arr[++lPtr]<threshold) ; // get left element more than threshold
			while(rPtr>0 && arr[--rPtr]>threshold) ; // get right element less than threshold
			
			if(lPtr>=rPtr)
				break;
			else {
				// swap
				swap(arr, lPtr, rPtr);
			}
		}
		
		// swap right element, that we used as threshold value
		swap(arr, lPtr, right);
		
		return lPtr;
	}

	private void swap(int[] arr, int lPtr, int rPtr) {
		int tmp = arr[lPtr];
		arr[lPtr] = arr[rPtr];
		arr[rPtr] = tmp;
	}
}
