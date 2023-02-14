package P5_Collections;

import java.util.ArrayList;
import java.util.List;

//ClassCastException
public class ArrayListIDemoListIterator2 {
	public static void doSomeWork(List list) {
		list.add("India");
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		doSomeWork(list);
		list.add(24.5);
		System.out.println(list);

		Integer a = (Integer) list.get(2);
		Integer i = (Integer) list.get(3);

	}
}
