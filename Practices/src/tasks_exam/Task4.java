package tasks_exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(4, 3, 8, 11, 6, 12, 7, 5));
		System.out.println(separate(num));
	}

	public static ArrayList<Integer> separate(ArrayList<Integer> arr) {
		int temp = 0;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) % 2 != 0) {
				temp = arr.get(i);
				arr.remove(i);
				arr.add(index, temp);
				index++;
			}

		}

		return arr;
	}
}
