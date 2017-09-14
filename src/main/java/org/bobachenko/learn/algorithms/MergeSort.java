package org.bobachenko.learn.algorithms;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] array) {
		split(array, 0, array.length-1);
	}
	
	int[] split(int[] a, int form, int to) {
		return null;
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
