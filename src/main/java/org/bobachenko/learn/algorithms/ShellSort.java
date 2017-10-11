package org.bobachenko.learn.algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Сортировка Шелла
 * Average complexity O(N^3/2). Depends on count of elements.
 * @author max
 *
 */
public class ShellSort implements Sort {

	@Override
	public void sort(int[] array) {
		int temp;

		List<Integer> knuthSeries = getKnuthSeries(array.length);

		for (Integer h : knuthSeries) {
			for (int i = h; i < array.length; i++) {
				temp = array[i];
				int j = i;

				while (j > h - 1 && array[j - h] >= temp) {
					array[j] = array[j - h];
					j -= h;
				}
				
				array[j] = temp;
			}
			//System.out.println(Arrays.toString(array));
		}
	}

	/**
	 * Make Knuth series
	 * 
	 * @param arrSize
	 * @return
	 */
	List<Integer> getKnuthSeries(int arrSize) {
		LinkedList<Integer> result = new LinkedList<>();
		result.add(1);

		while (true) {
			int next = result.peekLast() * 3 + 1;
			if (next > arrSize)
				break;
			result.add(next);
		}

		Collections.reverse(result);
		return result;
	}
}
