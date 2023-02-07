package Generics;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

	public static void main(String[] args) {
		Integer[] input1 = { 2, 8, 20, 3, 4 };
		Double[] input2 = { 2.7, 3.8, 5.5, 6.7, 9.7 };
		System.out.println(FindMax.array_max(input1));
		System.out.println(FindMax.array_max(input2));
	}
}

class FindMax {

	public static <T extends Comparable<T>> T array_max(T data[]) {
		T max = data[0];
		int i;
		for (i = 1; i < data.length; i++) {

			if (max.compareTo(data[i]) < 0) {
				max = data[i];
			}

		}
		return max;
	}

}
