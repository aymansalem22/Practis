package P5_Collections_Arrays;

import java.util.Arrays;

public class ArraysOperationsDefaultValue {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Arrays.fill(numbers, 20);
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
	}
}
