package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysOperationsEquals {

	public static void main(String[] args) {
		Integer[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		boolean isEqual = Arrays.equals(numbers1, numbers2);

		System.out.println("Checking of two arrays are equal : " + isEqual);

	}

}
