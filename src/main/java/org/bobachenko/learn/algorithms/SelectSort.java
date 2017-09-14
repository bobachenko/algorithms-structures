package org.bobachenko.learn.algorithms;

/**
 * Сортировка выбором O(n^2).
 * @author max
 *
 */
public class SelectSort implements Sort {

	@Override
	public void sort(int[] array) {

		boolean hasChange = true;

		while (hasChange) {
			hasChange = false;
			for (int i = 0; i < array.length-1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}
		}
	}
}
