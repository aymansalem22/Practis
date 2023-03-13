package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysCopying {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] newArray = Arrays.copyOf(numbers, numbers.length);
		System.out.println("The copied array is: ");

		for (int i : newArray) {
			System.out.print(i + " ");
		}

		int[] newArraysBiggerSize = Arrays.copyOf(numbers, 20);
		System.out.println();
		System.out.println("The copied array is: ");

		for (int i : newArraysBiggerSize) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("The copied array in range: ");
		int[] newSpecficIndexArray = Arrays.copyOfRange(numbers, 0, 5);
		for (int i : newSpecficIndexArray) {
			System.out.print(i + " ");
		}

	}

}
