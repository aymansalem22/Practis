package P5_Collections_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo4 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(20);
		linkedList.add(2);
		linkedList.add(12);
		linkedList.add(40);
		linkedList.add(76);
		linkedList.add(41);
		linkedList.add(53);

		Collections.sort(linkedList);

		System.out.println(linkedList);
	}
}
