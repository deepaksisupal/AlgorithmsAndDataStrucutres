package algo.sort.insertion;

import java.util.Arrays;
import java.util.logging.Logger;

public class InsertionSort_1 {

	private final static Logger LOGGER = Logger.getLogger(InsertionSort_1.class.getName());
	
	public static void main(String[] args) {
		
		int[] unsorted = { 5, 2, 4, 6, 1, 3, 2 };

		LOGGER.info("Unsorted : " + Arrays.toString(unsorted));
		
		int[] sorted = doInsertionSort(unsorted);

		LOGGER.info("Sorted : " + Arrays.toString(sorted));
	}

	private static int[] doInsertionSort(int[] unsorted) {
		
		int length = unsorted.length;
		
		LOGGER.info("Unsorted Length: " + length);
		
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
