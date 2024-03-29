package P5_Collections_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println("LinkedList before removing any element " + linkedList);

		linkedList.remove();
		System.out.println("LinkedList after removing first element " + linkedList);

		linkedList.removeLast();
		System.out.println("LinkedList after removing last element " + linkedList);

		linkedList.remove(new Integer(2));
		System.out.println("LinkedList after removing first occurrence of 2. " + linkedList);

		linkedList.removeLastOccurrence(new Integer(4));
		System.out.println("LinkedList after removing the last occurrence of 4. " + linkedList);
	}
}
