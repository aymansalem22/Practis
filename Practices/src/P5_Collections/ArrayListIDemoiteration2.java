package P5_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIDemoiteration2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\nIterating using forEachRemaining() method");
		Iterator<Integer> newItr = list.iterator();
		newItr.forEachRemaining(element -> System.out.print(element + " "));
	}
}
