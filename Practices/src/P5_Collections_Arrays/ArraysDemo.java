package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };
		int index = Arrays.binarySearch(numbers, 4);

		System.out.println("The index of element 4 in the array is " + index);

		int index2 = Arrays.binarySearch(numbers, 5, 9, 8);
		System.out.println("The index of element 8 by searching between index 5 to 9 is " + index2);

	}

}
