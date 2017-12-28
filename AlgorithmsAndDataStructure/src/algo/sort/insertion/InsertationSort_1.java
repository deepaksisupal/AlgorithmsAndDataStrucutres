package algo.sort.insertion;

import java.util.Arrays;

public class InsertationSort_1 {

	public static void main(String[] args) {
		
		int[] unsorted = { 5, 2, 4, 6, 1, 3, 2 };

		int[] sorted = doInsertionSort(unsorted);

		System.out.println(Arrays.toString(sorted));
	}

	private static int[] doInsertionSort(int[] unsorted) {
		
		int length = unsorted.length;
		
		for (int i = 1; i < length; i++) {

			int key = unsorted[i];

			int j = i - 1;

			while (j >= 0 && unsorted[j] > key) {
				unsorted[j + 1] = unsorted[j];
				j--;
			}
			unsorted[j + 1] = key;
		}
		return unsorted;
	}

}
