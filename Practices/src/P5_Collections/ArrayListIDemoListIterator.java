package P5_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIDemoListIterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		ListIterator<Integer> listIterator = list.listIterator();

		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(
					"Next elemnt is " + listIterator.next() + " and next index is " + listIterator.nextIndex());

		}
		System.out.println("---------------------");
		// Traversing elements, the iterator is at the end at this point
		System.out.println("Backward Direction Iteration: ");
		while (listIterator.hasPrevious()) {
			System.out.println("Previous element is " + listIterator.previous() + " and previos index is "
					+ listIterator.previousIndex());
		}

	}
}
