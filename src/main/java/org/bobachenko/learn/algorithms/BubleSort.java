package org.bobachenko.learn.algorithms;

/**
 * Сортировка пузырьком O(n^2).
 * @author max
 *
 */
public class BubleSort implements Sort {

	@Override
	public void sort(int[] array) {
		
		boolean hasChange = true;
		
		while(hasChange) {
			hasChange = false;
			for(int i=0; i<array.length-1; i++) {
				if(array[i]>array[i+1]) {
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					hasChange = true;
				}
			}			
		}
	}
}
