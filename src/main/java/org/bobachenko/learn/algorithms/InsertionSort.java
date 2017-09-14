package org.bobachenko.learn.algorithms;

/**
 * Сортировка вставкой O(n^2).
 * @author max
 *
 */
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			
			int comparedItem = array[i];
			int indexToInsert = i;
			
			while (indexToInsert > 0 && array[indexToInsert-1] > comparedItem) {
				array[indexToInsert] = array[indexToInsert - 1]; // shift
				indexToInsert--;
			}

			array[indexToInsert] = comparedItem; // insert
		}
	}

}
