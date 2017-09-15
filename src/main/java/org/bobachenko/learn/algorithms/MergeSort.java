package org.bobachenko.learn.algorithms;


/**
 * Сортировка слиянием 
 * Complexity O(N × logN)
 * @author max
 *
 */
public class MergeSort implements Sort {

	@Override
	public void sort(int[] array) {
		int[] result = split(array, 0, array.length-1);
		System.arraycopy(result, 0, array, 0, result.length );
	}
	
	int[] split(int[] a, int from, int to) {
		if(from==to) 
			return new int[]{a[to]};		
		
		int half = (to - from) / 2;
		
		int from1 = from;
		int to1 = from + half;
		
		int from2 = to1+1;
		int to2 = to;
		
		// a couple recursive calls, firstly split then merge
		return merge(split(a, from1, to1), split(a, from2, to2));
	}

	int[] merge(int[] a1, int[] a2) {
		int fullSize = a1.length + a2.length;
		int[] result = new int[fullSize];

		int iR = 0;
		int i1 = 0;
		int i2 = 0;

		while (i1 < a1.length && i2 < a2.length) {
			if (a1[i1] < a2[i2])
				result[iR++] = a1[i1++];
			else
				result[iR++] = a2[i2++];
		}

		while (i1 < a1.length)
			result[iR++] = a1[i1++];

		while (i2 < a2.length)
			result[iR++] = a2[i2++];

		return result;
	}
}
