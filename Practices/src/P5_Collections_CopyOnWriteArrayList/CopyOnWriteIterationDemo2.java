package P5_Collections_CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIterationDemo2 {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.remove("Orange");
		}
		System.out.println("Again creating the iterator");
		itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
