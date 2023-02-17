package P5_Collections_CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		list.forEach(System.out::println);
	}
}
