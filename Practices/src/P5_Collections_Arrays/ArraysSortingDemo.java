package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysSortingDemo {
	public static void main(String[] args) {
		Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
		Arrays.sort(numbers);

		for (int i : numbers) {
			System.out.print(i + " ");
		}

		System.out.println();
		Integer[] numbers2 = { 10, 20, 30, 40, 90, 120, 45 };
		Arrays.sort(numbers2, 4, 7);
		for (int i : numbers2) {
			System.out.print(i + " ");
		}

		System.out.println();
		Integer[] numbers3 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
		Arrays.parallelSort(numbers3);

		for (Integer integer : numbers3) {
			System.out.print(integer + " ");
		}

	}
}
