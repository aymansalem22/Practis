package P5_Collections_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(9);
		list.add(76);
		list.add(29);
		list.add(75);
		list.add(9);

		System.out.println("The maximum elemnt in the List is: " + Collections.max(list));
		System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));

	}

}
