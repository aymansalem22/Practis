package P5_Collections_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoSearching {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(12);
		list.add(34);
		list.add(54);
		list.add(66);
		list.add(76);

		System.out.println("The minimum element in the List is: " + Collections.binarySearch(list, 222));

	}

}
