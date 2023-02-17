package P5_Collections_CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIterationDemo {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		Iterator<String> itr = list.iterator();

		list.add("Papaya");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Again getting the iterator");
		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
