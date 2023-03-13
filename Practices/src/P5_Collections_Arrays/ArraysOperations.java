package P5_Collections_Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysOperations {

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(numbers);
		// list.add(44);->Exception in thread "main"
		// java.lang.UnsupportedOperationException
		System.out.println(list);

	}

}
