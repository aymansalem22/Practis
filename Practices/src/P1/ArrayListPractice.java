package P1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		// Update an element using the set(int index, E e) method
		list.set(1, 4);
		// Check if an element is present using the contains(Object o) method
		System.out.println(list.contains(7));
		// Remove all elements within a given Collection using the
		// removeAll(Collection<?> c) method
		// list.removeAll(list);
		System.out.println(list);
		System.out.println("The element at index two is " + list.get(1));
		System.out.println("This size of the list is " + list.size());
		// Replace all elements using the replaceAll(UnaryOperator<E> operator)
		Collections.replaceAll(list, 3, 22);
		System.out.println(list);
	}

}
